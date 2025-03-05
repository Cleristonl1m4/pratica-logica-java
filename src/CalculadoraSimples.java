import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, opcao, soma, mult, sub;
        String resultado = "==============================\n";
        double div;

        System.out.println("==============================\n" +
                "CALCULADORA SIMPLES\n" +
                "==============================\n" +
                "Escolha uma das opções abaixo:\n" +
                "Opção 1 - Somar.\n" +
                "Opção 2 - Multiplicar.\n" +
                "Opção 3 - Dividir.\n" +
                "opção 4 - Subitrair.\n" +
                "Opção 5 - Sair.\n" +
                "==============================\n");
        opcao = scanner.nextInt();

        System.out.println("==============================\n" + "Digite dois numeros interiros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        switch (opcao) {
            case 1:
                soma = num1 + num2;
                resultado = resultado + soma;
                break;
            case 2:
                mult = num1 * num2;
                resultado = resultado + mult;
                break;
            case 3:
                div = (double) num1 / num2;
                resultado = String.format(resultado + "%.2f",div);
                break;
            case 4:
                sub = num1 - num2;
                resultado = resultado + sub;
                break;
            case 5:
                resultado = resultado +
                        "Saindo...";
                break;
        };
        System.out.println(resultado);
    }
}
