import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MaiorEMenorElemento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetornum = new int[7];

        System.out.println("Digite 7 numeros: ");
        for(int i = 0; i < 7; i++){
            int x = sc.nextInt();
            vetornum[i] = x;
        }
      int maior = Arrays.stream(vetornum).max().getAsInt();
      int menor = Arrays.stream(vetornum).min().getAsInt();
        System.out.println("O maior elemanto: "+ maior);
        System.out.println("O menor elemento: " + menor);
    }
}
