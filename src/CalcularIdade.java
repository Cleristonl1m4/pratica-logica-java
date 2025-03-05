import java.util.Scanner;

public class CalcularIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade, anoAtual, anoNascimento;
        anoAtual = 2025;

        System.out.println("Digite o ano do seu nascimento para calcularmos quantos anos voce tem ou ira fazer: ");
        anoNascimento = scanner.nextInt();

        idade = anoAtual - anoNascimento;
        System.out.println("Se voce nasceu no ano de " + anoNascimento +" e estamos no ano " + anoAtual + "\n" +
                " voce tem ou ira fazer " + idade + " anos" );
    }
}
