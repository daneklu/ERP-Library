package com.iteso.biblioteca.model;

import com.fasterxml.jackson.databind.JsonNode;

public class Revista extends Articulo {
    private int numeroEdicion;
    private String mesPublicacion;
    private String issn;
    private TematicaRevista tematica;

    public enum TematicaRevista {
        TECNOLOGIA, NEGOCIOS, JARDINERIA
    }

    public Revista() {
        super();
    }

    public Revista(JsonNode json) {
        super(json);
        this.issn = json.get("issn").asText();
        this.numeroEdicion = json.get("numeroEdicion").asInt();
        this.mesPublicacion = json.get("mesPublicacion").asText();
        this.tematica = TematicaRevista.valueOf(json.get("tematica").asText());
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    public String getMesPublicacion() {
        return mesPublicacion;
    }

    public void setMesPublicacion(String mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    public TematicaRevista getTematica() {
        return tematica;
    }

    public void setTematica(TematicaRevista tematica) {
        this.tematica = tematica;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", issn='" + issn + '\'' +
                ", numeroEdicion=" + numeroEdicion +
                ", mesPublicacion='" + mesPublicacion + '\'' +
                ", tematica=" + tematica +
                '}';
    }
}
