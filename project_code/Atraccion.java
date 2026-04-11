package project_code;

public class Atraccion {
    public enum Tipo {
        ACUATICA, MECANICA_ALTURA, OTRO
    }

    public enum Estado {
        ACTIVA, EN_MANTENIMIENTO, CERRADA
    }

    private String id;
    private String nombre;
    private Tipo tipo;
    private int capacidadMaxima;
    private double alturaMinima;
    private int edadMinima;
    private double costoAdicional;
    private int visitantesAcumulados;
    private int tiempoEspera;
    private Estado estado;
    private String motivoCierre;

    public Atraccion(String id, String nombre, Tipo tipo, int capacidadMaxima, double alturaMinima, int edadMinima,
            double costoAdicional, int tiempoEspera, Estado estado, String motivoCierre) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.capacidadMaxima = capacidadMaxima;
        this.alturaMinima = alturaMinima;
        this.edadMinima = edadMinima;
        this.costoAdicional = costoAdicional;
        this.visitantesAcumulados = 0;
        this.tiempoEspera = tiempoEspera;
        this.estado = estado;
        this.motivoCierre = motivoCierre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getAlturaMinima() {
        return alturaMinima;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public double getCostoAdicional() {
        return costoAdicional;
    }

    public int getVisitantesAcumulados() {
        return visitantesAcumulados;
    }

    public void setVisitantesAcumulados(int visitantesAcumulados) {
        this.visitantesAcumulados = visitantesAcumulados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getTiempoEspera() {
        return tiempoEspera;
    }

    public void setTiempoEspera(int tiempoEspera) {
        this.tiempoEspera = tiempoEspera;
    }

    public String getMotivoCierre() {
        return motivoCierre;
    }

    public void setMotivoCierre(String motivoCierre) {
        this.motivoCierre = motivoCierre;
    }

}
