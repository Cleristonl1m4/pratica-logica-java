import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, soma;

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.println("A soma de " + num1 + " com " + num2 + " é igual a " + soma);
    }
}
