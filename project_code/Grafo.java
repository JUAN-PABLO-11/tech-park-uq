package project_code;

public class Grafo {
    private ListaEnlazada<NodoGrafo> nodos;

    public Grafo() {
        this.nodos = new ListaEnlazada<>();
    }

    // Agregar una atracción al grafo
    public void agregarNodo(String nombre) {
        NodoGrafo nuevo = new NodoGrafo(nombre);
        nodos.agregar(nuevo);
    }

    // Agregar camino entre dos atracciones
    public void agregarArista(String origen, String destino, int peso) {
        NodoGrafo nodoOrigen = buscarNodo(origen);
        if (nodoOrigen != null) {
            Arista arista = new Arista(destino, peso);
            nodoOrigen.getVecinos().agregar(arista);
        }
    }

    // Buscar un nodo por nombre
    public NodoGrafo buscarNodo(String nombre) {
        for (int i = 0; i < nodos.getTamanio(); i++) {
            NodoGrafo actual = nodos.obtener(i);
            if (actual.getNombre().equals(nombre)) {
                return actual;
            }
        }
        return null;
    }

    public void mostrar() {
        for (int i = 0; i < nodos.getTamanio(); i++) {
            NodoGrafo actual = nodos.obtener(i);
            System.out.println("Atracción: " + actual.getNombre());

            for (int j = 0; j < actual.getVecinos().getTamanio(); j++) {
                Arista arista = actual.getVecinos().obtener(j);
                System.out.println("  → " + arista.getDestino() + " (peso: " + arista.getPeso() + ")");
            }
        }
    }
}