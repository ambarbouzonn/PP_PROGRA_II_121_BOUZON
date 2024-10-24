package mainbiblioteca;

public class Libro extends Publicacion {
    private String autor;
    private GENERO genero;

    public Libro(String autor, GENERO genero, String titulo, int anio) {
        super(titulo, anio);
        this.autor = autor;
        this.genero = genero;
    }
    
    public void leer() {
        System.out.println("Leyendo el libro: " + titulo + " de " + autor);
    }

    @Override
    public String toString() {
        return super.toString() + ", Autor: " + autor + ", Genero: " + genero;
    }  
}
