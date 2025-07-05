package com.iteso.biblioteca.model;

import com.iteso.biblioteca.enums.Permiso;

public class Usuario extends Persona {
	private double multasPendientes;
	private boolean investigadorAutorizado;

	public Usuario() {
	}

	public Usuario(String númeroCredencial, String nombre, String correoElectronico, String telefono,
			boolean InvestigadorAutorizado) {
		super(númeroCredencial, nombre, correoElectronico, telefono);
		setInvestigadorAutorizado(investigadorAutorizado);
	}

	public void setMultasPendientes(double multasPendientes) {
		this.multasPendientes = multasPendientes;
	}

	public void setInvestigadorAutorizado(boolean investigadorAutorizado) {
		this.investigadorAutorizado = investigadorAutorizado;
	}

	public double getMultasPendientes() {
		return multasPendientes;
	}

	public boolean isInvestigadorAutorizado() {
		return investigadorAutorizado;
	}

	@Override
	public Permiso getNivelPermiso() {
		return Permiso.CONSULTA;
	}

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
		builder.append("\", \"multasPendientes\":");
		builder.append(multasPendientes);
		builder.append(", \"investigadorAutorizado\":");
		builder.append(investigadorAutorizado);
		builder.append("}");
		return builder.toString();
	}

}
