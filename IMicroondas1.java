public interface IMicroondas1<T> {
    void calentarComida(T comida);
    void comenzar();
    void parar();
    void cancelar();
    void agregarTiempo(int tiempo);
    boolean estaCalentando();
    boolean estaCaliente();
    boolean estaCancelada();
    boolean estaPausada();
}