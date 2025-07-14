package com.iteso.biblioteca.util;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.iteso.biblioteca.model.Articulo;
import com.iteso.biblioteca.model.Libro;
import com.iteso.biblioteca.model.Periodico;
import com.iteso.biblioteca.model.Revista;

import com.fasterxml.jackson.databind.JavaType;

import com.fasterxml.jackson.databind.jsontype.BasicPolymorphicTypeValidator;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonManager {
	private static final ObjectMapper mapper = createObjectMapper();

	private static ObjectMapper createObjectMapper() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(new JavaTimeModule());
		mapper.enable(SerializationFeature.INDENT_OUTPUT);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerSubtypes(Libro.class, Revista.class, Periodico.class);
   
		return mapper;
	}

	public static <T> void guardarEnArchivo(String filePath, T data) {
		try {
			mapper.writeValue(new File(filePath), data);
			System.out.println("Datos guardados en: " + filePath);
		} catch (IOException e) {
			System.err.println("Error al guardar JSON: " + e.getMessage());
		}
	}
	
	public static void guardarListaArticulos(String filePath, List<Articulo> lista) {
	    try {
	        // Construimos el JavaType de ArrayList<Articulo>
	        JavaType type = mapper.getTypeFactory()
	            .constructCollectionType(ArrayList.class, Articulo.class);
	        // writerFor respeta @JsonTypeInfo de Articulo
	        mapper.writerFor(type)
	              .with(SerializationFeature.INDENT_OUTPUT)
	              .writeValue(new File(filePath), lista);
	        System.out.println("Inventario guardado con tipos en: " + filePath);
	    } catch (IOException e) {
	        System.err.println("Error al guardar JSON de Articulos: " + e.getMessage());
	    }
	}

	public static <T> ArrayList<T> cargarListaDesdeArchivo(String filePath, Class<T> elementType) {
		try {
			File file = new File(filePath);
			if (!file.exists()) {
				System.out.println("Archivo no encontrado, creando nueva lista: " + filePath);
				return new ArrayList<>();
			}
			return mapper.readValue(file,
					mapper.getTypeFactory().constructCollectionType(ArrayList.class, elementType));
		} catch (IOException e) {
			System.err.println("Error al cargar JSON: " + e.getMessage());
			return new ArrayList<>();
		}
	}
	public static ArrayList<Articulo> cargarListaArticulosDesdeArchivo(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("Archivo no encontrado, creando nueva lista: " + filePath);
                return new ArrayList<>();
            }
            
            return mapper.readValue(file, 
                mapper.getTypeFactory().constructCollectionType(ArrayList.class, Articulo.class));
        } catch (IOException e) {
            System.err.println("Error al cargar JSON: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}