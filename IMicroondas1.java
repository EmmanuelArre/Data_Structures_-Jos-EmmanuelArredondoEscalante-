public interface IMicroondas1<T> {
    void calentarComida(T comida);
    T masTiempo();
    void comenzar();
    void parar();
    void cancelar();
    void agregarTiempo(T tiempo);
}
