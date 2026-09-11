public class Comida2 {
    private String nombre; 
    private int tiempoCalentando;
    private boolean estaCaliente;
    private boolean estaCancelada;
    private String tipo;

    public Comida2(String nombre, int tiempoCalentando, String tipo){
        this.nombre = nombre;
        this.tiempoCalentando = tiempoCalentando;
        this.tipo = tipo;
    }

    public String getNombre(){
        return nombre;
    }

    public int getTiempoCalentando(){
        return tiempoCalentando;
    }

    public String getTipo(){
        return tipo;
    }

    public boolean getEstaCaliente(){
        return estaCaliente;
    }

    public boolean getEstaCancelada(){
        return estaCancelada;
    }
}
