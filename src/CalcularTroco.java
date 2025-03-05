import java.util.Scanner;

public class CalcularTroco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double valorDaCompra, valorPago, valorTroco;

        System.out.println("Qual valor da compra: ");
        valorDaCompra = scanner.nextDouble();

        System.out.println("Qual o valor pago: ");
        valorPago = scanner.nextDouble();

        valorTroco = valorPago - valorDaCompra;

        if(valorPago == valorDaCompra){
            System.out.println("Compra paga sem precissar passar troco");
        } else if (valorPago > valorDaCompra) {
            System.out.println(" O valor do troco a ser poassado: " + valorTroco);
        } else{
            System.out.println(" o valor pago nao e sufuciente para pagar a conta");
        }

    }
}
