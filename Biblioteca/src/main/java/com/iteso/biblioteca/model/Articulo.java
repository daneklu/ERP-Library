package com.iteso.biblioteca.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.iteso.biblioteca.Biblioteca;
import com.iteso.biblioteca.enums.Genero;
import com.iteso.biblioteca.enums.TematicaRevista;
import com.iteso.biblioteca.enums.Estado;
import com.iteso.biblioteca.enums.Idioma;

public abstract class Articulo extends Biblioteca {
    protected String codigo;
    protected String titulo;
    protected int anoPublicacion;
    protected String editorial;
    protected boolean disponible;
    protected double costoMultaDiaria;
    protected Estado estado;
    protected Idioma idioma;
    protected boolean historico;
    protected double costoReparacion;

    public Articulo() {
        this.disponible = true;
        this.historico = false;
        this.estado = Estado.BUENO;
        this.costoMultaDiaria = 0.0;
        this.costoReparacion = 0.0;
    }

    public Articulo(String codigo, String titulo) {
        this(); 
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public Articulo(JsonNode json) {
        if (json == null) {
            throw new IllegalArgumentException("El JsonNode no puede ser null");
        }

        if (json.has("titulo") && !json.get("titulo").isNull()) {
            this.titulo = json.get("titulo").asText();
        } else {
            throw new IllegalArgumentException("El campo 'titulo' es requerido");
        }

        this.codigo = json.has("codigo") && !json.get("codigo").isNull() 
            ? json.get("codigo").asText() 
            : generadorCodigo(this.titulo);

        if (json.has("anoPublicacion") && !json.get("anoPublicacion").isNull()) {
            this.anoPublicacion = json.get("anoPublicacion").asInt();
        } else {
            throw new IllegalArgumentException("El campo 'anoPublicacion' es requerido");
        }

        if (json.has("editorial") && !json.get("editorial").isNull()) {
            this.editorial = json.get("editorial").asText();
        } else {
            throw new IllegalArgumentException("El campo 'editorial' es requerido");
        }

        this.disponible = json.has("disponible") && !json.get("disponible").isNull() 
            ? json.get("disponible").asBoolean() : true;

        this.costoMultaDiaria = json.has("costoMultaDiaria") && !json.get("costoMultaDiaria").isNull() 
            ? json.get("costoMultaDiaria").asDouble() : 0.0;

        this.costoReparacion = json.has("costoReparacion") && !json.get("costoReparacion").isNull() 
            ? json.get("costoReparacion").asDouble() : 0.0;

        this.historico = json.has("historico") && !json.get("historico").isNull() 
            ? json.get("historico").asBoolean() : false;

        if (json.has("estado") && !json.get("estado").isNull()) {
            try {
                this.estado = Estado.valueOf(json.get("estado").asText().toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Estado inválido: " + json.get("estado").asText(), e);
            }
        } else {
            this.estado = Estado.BUENO;
        }

        if (json.has("idioma") && !json.get("idioma").isNull()) {
            try {
                this.idioma = Idioma.valueOf(json.get("idioma").asText().toUpperCase());
            } catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Idioma inválido: " + json.get("idioma").asText(), e);
            }
        } else {
            this.idioma = Idioma.ESPANOL;
        }
    }

    protected String generadorCodigo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser null o vacío para generar el código");
        }

        String prefix = this.getClass().getSimpleName().substring(0, 3).toUpperCase();
        String titlePart = titulo.replaceAll("\\s+", "").length() >= 3 
            ? titulo.replaceAll("\\s+", "").substring(0, 3).toUpperCase()
            : titulo.replaceAll("\\s+", "").toUpperCase();
        
        return prefix + "-" + titlePart + "-" + System.currentTimeMillis();
    }

    public boolean esPrestable() {
        return disponible && !historico && estado != Estado.PERDIDO && estado != Estado.DANADO;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public String getEditorial() {
        return editorial;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public double getCostoMultaDiaria() {
        return costoMultaDiaria;
    }

    public Estado getEstado() {
        return estado;
    }

    public Idioma getIdioma() {
        return idioma;
    }

    public boolean isHistorico() {
        return historico;
    }

    public double getCostoReparacion() {
        return costoReparacion;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            throw new IllegalArgumentException("El código no puede ser null o vacío");
        }
        this.codigo = codigo.trim();
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no puede ser null o vacío");
        }
        this.titulo = titulo.trim();
    }

    public void setAnoPublicacion(int anoPublicacion) {
        int currentYear = java.time.Year.now().getValue();
        if (anoPublicacion < 1000 || anoPublicacion > currentYear) {
            throw new IllegalArgumentException("El año de publicación debe estar entre 1000 y " + currentYear);
        }
        this.anoPublicacion = anoPublicacion;
    }

    public void setEditorial(String editorial) {
        if (editorial == null || editorial.trim().isEmpty()) {
            throw new IllegalArgumentException("La editorial no puede ser null o vacía");
        }
        this.editorial = editorial.trim();
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCostoMultaDiaria(double costoMultaDiaria) {
        if (costoMultaDiaria < 0) {
            throw new IllegalArgumentException("El costo de multa diaria no puede ser negativo");
        }
        this.costoMultaDiaria = costoMultaDiaria;
    }

    public void setCostoReparacion(double costoReparacion) {
        if (costoReparacion < 0) {
            throw new IllegalArgumentException("El costo de reparación no puede ser negativo");
        }
        this.costoReparacion = costoReparacion;
    }

    public void setIdioma(Idioma idioma) {
        if (idioma == null) {
            throw new IllegalArgumentException("El idioma no puede ser null");
        }
        this.idioma = idioma;
    }

    public void setHistorico(boolean historico) {
        this.historico = historico;
    }

    public void setEstado(Estado estado) {
        if (estado == null) {
            throw new IllegalArgumentException("El estado no puede ser null");
        }
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacion=" + anoPublicacion +
                ", editorial='" + editorial + '\'' +
                ", disponible=" + disponible +
                ", costoMultaDiaria=" + costoMultaDiaria +
                ", estado=" + estado +
                ", idioma=" + idioma +
                ", historico=" + historico +
                ", costoReparacion=" + costoReparacion +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Articulo articulo = (Articulo) obj;
        return codigo != null ? codigo.equals(articulo.codigo) : articulo.codigo == null;
    }

    @Override
    public int hashCode() {
        return codigo != null ? codigo.hashCode() : 0;
    }
}