package com.iteso.biblioteca.enums;

public enum Genero {

	NOVELA("Novela", "Narrativa extensa de ficción"),
	POESIA("Poesía", "Literatura poética"),
	TEATRO("Teatro", "Obras dramáticas para representación escénica"),
	CUENTO("Cuento", "Narrativa breve de ficción"),
	ENSAYO_LITERARIO("Ensayo Literario", "Reflexión literaria sobre temas diversos"),
	BIOGRAFIA("Biografía", "Narración de la vida de una persona"),
	HISTORICA("Histórica", "Literatura basada en eventos históricos"),
	FANTASIA("Fantasía", "Literatura con elementos mágicos y sobrenaturales"),
	CIENCIA_FICCION("Ciencia Ficción", "Literatura de ciencia ficción"),
	TERROR("Terror", "Literatura de miedo y suspenso"),
	ROMANCE("Romance", "Literatura sobre relaciones amorosas"),
	POLICIACA("Policíaca", "Literatura de crímenes y detectives"),
	AVENTURA("Aventura", "Literatura de hazañas y exploración"),
	MITOLOGIA("Mitología", "Relatos sobre mitos y leyendas antiguas"),
	INFANTIL("Infantil", "Literatura para niños"),
	JUVENIL("Juvenil", "Literatura dirigida a adolescentes"),

	CIENCIAS_COMPUTACION("Ciencias de la Computación", "Estudio de sistemas computacionales"),
	MATEMATICAS("Matemáticas", "Ciencias matemáticas"),
	FISICA("Física", "Ciencias físicas y estudio de la materia"),
	QUIMICA("Química", "Ciencias químicas y reacciones de sustancias"),
	BIOLOGIA("Biología", "Ciencias de la vida y organismos vivos"),
	INGENIERIA("Ingeniería", "Aplicación de principios científicos y técnicos"),
	MEDICINA("Medicina", "Ciencia de la salud y el tratamiento de enfermedades"),
	ARQUITECTURA("Arquitectura", "Diseño y construcción de edificios"),
	ECONOMIA("Economía", "Ciencias económicas y sistemas de producción"),
	DERECHO("Derecho", "Sistema de normas y leyes jurídicas"),
	PSICOLOGIA("Psicología", "Ciencia de la mente y el comportamiento"),
	FILOSOFIA("Filosofía", "Estudio de problemas fundamentales de la existencia"),
	SOCIOLOGIA("Sociología", "Ciencia de la sociedad y relaciones sociales"),

	ARTE("Arte", "Expresiones creativas humanas"),
	MUSICA("Música", "Arte de organizar sonidos y silencios"),
	CINE("Cine", "Arte cinematográfico y producción audiovisual"),
	FOTOGRAFIA("Fotografía", "Técnica de capturar imágenes con luz"),
	GASTRONOMIA("Gastronomía", "Arte y conocimiento de la cocina"),
	VIAJES("Viajes", "Relatos de exploración y experiencias culturales"),

	EDUCACION("Educación", "Proceso de enseñanza y aprendizaje"),
	IDIOMAS("Idiomas", "Estudio de lenguas extranjeras"),
	ENCICLOPEDIA("Enciclopedia", "Compendio organizado del conocimiento"),
	DICCIONARIO("Diccionario", "Catálogo de palabras y sus significados"),

	RELIGION("Religión", "Creencias y prácticas espirituales"),
	DEPORTES("Deportes", "Actividades físicas competitivas"),
	JARDINERIA("Jardinería", "Cultivo y cuidado de plantas"),
	AUTOAYUDA("Autoayuda", "Desarrollo personal y superación");
	
    private final String nombre;
    private final String descripcion;

    Genero(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
