package Pregunta6;

public class Pregunta_6 {
    public static void main(String[] args) {
        LAN red = new LAN();
        red.configurarRed("Estrella");
        red.establecerTamanoPaquete(1024);

        Nodo nodo1 = new Nodo("Nodo1");
        Nodo nodo2 = new Nodo("Nodo2");
        Nodo nodo3 = new Nodo("Nodo3");

        red.agregarNodo(nodo1);
        red.agregarNodo(nodo2);
        red.agregarNodo(nodo3);

        red.enviarPaquete(nodo1, nodo2);
        red.enviarPaquete(nodo2, nodo3);
        red.difundirPaquete(nodo1);

        System.out.println("Estadísticas de la LAN:");
        System.out.println("Tiempo promedio de viaje de paquetes: " + red.estadisticasLAN() + " ms");
    }
}
