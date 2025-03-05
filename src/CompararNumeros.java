import java.util.Scanner;

public class CompararNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite dois numeros: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        if(num1 == num2){
            System.out.println("Os dois numeros digitados são iguais");
        }else if(num1 > num2){
            System.out.println("O numero " + num1 + " é maior!");
        }else{
            System.out.println("O numero " + num2 + " é maior");
        }
    }
}
