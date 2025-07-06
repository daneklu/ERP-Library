import com.fasterxml.jackson.databind.JsonNode;

public class Libro extends Articulo {
    private String autor;
    private String isbn;
    private Genero genero;

    public Libro(JsonNode json) {
        super(json);
        this.autor = json.get("autor").asText();
        this.isbn = json.get("isbn").asText();
        this.genero = Genero.valueOf(json.get("genero").asText());
    }

    @Override
    public String toString() {
        return "Libro{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", genero=" + genero +
                '}';
    }
}
