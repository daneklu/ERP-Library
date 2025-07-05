package com.iteso.biblioteca.model;

import java.time.LocalDate;
import com.iteso.biblioteca.enums.EstadoPrestamo;

public class Prestamo {
	private String idPrestamo;
	private Articulo articulo;
	private Empleado empleadoRegistrador;
	private Usuario usuario;
	private LocalDate fechaPrestamo;
	private LocalDate fechaVencimiento;
	private LocalDate fechaDevolucion;
	private EstadoPrestamo estado;
	private double multaGenerada = 0.0;

	public Prestamo() {
	}

	public Prestamo(Articulo articulo, Empleado empleado, Usuario usuario) {
		setIdPrestamo();
		setArticulo(articulo);
		setEmpleadoRegistrador(empleado);
		setUsuario(usuario);
		setFechaPrestamo();
		setFechaVencimiento();
		setEstadoPrestamo(EstadoPrestamo.ACTIVO);
	}

	private String setIdPrestamo() {
		return "PR-" + LocalDate.EPOCH;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}

	public void setEmpleadoRegistrador(Empleado empleadoRegistrador) {
		this.empleadoRegistrador = empleadoRegistrador;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setFechaPrestamo() {
		this.fechaPrestamo = LocalDate.now();
	}

	public void setFechaVencimiento() {
		this.fechaVencimiento = fechaPrestamo.plusDays(14);
	}

	public void setFechaDevolucion() {
		this.fechaDevolucion = LocalDate.now();
	}

	public void setEstadoPrestamo(EstadoPrestamo estado) {
		this.estado = estado;
	}

	public void CalcularMulta(boolean dañado, boolean conRetraso) {
		double multa = 0.0;
		if (conRetraso) {
			long diasDevolucion = fechaDevolucion.toEpochDay();
			long diasVencimiento = fechaVencimiento.toEpochDay();
			long diasRetraso = diasDevolucion - diasVencimiento;
			if (diasRetraso > 0) {
				multa += diasRetraso * articulo.getCostoMultaDiaria(); // Debe adaptarse a como este estructurada la
																		// clase articulo
			}
		}
		if (dañado) {
			multa += articulo.getCostoReparacion(); // Debe adaptarse a la clase articulo
		}
		this.multaGenerada = multa;
		usuario.setMultasPendientes(usuario.getMultasPendientes() + multa);
	}

	public void registrarDevolucion(boolean dañado) {
		setFechaDevolucion();
		boolean conRetraso = fechaDevolucion.isAfter(fechaVencimiento);
		if (conRetraso || dañado) {
			CalcularMulta(dañado, conRetraso);
		}
		if (dañado) {
			articulo.setEstado(Estado.DETERIORADO);// Depende como este hecha la clase
			// Articulo y el enum, esta linea debe adaptarse
			setEstadoPrestamo(EstadoPrestamo.DEVUELTO_DAÑADO);
		} else if (conRetraso) {
			setEstadoPrestamo(EstadoPrestamo.DEVUELTO_CON_RETRASO);
		} else {
			setEstadoPrestamo(EstadoPrestamo.DEVUELTO_A_TIEMPO);
		}

	}

	// Falta la clase articulo

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("{\"idPrestamo\":\"");
		builder.append(idPrestamo);
		builder.append("\", \"empleadoRegistrador\":\"");
		builder.append(empleadoRegistrador);
		builder.append("\", \"usuario\":\"");
		builder.append(usuario);
		builder.append("\", \"fechaPrestamo\":\"");
		builder.append(fechaPrestamo);
		builder.append("\", \"fechaVencimiento\":\"");
		builder.append(fechaVencimiento);
		builder.append("\", \"fechaDevolucion\":\"");
		builder.append(fechaDevolucion);
		builder.append("\", \"estado\":\"");
		builder.append(estado);
		builder.append("\", \"multaGenerada\":");
		builder.append(multaGenerada);
		builder.append("}");
		return builder.toString();
	}

}
