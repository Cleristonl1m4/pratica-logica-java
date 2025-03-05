import java.util.Scanner;

public class ImprimaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: \n");
        nome = scanner.next();

        System.out.println("Olá " + nome + " voce conhece a linguagem de progamação java? se não conhece vamos aprender!");
    }
}
