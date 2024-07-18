public class Main {
    public static void main(String[] args) {
        Numero numero1 = new Entero(7);
        Numero numero2 = new Decimal(3.5);

        //Información de los números
        numero1.mostrarInformacion();
        numero2.mostrarInformacion();

        //Operaciones
        double suma = numero1.getValor() + numero2.getValor();
        double resta = numero1.getValor() - numero2.getValor();

        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
    }
}