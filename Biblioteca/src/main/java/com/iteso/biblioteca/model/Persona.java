package com.iteso.biblioteca.model;

import com.iteso.biblioteca.enums.Permiso;
import java.time.LocalDate;

public abstract class Persona {
	private String numeroCredencial;
	private String nombre;
	private String correoElectronico;
	private String telefono;
	private LocalDate fechaRegistro;

	public Persona() {
	}

	public Persona(String numeroCredencial, String nombre, String correoElectronico, String telefono) {
		setNúmeroCredencial(numeroCredencial);
		setNombre(nombre);
		setCorreoElectronico(correoElectronico);
		setTelefono(telefono);
		setFechaRegistro();
	}

	public void setNúmeroCredencial(String numeroCredencial) {
		this.numeroCredencial = numeroCredencial;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toUpperCase();
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico.toUpperCase();
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFechaRegistro() {
		this.fechaRegistro = LocalDate.now();
		;
	}

	public String getNumeroCredencial() {
		return numeroCredencial;
	}

	public String getNombre() {
		return nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public String getTelefono() {
		return telefono;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public abstract Permiso getNivelPermiso();

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"numeroCredencial\":\"");
		builder.append(getNumeroCredencial());
		builder.append("\", \"nombre\":\"");
		builder.append(getNombre());
		builder.append("\", \"correoElectronico\":\"");
		builder.append(getCorreoElectronico());
		builder.append("\", \"telefono\":\"");
		builder.append(getTelefono());
		builder.append("\", \"fechaRegistro\":\"");
		builder.append(getFechaRegistro());
		builder.append("\"}");
		return builder.toString();
	}

}
