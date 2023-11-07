package Pregunta6;
import java.util.ArrayList;

public class LAN {
    private ArrayList<Nodo> nodos;
    private String topologia;
    private int tamanoPaquete;
    private ArrayList<Double> tiemposDeViaje;

    public LAN() {
        nodos = new ArrayList<>();
        tiemposDeViaje = new ArrayList<>();
    }

    public ArrayList<Nodo> enumNodos() {
        return nodos;
    }

    public void agregarNodo(Nodo nodo) {
        nodos.add(nodo);
    }

    public void quitarNodo(Nodo nodo) {
        nodos.remove(nodo);
    }

    public void configurarRed(String topologia) {
        this.topologia = topologia;
    }

    public void establecerTamanoPaquete(int tamano) {
        tamanoPaquete = tamano;
    }

    public void enviarPaquete(Nodo origen, Nodo destino) {
        double tiempoEnvio = System.currentTimeMillis();
        double tiempoRecepcion = destino.recibirPaquete(tamanoPaquete);
        double tiempoDeViaje = tiempoRecepcion - tiempoEnvio;
        tiemposDeViaje.add(tiempoDeViaje);
    }

    public void difundirPaquete(Nodo origen) {
        for (Nodo nodo : nodos) {
            if (nodo != origen) {
                enviarPaquete(origen, nodo);
            }
        }
    }

    public double estadisticasLAN() {
        // Cálculo de estadísticas
         if (tiemposDeViaje.isEmpty()) {
            return 0.0;
        }

        double tiempoPromedio = 0.0;
        for (double tiempo : tiemposDeViaje) {
            tiempoPromedio += tiempo;
        }

        tiempoPromedio /= tiemposDeViaje.size();
        return tiempoPromedio;
    }
}