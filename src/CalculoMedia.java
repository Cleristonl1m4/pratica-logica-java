import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3, media;
        System.out.println("Digite as três notas do aluno: ");
        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A media das do aluno é: " + media);
    }
}
