package com.iteso.biblioteca.model;

import com.iteso.biblioteca.enums.*;

public class Empleado extends Persona {
	private Puesto puesto;
	private Departamento departamento;
	private Permiso nivelPermiso;

	public Empleado() {
	}

	public Empleado(String númeroCredencial, String nombre, String correoElectronico, String telefono, Puesto puesto) {
		super(númeroCredencial, nombre, correoElectronico, telefono);
		setPuesto(puesto);
		setDepartamento();
		setNivelPermiso();
	}

	public void setPuesto(Puesto puesto) {
		this.puesto = puesto;
	}

	public void setDepartamento() {
		switch (puesto) {
		case ARCHIVISTA:
		case CONSERVADOR:
		case RESTAURADOR: {
			this.departamento = Departamento.HISTORICOS;
		}
			break;
		case CATALOGADOR: {
			this.departamento = Departamento.ADQUISICIONES;
		}
			break;
		case ADMINISTRADOR_SISTEMAS: {
			this.departamento = Departamento.TECNOLOGIA;
		}
			break;
		case DIRECTOR:
		case SUPERVISOR: {
			this.departamento = Departamento.ADMINISTRACION;
		}
			break;
		default: {
			this.departamento = Departamento.ATENCION_PUBLICO;
		}
			break;
		}
	}

	public void setNivelPermiso() {
		switch (puesto) {
		case ASISTENTE_BIBLIOTECA: {
			this.nivelPermiso = Permiso.BAJO;
		}
			break;
		case BIBLIOTECARIO:
		case REFERENCIA: {
			this.nivelPermiso = Permiso.MEDIO;
		}
			break;
		case ARCHIVISTA:
		case CATALOGADOR:
		case CONSERVADOR:
		case RESTAURADOR: {
			this.nivelPermiso = Permiso.ALTO;
		}
			break;
		default: {
			this.nivelPermiso = Permiso.ADMIN;
		}
			break;
		}
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	@Override
	public Permiso getNivelPermiso() {
		return nivelPermiso;
	}

	public boolean puedeManejarHistoricos() {
		return (nivelPermiso == Permiso.ALTO || nivelPermiso == Permiso.ADMIN);
	}

	public Puesto getPuesto() {
		return puesto;
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
		builder.append("\", \"puesto\":\"");
		builder.append(puesto);
		builder.append("\", \"departamento\":\"");
		builder.append(departamento);
		builder.append("\", \"nivelPermiso\":\"");
		builder.append(nivelPermiso);
		builder.append("\"}");
		return builder.toString();
	}

}
