import java.security.SecureRandom;
import java.util.Collections;

public class SomaDeDuasMatrizes {
    public static void main(String[] args) {
        int[][] mtz1 = new int[2][2];
        int[][] mtz2 = new int[2][2];
        int[][] mtzsoma = new int[2][2];

        for(int l = 0; l < mtz1.length; l++){
            for( int c = 0; c < mtz1.length; c++){
                mtz1[l][c] = new SecureRandom().nextInt(100);
                mtz2[l][c] = new SecureRandom().nextInt(50);
            }
        }
        System.out.println("=============== Matriz 1 ===============");
        for(int i = 0; i < mtz1.length; i++){
            for(int j = 0;j < mtz1.length; j++){
                System.out.printf("%d -",mtz1[i][j]);
            }
            System.out.println();
        }
        System.out.println("=============== Matriz 2 ===============");
        for(int r = 0; r < mtz1.length; r++){
            for(int t = 0;t < mtz1.length; t++){
                System.out.printf("%d -",mtz2[r][t]);
            }
            System.out.println();
        }

        for(int f = 0; f < mtz1.length; f++){
            for(int g = 0; g < mtz1.length; g++){
                mtzsoma[f][g] = mtz1[f][g] + mtz2[f][g];
            }
        }
        System.out.println("=============== Matriz Soma ===============");
        for(int y = 0; y < mtz1.length; y++){
            for(int x = 0; x < mtz1.length; x++){
                System.out.printf("%d -",mtzsoma[y][x]);
            }
            System.out.println();
        }

    }
}