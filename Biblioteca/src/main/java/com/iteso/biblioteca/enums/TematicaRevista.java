package com.iteso.biblioteca.enums;

public enum TematicaRevista {
	// Noticias y Actualidad
	NOTICIAS_INTERNACIONALES("Noticias Internacionales", "Revistas sobre actualidad mundial"),
	ACTUALIDAD_NACIONAL("Actualidad Nacional", "Revistas sobre noticias del país"),
	POLITICA("Política", "Revistas sobre análisis político"),
	ECONOMIA_MUNDIAL("Economía Mundial", "Revistas sobre finanzas globales"),

	// Tecnología y Ciencia
	TECNOLOGIA("Tecnología", "Revistas sobre tecnología"),
	INFORMATICA("Informática", "Revistas sobre computación y software"),
	GADGETS("Gadgets", "Revistas sobre dispositivos electrónicos"),
	VIDEOJUEGOS("Videojuegos", "Revistas sobre gaming y consolas"),
	CIENCIA("Ciencia", "Revistas sobre descubrimientos científicos"),

	// Estilo de Vida
	MODA("Moda", "Revistas sobre tendencias de vestuario"),
	BELLEZA("Belleza", "Revistas sobre cuidado personal y cosmética"),
	DECORACION("Decoración", "Revistas sobre diseño de interiores"),
	GASTRONOMIA("Gastronomía", "Revistas sobre cocina y alimentos"),
	VIAJES("Viajes", "Revistas sobre turismo y destinos"),
	SALUD_BIENESTAR("Salud y Bienestar", "Revistas sobre medicina preventiva"),
	FITNESS("Fitness", "Revistas sobre ejercicio y entrenamiento"),

	// Entretenimiento y Cultura
	CINE_TV("Cine y TV", "Revistas sobre películas y series"),
	MUSICA("Música", "Revistas sobre artistas y álbumes"),
	ARTE_CULTURA("Arte y Cultura", "Revistas sobre expresiones culturales"),
	TEATRO_ESPECTACULOS("Teatro y Espectáculos", "Revistas sobre artes escénicas"),
	CELEBRIDADES("Celebridades", "Revistas sobre famosos y farándula"),
	LITERATURA("Literatura", "Revistas sobre libros y autores"),

	NEGOCIOS("Negocios", "Revistas de negocios y finanzas"),
	EDUCACION("Educación", "Revistas sobre pedagogía y enseñanza"),
	MEDICINA_SALUD("Medicina y Salud", "Revistas para profesionales médicos"),
	DERECHO("Derecho", "Revistas sobre legislación y jurisprudencia"),
	PSICOLOGIA("Psicología", "Revistas sobre comportamiento humano"),
	ECOLOGIA("Ecología", "Revistas sobre medio ambiente y sostenibilidad"),

	DEPORTES_GENERAL("Deportes General", "Revistas sobre actividades deportivas"),
	FUTBOL("Fútbol", "Revistas sobre balompié profesional"),
	BALONCESTO("Baloncesto", "Revistas sobre básquetbol"),
	TENIS("Tenis", "Revistas sobre tenis profesional"),
	AUTOMOVILISMO("Automovilismo", "Revistas sobre carreras de autos"),
	DEPORTES_EXTREMOS("Deportes Extremos", "Revistas sobre actividades de riesgo"),

	JARDINERIA("Jardinería", "Revistas sobre jardinería y plantas"),
	MASCOTAS("Mascotas", "Revistas sobre cuidado de animales"),
	BODAS_EVENTOS("Bodas y Eventos", "Revistas sobre planificación nupcial"),
	INFANTIL("Infantil", "Revistas para niños pequeños"),
	JUVENIL("Juvenil", "Revistas para adolescentes"),
	HISTORIA("Historia", "Revistas sobre eventos históricos"),

	COMUNIDAD_LOCAL("Comunidad Local", "Revistas sobre noticias vecinales"),
	TURISMO_REGIONAL("Turismo Regional", "Revistas sobre destinos locales");
	
	 private final String nombre;
    private final String descripcion;

    TematicaRevista(String nombre, String descripcion) {
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