package com.iteso.biblioteca.enums;

public enum Idioma {
	    ESPAÑOL("Español", "ES"),
	    INGLES("Inglés", "EN"),
	    FRANCES("Francés", "FR"),
	    ALEMAN("Alemán", "DE");

	    private final String nombre;
	    private final String codigo;

	    Idioma(String nombre, String codigo) {
	        this.nombre = nombre;
	        this.codigo = codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    @Override
	    public String toString() {
	        return nombre;
	    }
}