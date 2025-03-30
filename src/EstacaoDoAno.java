import java.util.ArrayList;
import java.util.Scanner;

public class EstacaoDoAno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o mes de 1 a 12: ");
        int x = sc.nextInt();
        if(x == 12 || x == 1 || x == 2){
            System.out.println("Verao");
        } else if (x == 3 || x == 4 || x == 5){
            System.out.println("Outono");
        } else if (x == 6 || x == 7 || x == 8) {
            System.out.println("Inverno");
        } else if (x == 9 || x == 10 || x == 11) {
            System.out.println("Primavera");
        }else{
            System.out.println("Valor fora dos parametros permitidos!");
        }
    }
}
