import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Articulo> articulos = new ArrayList<>();

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode root = mapper.readTree(new File("src/articulos.json"));

            if (root.isArray()) {
                for (JsonNode item : root) {
                    String type = item.get("type").asText();
                    Articulo articulo;

                    switch (type) {
                        case "Libro":
                            articulo = new Libro(item);
                            break;
                        case "Revista":
                            articulo = new Revista(item);
                            break;
                        case "Periodico":
                            articulo = new Periodico(item);
                            break;
                        default:
                            throw new IllegalArgumentException("Tipo no soportado: " + type);
                    }

                    articulos.add(articulo);
                }
            }

            articulos.forEach(a -> {
                System.out.println(a);
                System.out.println("¿Es prestable? " + a.esPrestable());
                System.out.println("-----------------------------");
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
