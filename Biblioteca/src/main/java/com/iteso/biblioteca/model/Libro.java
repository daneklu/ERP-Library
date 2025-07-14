package com.iteso.biblioteca.model;

import com.fasterxml.jackson.databind.JsonNode;
import com.iteso.biblioteca.enums.Genero;

public class Libro extends Articulo {
    private String autor;
    private String isbn;
    private Genero genero;

    public Libro() {
        super();
    }

    public Libro(JsonNode json) {
        super(json);
        this.autor = json.get("autor").asText();
        this.isbn = json.get("isbn").asText();
        this.genero = Genero.valueOf(json.get("genero").asText());
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + getCodigo() + '\'' +
                ", titulo='" + getTitulo() + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genero=" + genero +
                '}';
    }
}
