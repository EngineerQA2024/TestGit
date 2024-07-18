abstract class Numero {
    protected double valor;

    public Numero(double valor) {
        this.valor = valor;
    }
    public abstract double getValor();

    public abstract void mostrarInformacion();
}
