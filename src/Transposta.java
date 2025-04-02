import java.security.SecureRandom;
import java.util.Collections;

public class Transposta {
    public static void main(String[] args) {
        int[][] mtz = new int[3][3];
        int soma =0;
        System.out.println("=========================");
        for(int l = 0; l < mtz.length; l++){
            for( int c = 0; c < mtz.length; c++){
                mtz[l][c] = new SecureRandom().nextInt(100);
            }
        }
        for(int i = 0; i < mtz.length; i++){
            for(int j = 0; j < mtz.length; j++){
                System.out.printf("%d -",mtz[i][j]);
            }
            System.out.println();
        }
        System.out.println("=========================");
        for(int t = 0; t < mtz.length; t++){
            for(int r = 0; r < mtz.length; r++){
                System.out.printf("%d -",mtz[r][t]);
            }
            System.out.println();
        }


    }
}