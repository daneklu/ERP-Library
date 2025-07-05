package com.iteso.biblioteca.util;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JsonManager {
    private static final ObjectMapper mapper = createObjectMapper();

    private static ObjectMapper createObjectMapper() {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
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

    public static <T> ArrayList<T> cargarListaDesdeArchivo(String filePath, Class<T> elementType) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                System.out.println("Archivo no encontrado, creando nueva lista: " + filePath);
                return new ArrayList<>();
            }
            return mapper.readValue(file, mapper.getTypeFactory().constructCollectionType(ArrayList.class, elementType));
        } catch (IOException e) {
            System.err.println("Error al cargar JSON: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}