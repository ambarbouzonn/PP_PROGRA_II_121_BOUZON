package mainbiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Publicacion> publicaciones;
    
    public Biblioteca() {
        this.publicaciones = new ArrayList<>();
    }
    
    /*
    Este metodo permite agregar una publicacion a la biblioteca. La misma, 
    verifica si ya existe una publicacion con el mismo titulo y año. Si es asi, lanza 
    la excepcion PublicacionDuplicadaException.
    */
    public void agregarPublicacion(Publicacion publicacion) throws PublicacionDuplicadaException {
        for (Publicacion  p : publicaciones) {
            if (p.getTitulo().equals(publicacion.getTitulo()) && p.getAnio() == publicacion.getAnio()) {
                throw new PublicacionDuplicadaException("La publicacion ya existe: " + publicacion.getTitulo());
            }
        }
        publicaciones.add(publicacion);
    }
    
    public void mostrarPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            System.out.println(publicacion);
        }
    }
    
    /*
    Recorre todas las publicaciones y verifica si son de tipo Libro o Revista para "leerlas"
    */
    public void leerPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion instanceof Libro) {
                ((Libro) publicacion).leer();
            } else if (publicacion instanceof Revista) {
                ((Revista) publicacion).leer();
            } else {
                System.out.println("No se puede leer la publicacion: " + publicacion.getTitulo());
            }
        }
    }
    
}
