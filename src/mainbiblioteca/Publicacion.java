package mainbiblioteca;

public abstract class Publicacion {
    protected String titulo;
    protected int anio;

    public Publicacion(String titulo, int anio) {
        this.titulo = titulo;
        this.anio = anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Año: " + anio;
    }
}
