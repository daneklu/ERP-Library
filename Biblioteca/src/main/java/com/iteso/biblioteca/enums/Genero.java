package com.iteso.biblioteca.enums;

public enum Genero {
    POESIA("Poesía", "Literatura poética"),
    MATEMATICAS("Matemáticas", "Ciencias matemáticas"),
    CIENCIA_FICCION("Ciencia Ficción", "Literatura de ciencia ficción");

    private final String nombre;
    private final String descripcion;

    Genero(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
