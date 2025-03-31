import java.util.Arrays;
import java.util.Scanner;
public class SomaDeElementos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int soma = 0;

        System.out.println("Digite os elementos da matriz 3X3: ");
        for(int i = 0 ; i < matriz.length; i++){
            for(int j = 0 ; j< matriz.length; j++){
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println("=============================");
        sc.close();
        for(int x = 0; x < matriz.length; x++){
            for(int y = 0; y < matriz.length; y++) {
                System.out.print(matriz[x][y] + " ");
                soma += matriz[x][y];
            }
            System.out.println();
        }
        System.out.println("=============================\n" +
                "A soma dos elementos: " + soma);
    }
}