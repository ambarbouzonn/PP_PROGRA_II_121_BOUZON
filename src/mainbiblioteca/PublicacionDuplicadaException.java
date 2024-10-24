package mainbiblioteca;

/*
Creamos una excepcion para manejar los casos en los que se intente agregar una publicacion que ya existe.
*/

public class PublicacionDuplicadaException extends Exception {
    public PublicacionDuplicadaException(String mensaje) {
        super(mensaje);
    }
}