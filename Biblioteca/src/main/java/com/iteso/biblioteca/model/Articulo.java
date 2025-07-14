package com.iteso.biblioteca.model;

import com.iteso.biblioteca.enums.Estado;
import com.iteso.biblioteca.enums.Idioma;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({ @JsonSubTypes.Type(value = Libro.class, name = "libro"),
		@JsonSubTypes.Type(value = Revista.class, name = "revista"),
		@JsonSubTypes.Type(value = Periodico.class, name = "periodico") })

public abstract class Articulo {
	private String codigo;
	private String titulo;
	private int añoPublicacion;
	private String editorial;
	private boolean disponible;
	private double costoMultaDiaria;
	private double costoReparacion;
	private Estado estado;
	private Idioma idioma;
	private boolean historico;

	public Articulo(String codigo, String titulo, int añoPublicacion, String editorial, boolean disponible,
			double costoMultaDiaria, double costoReparacion, Estado estado, Idioma idioma, boolean historico) {
		setCodigo(codigo);
		setTitulo(titulo);
		setAñoPublicacion(añoPublicacion);
		setEditorial(editorial);
		setDisponible(disponible);
		setCostoMultaDiaria(costoMultaDiaria);
		setEstado(estado);
		setIdioma(idioma);
		setHistorico(historico);
	}
	
	public Articulo() {
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public void setCostoMultaDiaria(double costoMultaDiaria) {
		this.costoMultaDiaria = costoMultaDiaria;
	}

	public void setCostoReparacion(double costoReparacion) {
		this.costoReparacion = costoReparacion;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public void setIdioma(Idioma idioma) {
		this.idioma = idioma;
	}

	public void setHistorico(boolean historico) {
		this.historico = historico;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public String getEditorial() {
		return editorial;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public double getCostoMultaDiaria() {
		return costoMultaDiaria;
	}

	public double getCostoReparacion() {
		return costoReparacion;
	}

	public Estado getEstado() {
		return estado;
	}

	public Idioma getIdioma() {
		return idioma;
	}

	public boolean isHistorico() {
		return historico;
	}

	public boolean esPrestable() {
		return disponible && !historico && estado != Estado.PERDIDO;
	}

}
