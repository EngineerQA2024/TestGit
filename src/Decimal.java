public class Decimal extends Numero{
    public Decimal(double valor) {
        super(valor);
    }


    public double getValor() {
        return valor;
    }

    public void mostrarInformacion() {
        System.out.println("Número Decimal: " + valor);
    }
}
