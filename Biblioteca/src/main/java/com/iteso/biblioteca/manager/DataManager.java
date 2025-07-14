package com.iteso.biblioteca.manager;

import com.iteso.biblioteca.model.Articulo;
import com.iteso.biblioteca.model.Empleado;
import com.iteso.biblioteca.model.Prestamo;
import com.iteso.biblioteca.model.Usuario;
import com.iteso.biblioteca.util.JsonManager;
import java.util.ArrayList;

public class DataManager {
	// Rutas de archivos
	private static final String PERSONAL_JSON = "personal.json";
	private static final String USUARIOS_JSON = "usuarios.json";
	private static final String PRESTAMOS_ACTIVOS_JSON = "prestamos_activos.json";
	private static final String HISTORIAL_PRESTAMOS_JSON = "historial_prestamos.json";
	private static final String INVENTARIO_JSON = "inventario.json";
	
	// Listas de datos como ArrayList
	private final ArrayList<Empleado> personal;
	private final ArrayList<Usuario> usuarios;
	private final ArrayList<Articulo> inventario;
	private final ArrayList<Prestamo> prestamosActivos;
	private final ArrayList<Prestamo> historialPrestamos;

	private static DataManager instance;

	private DataManager() {
		// Cargar datos al inicializar
		personal = cargarDatos(PERSONAL_JSON, Empleado.class);
		usuarios = cargarDatos(USUARIOS_JSON, Usuario.class);
		prestamosActivos = cargarDatos(PRESTAMOS_ACTIVOS_JSON, Prestamo.class);
		historialPrestamos = cargarDatos(HISTORIAL_PRESTAMOS_JSON, Prestamo.class);
		inventario = cargarDatosArticulos(INVENTARIO_JSON);
	}

	public static synchronized DataManager getInstance() {
		if (instance == null) {
			instance = new DataManager();
		}
		return instance;
	}

	// Método genérico para cargar datos
	private <T> ArrayList<T> cargarDatos(String filePath, Class<T> type) {
		ArrayList<T> datos = JsonManager.cargarListaDesdeArchivo(filePath, type);
		return datos != null ? datos : new ArrayList<>();
	}
	
	private ArrayList<Articulo> cargarDatosArticulos(String filePath) {
        return JsonManager.cargarListaArticulosDesdeArchivo(filePath);
    }

	// Guardar todos los datos
	public void guardarTodo() {
		JsonManager.guardarEnArchivo(PERSONAL_JSON, personal);
		JsonManager.guardarEnArchivo(USUARIOS_JSON, usuarios);
		JsonManager.guardarEnArchivo(PRESTAMOS_ACTIVOS_JSON, prestamosActivos);
		JsonManager.guardarEnArchivo(HISTORIAL_PRESTAMOS_JSON, historialPrestamos);
		JsonManager.guardarListaArticulos(INVENTARIO_JSON, inventario);

	}

	// Métodos de acceso a las listas (ArrayList directo)
	public ArrayList<Empleado> getPersonal() {
		return personal;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public ArrayList<Prestamo> getPrestamosActivos() {
		return prestamosActivos;
	}

	public ArrayList<Prestamo> getHistorialPrestamos() {
		return historialPrestamos;
	}
	
	public ArrayList<Articulo> getInventario(){
		return inventario;
	}

	// Métodos para agregar elementos con persistencia automática
	public void agregarEmpleado(Empleado empleado) {
		personal.add(empleado);
		JsonManager.guardarEnArchivo(PERSONAL_JSON, personal);
	}

	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
		JsonManager.guardarEnArchivo(USUARIOS_JSON, usuarios);
	}

	public void agregarPrestamoActivo(Prestamo prestamo) {
		prestamosActivos.add(prestamo);
		JsonManager.guardarEnArchivo(PRESTAMOS_ACTIVOS_JSON, prestamosActivos);
	}

	public void agregarPrestamoHistorial(Prestamo prestamo) {
		historialPrestamos.add(prestamo);
		JsonManager.guardarEnArchivo(HISTORIAL_PRESTAMOS_JSON, historialPrestamos);
	}
	
	public void agregarInventario(Articulo articulo) {
		inventario.add(articulo);
		JsonManager.guardarListaArticulos(INVENTARIO_JSON, inventario);
	}

	// Método para registrar el cierre
	public void registrarCierre() {
		System.out.println("Guardando todos los datos antes de salir...");
		guardarTodo();
	}
}