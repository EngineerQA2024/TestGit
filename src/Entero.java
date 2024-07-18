public class Entero extends Numero{


    public Entero(double valor) {
        super(valor);
    }


        public double getValor() {
            return (double) valor;
        }


        public void mostrarInformacion() {
            System.out.println("Número Entero: " + valor);
        }

}
