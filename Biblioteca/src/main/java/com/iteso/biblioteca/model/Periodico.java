package com.iteso.biblioteca.model;

import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Pattern;

public class Periodico extends Articulo {
    private String issn;
    private LocalDate fechaPublicacion;
    private String seccionPrincipal;
    private String paisOrigen;
    
    private static final Pattern ISSN_PATTERN = Pattern.compile("^\\d{4}-\\d{4}$");
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public Periodico() {
        super();
    }

    public Periodico(JsonNode json) {
        super(json);
        
        if (json == null) {
            throw new IllegalArgumentException("El JsonNode no puede ser null");
        }
        
        if (json.has("issn") && !json.get("issn").isNull()) {
            setIssn(json.get("issn").asText());
        } else {
            throw new IllegalArgumentException("El campo 'issn' es requerido");
        }
        
        if (json.has("fechaPublicacion") && !json.get("fechaPublicacion").isNull()) {
            try {
                String fechaStr = json.get("fechaPublicacion").asText();
                setFechaPublicacion(LocalDate.parse(fechaStr, DATE_FORMATTER));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException("Formato de fecha inválido. Use yyyy-MM-dd", e);
            }
        } else {
            throw new IllegalArgumentException("El campo 'fechaPublicacion' es requerido");
        }
        
        if (json.has("seccionPrincipal") && !json.get("seccionPrincipal").isNull()) {
            setSeccionPrincipal(json.get("seccionPrincipal").asText());
        } else {
            throw new IllegalArgumentException("El campo 'seccionPrincipal' es requerido");
        }
        
        if (json.has("paisOrigen") && !json.get("paisOrigen").isNull()) {
            setPaisOrigen(json.get("paisOrigen").asText());
        } else {
            throw new IllegalArgumentException("El campo 'paisOrigen' es requerido");
        }
    }

    public Periodico(String codigo, String titulo, String issn, LocalDate fechaPublicacion, 
                    String seccionPrincipal, String paisOrigen) {
        super(codigo, titulo); 
        setIssn(issn);
        setFechaPublicacion(fechaPublicacion);
        setSeccionPrincipal(seccionPrincipal);
        setPaisOrigen(paisOrigen);
    }

    // Getters
    public String getIssn() {
        return issn;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getSeccionPrincipal() {
        return seccionPrincipal;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setIssn(String issn) {
        if (issn == null || issn.trim().isEmpty()) {
            throw new IllegalArgumentException("El ISSN no puede ser null o vacío");
        }
        
        String issnTrimmed = issn.trim();
        if (!ISSN_PATTERN.matcher(issnTrimmed).matches()) {
            throw new IllegalArgumentException("El ISSN debe tener el formato 1234-5678");
        }
        
        this.issn = issnTrimmed;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        if (fechaPublicacion == null) {
            throw new IllegalArgumentException("La fecha de publicación no puede ser null");
        }
        
        if (fechaPublicacion.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de publicación no puede ser futura");
        }
        
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setSeccionPrincipal(String seccionPrincipal) {
        if (seccionPrincipal == null || seccionPrincipal.trim().isEmpty()) {
            throw new IllegalArgumentException("La sección principal no puede ser null o vacía");
        }
        
        this.seccionPrincipal = seccionPrincipal.trim();
    }

    public void setPaisOrigen(String paisOrigen) {
        if (paisOrigen == null || paisOrigen.trim().isEmpty()) {
            throw new IllegalArgumentException("El país de origen no puede ser null o vacío");
        }
        
        this.paisOrigen = paisOrigen.trim();
    }

    public static boolean isValidIssn(String issn) {
        return issn != null && ISSN_PATTERN.matcher(issn.trim()).matches();
    }

    public long getAntiguedadEnDias() {
        if (fechaPublicacion == null) {
            return 0;
        }
        return java.time.temporal.ChronoUnit.DAYS.between(fechaPublicacion, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", issn='" + issn + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", seccionPrincipal='" + seccionPrincipal + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        
        Periodico periodico = (Periodico) obj;
        return issn != null ? issn.equals(periodico.issn) : periodico.issn == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (issn != null ? issn.hashCode() : 0);
        return result;
    }
}