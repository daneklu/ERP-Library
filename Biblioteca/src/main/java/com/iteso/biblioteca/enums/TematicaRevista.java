package com.iteso.biblioteca.enums;

public enum TematicaRevista {
    TECNOLOGIA("Tecnología", "Revistas sobre tecnología"),
    NEGOCIOS("Negocios", "Revistas de negocios y finanzas"),
    JARDINERIA("Jardinería", "Revistas sobre jardinería y plantas");

    private final String nombre;
    private final String descripcion;

    TematicaRevista(String nombre, String descripcion) {
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
