package com.iteso.biblioteca.model;
import com.fasterxml.jackson.databind.JsonNode;

public class Revista extends Articulo {
    private String issn;
    private int numeroEdicion;
    private String mesPublicacion;
    private TematicaRevista tematica;
    public enum TematicaRevista {
        TECNOLOGIA, NEGOCIOS, JARDINERIA
    }
    public Revista(JsonNode json) {
        super(json);
        this.issn = json.get("issn").asText();
        this.numeroEdicion = json.get("numeroEdicion").asInt();
        this.mesPublicacion = json.get("mesPublicacion").asText();
        this.tematica = TematicaRevista.valueOf(json.get("tematica").asText());
    }

    @Override
    public String toString() {
        return "Revista{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", issn='" + issn + '\'' +
                ", numeroEdicion=" + numeroEdicion +
                ", mesPublicacion='" + mesPublicacion + '\'' +
                ", tematica=" + tematica +
                '}';
    }
}

