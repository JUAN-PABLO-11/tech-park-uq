package project_code;

public class Pruebas {

    public static void main(String[] args) {
        prueba1ListaEnlazada();
        prueba2ColaPrioridad();
        prueba3ArbolBST();
        prueba4ValidarAcceso();
    }

    // Prueba 1 — Lista Enlazada
    static void prueba1ListaEnlazada() {
        ListaEnlazada<String> lista = new ListaEnlazada<>();
        lista.agregar("Montaña Rusa");
        lista.agregar("Tobogán");

        assert lista.getTamanio() == 2 : "Error: tamaño incorrecto";
        assert lista.obtener(0).equals("Montaña Rusa") : "Error: primer elemento incorrecto";
        System.out.println("✅ Prueba 1 Lista Enlazada: PASÓ");
    }

    // Prueba 2 — Cola de Prioridad
    static void prueba2ColaPrioridad() {
        ColaPrioridad<String> cola = new ColaPrioridad<>();
        cola.encolar("Juan", 2); // General
        cola.encolar("Maria", 1); // Fast-Pass

        assert cola.desencolar().equals("Maria") : "Error: Fast-Pass debe salir primero";
        System.out.println("✅ Prueba 2 Cola de Prioridad: PASÓ");
    }

    // Prueba 3 — Árbol BST
    static void prueba3ArbolBST() {
        ArbolBST<String> arbol = new ArbolBST<>();
        arbol.insertar("Montaña Rusa");
        arbol.insertar("Tobogán");

        assert arbol.buscar("Montaña Rusa") : "Error: debería encontrar Montaña Rusa";
        assert !arbol.buscar("Carrusel") : "Error: Carrusel no existe";
        System.out.println("✅ Prueba 3 Árbol BST: PASÓ");
    }

    // Prueba 4 — Validar acceso
    static void prueba4ValidarAcceso() {
        Parque parque = new Parque("Tech-Park", 100);
        Ticket ticket = new Ticket(Ticket.TipoTicket.GENERAL, 20.0, true);
        Visitante v = new Visitante("Ana", "123", 20, 1.60, 50.0, ticket);
        Atraccion a = new Atraccion("A1", "Montaña Rusa",
                Atraccion.Tipo.MECANICA_ALTURA, 30, 1.50, 18, 0.0, 5,
                Atraccion.Estado.ACTIVA, "");

        assert parque.validarAcceso(v, a) : "Error: acceso debería ser válido";
        System.out.println("✅ Prueba 4 Validar Acceso: PASÓ");
    }
}