import java.util.Scanner;

public class ContagemRegressiva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("Digite o numero que deseja realizar a contagem regressiva: ");
        num = scanner.nextInt();

        for(int i = 0; i < num; i++){
            int cont = num - i;
            System.out.println(cont);
        }
    }
}
