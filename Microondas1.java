public class Microondas1 implements IMicroondas1<Comida1> {

    private Comida1 comida;

    @Override
    public void calentarComida(Comida1 comida) {
        this.comida = comida;
        System.out.println("Se agregó: " + comida.getNombre());
    }

    @Override
    public void comenzar() {

        if (comida != null && !comida.isEstaCancelada()) {
            comida.comenzarCalentamiento();
            System.out.println("El microondas comenzó a calentar.");
        }
    }

    @Override
    public void parar() {

        if (comida != null) {
            comida.pausarCalentamiento();
            System.out.println("El microondas se detuvo.");
        }
    }

    @Override
    public void cancelar() {

        if (comida != null) {
            comida.cancelarCalentamiento();
            System.out.println("El calentamiento fue cancelado.");
        }
    }

    @Override
    public void agregarTiempo(int tiempo) {

        if (comida != null) {
            comida.agregarTiempo(tiempo);
            System.out.println("Se agregaron " + tiempo + " segundos.");
        }
    }

    @Override
    public boolean estaCalentando() {
        return comida != null && comida.isEstaCalentando();
    }

    @Override
    public boolean estaCaliente() {
        return comida != null && comida.isEstaCaliente();
    }

    @Override
    public boolean estaCancelada() {
        return comida != null && comida.isEstaCancelada();
    }

    @Override
    public boolean estaPausada() {
        return comida != null && comida.isEstaPausada();
    }
}