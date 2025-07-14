package com.iteso.biblioteca.model;

import com.iteso.biblioteca.enums.Estado;
import com.iteso.biblioteca.enums.Idioma;
import com.iteso.biblioteca.enums.TematicaRevista;

public class Revista extends Articulo {
	private String issn;
	private int numeroEdicion;
	private String mesPublicacion;
	private TematicaRevista tematica;

	public Revista() {
	}

	public Revista(String codigo, String titulo, int añoPublicacion, String editorial, boolean disponible,
			double costoMultaDiaria, double costoReparacion, Estado estado, Idioma idioma, boolean historico,
			String issn, int numeroEdicion, String mesPublicacion, TematicaRevista tematica) {
		super(codigo, titulo, añoPublicacion, editorial, disponible, costoMultaDiaria, costoReparacion, estado, idioma,
				historico);
		setIssn(issn);
		setNumeroEdicion(numeroEdicion);
		setMesPublicacion(mesPublicacion);
		setTematica(tematica);
	}

	public String getIssn() {
		return issn;
	}

	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	public String getMesPublicacion() {
		return mesPublicacion;
	}

	public TematicaRevista getTematica() {
		return tematica;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	public void setMesPublicacion(String mesPublicacion) {
		this.mesPublicacion = mesPublicacion;
	}

	public void setTematica(TematicaRevista tematica) {
		this.tematica = tematica;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Revista [getCodigo()=");
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
		builder.append(", issn=");
		builder.append(issn);
		builder.append(", numeroEdicion=");
		builder.append(numeroEdicion);
		builder.append(", mesPublicacion=");
		builder.append(mesPublicacion);
		builder.append(", tematica=");
		builder.append(tematica);
		builder.append("]");
		return builder.toString();
	}
	
}
