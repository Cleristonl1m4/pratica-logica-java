import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double base, altura, area;

        System.out.println("==============================\n" +
                "CALCULAR AREA DE UM RETANGULO\n" +
                "==============================\n" +
                "Digite o tamanho da base: \n");
            base = scanner.nextDouble();
            System.out.println("Digite a altura: \n");
            altura = scanner.nextDouble();
            area = (base * altura) / 2;
            System.out.println("==============================\n" +
                    "O valor da area desse Retangulo é: " + area);
    }
}
