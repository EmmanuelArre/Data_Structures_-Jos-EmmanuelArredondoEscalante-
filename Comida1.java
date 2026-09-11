public class Comida1 {

    private String nombre;
    private int tiempoCalentamiento;
    private int tiempoRestante;

    private boolean estaCalentando;
    private boolean estaCaliente;
    private boolean estaCancelada;
    private boolean estaPausada;

    public Comida1(String nombre, int tiempoCalentamiento) {

        this.nombre = nombre;
        this.tiempoCalentamiento = tiempoCalentamiento;
        this.tiempoRestante = tiempoCalentamiento;

        this.estaCalentando = false;
        this.estaCaliente = false;
        this.estaCancelada = false;
        this.estaPausada = false;
    }

    // Getters

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

    // Métodos para cambiar el estado

    public void comenzarCalentamiento() {
        estaCalentando = true;
        estaPausada = false;
    }
    public void pausarCalentamiento() {
        estaCalentando = false;
        estaPausada = true;
    }
    public void cancelarCalentamiento() {
        estaCalentando = false;
        estaCancelada = true;
    }
    public void calentar() {
        estaCalentando = false;
        estaCaliente = true;
    }
    public void agregarTiempo(int tiempo) {
        tiempoRestante += tiempo;
    }
}