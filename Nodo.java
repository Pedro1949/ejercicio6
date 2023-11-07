package Pregunta6;

public class Nodo {
    private String nombre;
    private double tiempoRecepcion;

    public Nodo(String nombre) {
        this.nombre = nombre;
    }
    
    public double recibirPaquete(int tamanoPaquete) {
        // Simulación de recepción de paquete
        tiempoRecepcion = System.currentTimeMillis();
        return tiempoRecepcion;
    }

    public String obtenerNombre() {
        return nombre;
    }
}
