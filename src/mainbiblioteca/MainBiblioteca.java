package mainbiblioteca;

public class MainBiblioteca {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        
        try {
            // Crear publicaciones
            Libro libro1 = new Libro("Miguel de Cervantes", GENERO.FICCION, "El Quijote", 1605);
            Revista revista1 = new Revista(120, "National Geographic", 2024);
            Ilustracion ilustracion1 = new Ilustracion("Leonardo Da Vinci", 77, 53, "Mona Lisa", 1503);
            Ilustracion ilustracion2 = new Ilustracion("Van Gogh", 58, 29, "La noche estrellada", 1889);
            
            Libro libroDuplicado = new Libro("Miguel de Cervantes", GENERO.FICCION, "El Quijote", 1605);

            // Agregar publicaciones
            biblioteca.agregarPublicacion(libro1);
            biblioteca.agregarPublicacion(revista1);
            biblioteca.agregarPublicacion(ilustracion1);
            biblioteca.agregarPublicacion(ilustracion2);
            biblioteca.agregarPublicacion(libroDuplicado);

  
        } catch (PublicacionDuplicadaException e) {
            System.out.println(e.getMessage());
        }
        
        // Mostrar publicaciones
        System.out.println("Publicaiones en la biblioteca: ");
        biblioteca.mostrarPublicaciones();

        // Leer publicaiones leibles
        System.out.println("\nLeyendo publicaciones: ");
        biblioteca.leerPublicaciones();
    }
    
}
