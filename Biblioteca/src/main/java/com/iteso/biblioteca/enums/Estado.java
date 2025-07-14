package com.iteso.biblioteca.enums;

public enum Estado {
    BUENO("Bueno", "El artículo está en buen estado"),
    DANADO("Dañado", "El artículo presenta daños"),
    PERDIDO("Perdido", "El artículo se encuentra perdido"),
    DETERIORADO("Deteriorado", "El artículo está deteriorado por uso normal");

    private final String nombre;
    private final String descripcion;

    Estado(String nombre, String descripcion) {
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