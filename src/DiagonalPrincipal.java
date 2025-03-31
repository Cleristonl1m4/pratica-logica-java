import java.security.SecureRandom;
public class DiagonalPrincipal {
    public static void main(String[] args) {
        int[][] mtz = new int[4][4];
        int soma =0;
        System.out.println("=========================");
        for(int l = 0; l < mtz.length; l++){
            for( int c = 0; c < mtz.length; c++){
                mtz[l][c] = new SecureRandom().nextInt(100);
            }
        }
        for (int t=0; t <= 3; t++){
            soma += mtz[t][t];
        }
        System.out.println("=========================");
        for(int p=0; p < mtz.length; p++){
            for(int m=0;m < mtz.length; m++){
                System.out.printf("%d - ", mtz[p][m]);
            }
            System.out.println();
        }
        System.out.println("=========================");
        System.out.println(" A soma da Diagonal principal: " + soma);
    }
}