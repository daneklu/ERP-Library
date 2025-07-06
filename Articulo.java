
import com.fasterxml.jackson.databind.JsonNode;



enum Genero {
    POESIA,
    MATEMATICAS,
    CIENCIA_FICCION
}

enum TematicaRevista {
    TECNOLOGIA,
    NEGOCIOS,
    JARDINERIA
}

enum Estado {
	BUENO, DANADO, PERDIDO
}

enum Idioma {
    ESPANOL,
    INGLES,
    FRANCES,
    ALEMAN
}


public abstract class Articulo {
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

    public Articulo(JsonNode json) {
        this.codigo = json.has("codigo") ? json.get("codigo").asText() : generadorCodigo(json);
        this.titulo = json.get("titulo").asText();
        this.anoPublicacion = json.get("anoPublicacion").asInt();
        this.editorial = json.get("editorial").asText();
        this.disponible = json.get("disponible").asBoolean();
        this.costoMultaDiaria = json.get("costoMultaDiaria").asDouble();
        this.estado = Estado.valueOf(json.get("estado").asText());
        this.idioma = Idioma.valueOf(json.get("idioma").asText());
        this.historico = json.get("historico").asBoolean();
        this.costoReparacion = json.get("costoReparacion").asDouble();
    }

    protected String generadorCodigo(JsonNode json) {
        String prefix = this.getClass().getSimpleName().substring(0, 3).toUpperCase();
        String titlePart = titulo.replaceAll("\\s+", "").substring(0, 3).toUpperCase();
        return prefix + "-" + titlePart + "-" + System.currentTimeMillis();
    }

    public boolean esPrestable() {
        return disponible && !historico && estado != Estado.PERDIDO;
    }
}
