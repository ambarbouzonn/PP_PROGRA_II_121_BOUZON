package mainbiblioteca;

public class Revista extends Publicacion {
    private int numeroEdicion;

    public Revista(int numeroEdicion, String titulo, int anio) {
        super(titulo, anio);
        this.numeroEdicion = numeroEdicion;
    }
    
    public void leer() {
        System.out.println("Leyendo la revista: " + titulo + ", Edicion: " + numeroEdicion);
    }

    @Override
    public String toString() {
        return super.toString() + ", Edicion N°: " + numeroEdicion; 
    }  
}
