package mainbiblioteca;

public class Ilustracion extends Publicacion {
    private String ilustrador;
    private double ancho;
    private double alto;

    public Ilustracion(String ilustrador, double ancho, double alto, String titulo, int anio) {
        super(titulo, anio);
        this.ilustrador = ilustrador;
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ilustrador: " + ilustrador + ", Dimensiones: " + ancho + "x" + alto;
    }
}
