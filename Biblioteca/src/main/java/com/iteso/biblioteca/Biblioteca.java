package com.iteso.biblioteca;

import java.util.ArrayList;

import com.iteso.biblioteca.enums.Puesto;
import com.iteso.biblioteca.manager.DataManager;
import com.iteso.biblioteca.model.Empleado;
import com.iteso.biblioteca.model.Usuario;


public class Biblioteca {
	public static void main(String[] args) {
		DataManager dataManager = DataManager.getInstance();
		
		
//		Usuario testUser = new Usuario("12345", "Juan Lopez", "Juan.Lopez@iteso.mx", "3325767021", false);
//		Empleado testEmpleado = new Empleado("123456", "Maria anton", "M.anton@iteso.mx", "6315357524",
//				Puesto.ADMINISTRADOR_SISTEMAS);
//		Empleado testEmpleado2 = new Empleado("78910", "MRTia anty", "M.aon@iteso.mx", "4315354564",
//				Puesto.RESTAURADOR);
//		Empleado testEmpleado3 = new Empleado("1238956", "Aria Santon", "Mant.n@iteso.mx", "9323657524",
//				Puesto.ASISTENTE_BIBLIOTECA);
//		
//		dataManager.agregarUsuario(testUser);
//		dataManager.agregarEmpleado(testEmpleado);
//		dataManager.agregarEmpleado(testEmpleado2);
//		dataManager.agregarEmpleado(testEmpleado3);
		
		ArrayList<Empleado> personal = dataManager.getPersonal();
		ArrayList<Usuario> testUser = dataManager.getUsuarios();
		System.out.println(personal);
		
		personal.sort((a,b)->a.getNumeroCredencial().compareTo(b.getNumeroCredencial()));
		System.out.println(personal);

		
		System.out.println(testUser);
		
		
	}


}
