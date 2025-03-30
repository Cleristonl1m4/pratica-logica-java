import java.time.Year;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o numero que quer ver a tabuada: ");
        int num = sc.nextInt();

        for(int i = 0; i <= 10; i++){
            int mult = i * num;
            System.out.println(i +" X "+ num +" = "+ mult);
        }


    }
}
