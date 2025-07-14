package com.iteso.biblioteca.model;

import com.iteso.biblioteca.enums.Estado;
import com.iteso.biblioteca.enums.Idioma;
import com.iteso.biblioteca.enums.Genero;

public class Libro extends Articulo {

	private String autor;
	private String isbn;
	private Genero genero;

	public Libro(String codigo, String titulo, int añoPublicacion, String editorial, boolean disponible,
			double costoMultaDiaria, double costoReparacion, Estado estado, Idioma idioma, boolean historico,
			String autor, String isbn, Genero genero) {
		super(codigo, titulo, añoPublicacion, editorial, disponible, costoMultaDiaria, costoReparacion, estado, idioma,
				historico);
		setAutor(autor);
		setIsbn(isbn);
		setGenero(genero);
	}
	
	public Libro() {
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public String getAutor() {
		return autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public Genero getGenero() {
		return genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Libro [getCodigo()=");
		builder.append(getCodigo());
		builder.append(", getTitulo()=");
		builder.append(getTitulo());
		builder.append(", getAñoPublicacion()=");
		builder.append(getAñoPublicacion());
		builder.append(", getEditorial()=");
		builder.append(getEditorial());
		builder.append(", isDisponible()=");
		builder.append(isDisponible());
		builder.append(", getCostoMultaDiaria()=");
		builder.append(getCostoMultaDiaria());
		builder.append(", getCostoReparacion()=");
		builder.append(getCostoReparacion());
		builder.append(", getEstado()=");
		builder.append(getEstado());
		builder.append(", getIdioma()=");
		builder.append(getIdioma());
		builder.append(", isHistorico()=");
		builder.append(isHistorico());
		builder.append(", esPrestable()=");
		builder.append(esPrestable());
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}

	
}
