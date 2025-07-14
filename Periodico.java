package com.iteso.biblioteca.model;
import com.fasterxml.jackson.databind.JsonNode;
import java.time.LocalDate;



public class Periodico extends Articulo {
    private String issn;
    private LocalDate fechaPublicacion;
    private String seccionPrincipal;
    private String paisOrigen;

    public Periodico(JsonNode json) {
        super(json);
        this.issn = json.get("issn").asText();
        this.fechaPublicacion = LocalDate.parse(json.get("fechaPublicacion").asText());
        this.seccionPrincipal = json.get("seccionPrincipal").asText();
        this.paisOrigen = json.get("paisOrigen").asText();
    }

    @Override
    public String toString() {
        return "Periodico{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", issn='" + issn + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", seccionPrincipal='" + seccionPrincipal + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
