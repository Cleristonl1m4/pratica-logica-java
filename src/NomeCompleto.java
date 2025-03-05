import java.util.Scanner;

public class NomeCompleto {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        String nome, sobrenome;

        System.out.println("Digite o seu primeiro nome: ");
        nome = scanner.next();
        System.out.println("Digite o seu sobrenome: ");
        sobrenome = scanner.next();

        System.out.println("O seu nome completo é " + nome + " " + sobrenome);
    }
}