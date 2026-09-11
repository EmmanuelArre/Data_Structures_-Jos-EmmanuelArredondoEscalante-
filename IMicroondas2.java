/**
 * InnerIMicroondas2
 */
public interface IMicroondas2 <T>{
    void comenzar();
    void parar();
    void apagar();
    void cancelar();
    void calentarComida(T comida);
    T masTiempo();
    boolean isCalentando();
}


    
