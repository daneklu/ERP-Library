package com.iteso.biblioteca.model;

import java.time.LocalDate;
import com.iteso.biblioteca.enums.EstadoPrestamo;
import com.iteso.biblioteca.enums.Estado;

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
				multa += diasRetraso * articulo.getCostoMultaDiaria();
			}
		}
		if (dañado) {
			multa += articulo.getCostoReparacion();
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
			articulo.setEstado(Estado.DETERIORADO);
			setEstadoPrestamo(EstadoPrestamo.DEVUELTO_DAÑADO);
		} else if (conRetraso) {
			setEstadoPrestamo(EstadoPrestamo.DEVUELTO_CON_RETRASO);
		} else {
			setEstadoPrestamo(EstadoPrestamo.DEVUELTO_A_TIEMPO);
		}

	}

	public String getIdPrestamo() {
		return idPrestamo;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public Empleado getEmpleadoRegistrador() {
		return empleadoRegistrador;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public LocalDate getFechaPrestamo() {
		return fechaPrestamo;
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public LocalDate getFechaDevolucion() {
		return fechaDevolucion;
	}

	public EstadoPrestamo getEstado() {
		return estado;
	}

	public double getMultaGenerada() {
		return multaGenerada;
	}

}
