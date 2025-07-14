package com.iteso.biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

import com.iteso.biblioteca.enums.Estado;
import com.iteso.biblioteca.enums.Genero;
import com.iteso.biblioteca.enums.Idioma;
import com.iteso.biblioteca.enums.Puesto;
import com.iteso.biblioteca.enums.TematicaRevista;
import com.iteso.biblioteca.gui.MainFrame;
import com.iteso.biblioteca.manager.DataManager;
import com.iteso.biblioteca.model.Articulo;
import com.iteso.biblioteca.model.Empleado;
import com.iteso.biblioteca.model.Libro;
import com.iteso.biblioteca.model.Periodico;
import com.iteso.biblioteca.model.Prestamo;
import com.iteso.biblioteca.model.Revista;
import com.iteso.biblioteca.model.Usuario;

public class Biblioteca {
	public static void main(String[] args) {

		DataManager dataManager = DataManager.getInstance();

		ArrayList<Empleado> personal = dataManager.getPersonal();
		ArrayList<Usuario> usuarios = dataManager.getUsuarios();
		ArrayList<Articulo> inventario = dataManager.getInventario();
		ArrayList<Prestamo> prestamosActivos = dataManager.getPrestamosActivos();
		ArrayList<Prestamo> historialPrestamos = dataManager.getHistorialPrestamos();

//		Libro l1 =new Libro("LIB-002", "Cien años de soledad", 1967, "Sudamericana", 
//                true, 10.0, 200.0, Estado.BUENO, Idioma.ESPAÑOL, false,
//                "Gabriel García Márquez", "978-0307474728", Genero.NOVELA);
//        
//        Libro l2 = new Libro("LIB-002", "El señor de los anillos", 1954, "Minotauro", 
//                true, 15.0, 300.0, Estado.BUENO, Idioma.INGLES, false,
//                "J.R.R. Tolkien", "978-8445000664", Genero.FANTASIA);
//        
//        Libro l3 = new Libro("LIB-003", "1984", 1949, "Debolsillo", 
//                false, 12.0, 180.0, Estado.DANADO, Idioma.INGLES, true,
//                "George Orwell", "978-8499890944", Genero.CIENCIA_FICCION);
//        Revista r1 = new Revista("R-002", "National Geographic", 2023, "National Geographic Society", 
//                true, 15.0, 150.0, Estado.BUENO, Idioma.INGLES, false,
//                "ISSN-001", 250, "Octubre", TematicaRevista.CIENCIA);
//        
//       Revista r2 =  new Revista("R-003", "Muy Interesante", 2023, "Televisa", 
//                true, 12.0, 120.0, Estado.BUENO, Idioma.ESPAÑOL, false,
//                "ISSN-002", 450, "Septiembre", TematicaRevista.TECNOLOGIA);
//        
//        Revista r3 = new Revista("R-004", "Forbes", 2022, "Forbes Media", 
//                false, 20.0, 180.0, Estado.DETERIORADO, Idioma.INGLES, true,
//                "ISSN-003", 100, "Diciembre", TematicaRevista.NEGOCIOS);
//        
//        Periodico p1 = new Periodico("P-002", "The New York Times", 2023, "The New York Times Company", 
//                true, 5.0, 100.0, Estado.BUENO, Idioma.INGLES, false,
//                "ISSN-NYT", LocalDate.of(2023, 10, 15), "Noticias Internacionales", "Estados Unidos");
//        
//        Periodico p2 = new Periodico("P-003", "El País", 2023, "PRISA", 
//                true, 4.0, 90.0, Estado.BUENO, Idioma.ESPAÑOL, false,
//                "ISSN-EPA", LocalDate.of(2023, 10, 14), "Política", "España");
//        
//        Periodico p3 = new Periodico("P-004", "Reforma", 2023, "Grupo Reforma", 
//                false, 6.0, 110.0, Estado.BUENO, Idioma.ESPAÑOL, true,
//                "ISSN-REF", LocalDate.of(2023, 10, 13), "Finanzas", "México");
//		
//		dataManager.agregarInventario(l1);
//		dataManager.agregarInventario(l2);
//		dataManager.agregarInventario(l3);
//		dataManager.agregarInventario(r1);
//		dataManager.agregarInventario(r2);
//		dataManager.agregarInventario(r3);
//		dataManager.agregarInventario(p1);
//		dataManager.agregarInventario(p2);
////		dataManager.agregarInventario(p3);
//		Prestamo p1 = new Prestamo(inventario.get(0),personal.get(1),usuarios.get(0));
//		Prestamo p2 = new Prestamo(inventario.get(3),personal.get(2),usuarios.get(2));
//		Prestamo p3 = new Prestamo(inventario.get(7),personal.get(1), usuarios.get(3));
////		p3.registrarDevolucion(true);
//		
//		dataManager.agregarPrestamoActivo(p1);
//		dataManager.agregarPrestamoActivo(p2);
//		dataManager.agregarPrestamoHistorial(p1);
//		dataManager.agregarPrestamoHistorial(p2);
//		dataManager.agregarPrestamoHistorial(p3);
		try {
			MainFrame frame = new MainFrame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}

//		Usuario testUser1 = new Usuario("12345", "Juan Lopez", "Juan.Lopez@iteso.mx", "3325767021", false);
//		Empleado testEmpleado = new Empleado("123456", "Maria anton", "M.anton@iteso.mx", "6315357524",
//				Puesto.ADMINISTRADOR_SISTEMAS);
//		Empleado testEmpleado2 = new Empleado("78910", "MRTia anty", "M.aon@iteso.mx", "4315354564",
//				Puesto.RESTAURADOR);
//		Empleado testEmpleado3 = new Empleado("1238956", "Aria Santon", "Mant.n@iteso.mx", "9323657524",
//				Puesto.ASISTENTE_BIBLIOTECA);
//		
//		dataManager.agregarUsuario(testUser1);
//		dataManager.agregarEmpleado(testEmpleado);
//		dataManager.agregarEmpleado(testEmpleado2);
//		dataManager.agregarEmpleado(testEmpleado3);

		System.out.println(personal);

		personal.sort((a, b) -> a.getNumeroCredencial().compareTo(b.getNumeroCredencial()));
		System.out.println(personal);
		System.out.println(usuarios);
		System.out.println(inventario);
		System.out.println(prestamosActivos);
		System.out.println(historialPrestamos);

		dataManager.guardarTodo();

	}

}
