public class Comida1 {
    private String nombre;
    private int tiempoCalentamiento; // Tiempo en segundos
    private int tiempoRestante; // Tiempo restante en segundos
    private boolean estaCalentando; // Indica si la comida está siendo calentada
    private boolean estaCaliente; // Indica si la comida está caliente
    private boolean estaCancelada; // Indica si la comida ha sido cancelada
    private boolean estaPausada; // Indica si la comida ha sido parada

    public Comida1(String nombre, int tiempoCalentamiento) {
        this.nombre = nombre;
        this.tiempoCalentamiento = tiempoCalentamiento;
        this.tiempoRestante = tiempoCalentamiento;
        this.estaCalentando = false;
        this.estaCaliente = false;
        this.estaCancelada = false;
        this.estaPausada = false;
    }

    //getters

public String getNombre() {
        return nombre;
    }

    public int getTiempoCalentamiento() {
        return tiempoCalentamiento;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public boolean isEstaCalentando() {
        return estaCalentando;
    }

    public boolean isEstaCaliente() {
        return estaCaliente;
    }

    public boolean isEstaCancelada() {
        return estaCancelada;
    }

    public boolean isEstaPausada() {
        return estaPausada;
    }
}