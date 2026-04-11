package project_code;

public class Parque {
    private String nombre;
    private ListaEnlazada<Zona> zonas;
    private ListaEnlazada<Visitante> visitantes;
    private ListaEnlazada<Operador> operadores;
    private Grafo mapa;
    private int capacidadMaxima;
    private int visitantesActuales;

    public Parque(String nombre, int capacidadMaxima) {
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.zonas = new ListaEnlazada<>();
        this.visitantes = new ListaEnlazada<>();
        this.operadores = new ListaEnlazada<>();
        this.mapa = new Grafo();
        this.visitantesActuales = 0;
    }

    // Agregar zona al parque
    public void agregarZona(Zona zona) {
        zonas.agregar(zona);
    }

    // Registrar visitante
    public void registrarVisitante(Visitante v) {
        if (visitantesActuales < capacidadMaxima) {
            visitantes.agregar(v);
            visitantesActuales++;
        } else {
            System.out.println("Se alcanzo la capacidad maxima");
            return;
        }
    }

    // Buscar zona por id
    public Zona buscarZona(String id) {
        for (int i = 0; i < zonas.getTamanio(); i++) {
            Zona actual = zonas.obtener(i);
            if (actual.getId().equals(id)) {
                return actual;
            }
        }
        return null;
    }

    // Agregar operador
    public void agregarOperador(Operador o) {
        operadores.agregar(o);
    }
}