package com.iteso.biblioteca.model;

import java.time.LocalDate;
import com.iteso.biblioteca.enums.Estado;
import com.iteso.biblioteca.enums.Idioma;

public class Periodico extends Articulo {
	private String issn;
	private LocalDate fechaPublicacion;
	private String seccionPrincipal;
	private String paisOrigen;

	public Periodico() {
	}

	public Periodico(String codigo, String titulo, int añoPublicacion, String editorial, boolean disponible,
			double costoMultaDiaria, double costoReparacion, Estado estado, Idioma idioma, boolean historico,
			String issn, LocalDate fechaPublicacion, String seccionPrincipal, String paisOrigen) {
		super(codigo, titulo, añoPublicacion, editorial, disponible, costoMultaDiaria, costoReparacion, estado, idioma,
				historico);

		setIssn(issn);
		setFechaPublicacion(fechaPublicacion);
		setPaisOrigen(paisOrigen);
	}

	public String getIssn() {
		return issn;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getSeccionPrincipal() {
		return seccionPrincipal;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public void setSeccionPrincipal(String seccionPrincipal) {
		this.seccionPrincipal = seccionPrincipal;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Periodico [getCodigo()=");
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
		builder.append(", fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append(", seccionPrincipal=");
		builder.append(seccionPrincipal);
		builder.append(", paisOrigen=");
		builder.append(paisOrigen);
		builder.append("]");
		return builder.toString();
	}

	
}
