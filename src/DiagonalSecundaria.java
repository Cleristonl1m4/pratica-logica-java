import java.security.SecureRandom;
public class DiagonalSecundaria {
    public static void main(String[] args) {
        int[][] mtz = new int[4][4];
        int soma =0, linhas = 0, colunas = 3;

        for(int l = 0; l < mtz.length; l++){
            for( int c = 0; c < mtz.length; c++){
                mtz[l][c] =new SecureRandom().nextInt(100);
            }
        }
        for (int t=0; t <=3; t++){
            soma += mtz[linhas][colunas];
            linhas += 1;
            colunas -= 1;
        }
        System.out.println("=========================");
        for(int p=0; p < mtz.length; p++){
            for(int m=0;m < mtz.length; m++){
                System.out.printf("%d - ", mtz[p][m]);
            }
            System.out.println();
        }
        System.out.println("=========================");
        System.out.println(" A soma da Diagonal Secundaria: " + soma);
    }
}