import java.util.ArrayList;
import java.util.Scanner;

public class BuscaLinear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> vetornun = new ArrayList<Integer>();

        System.out.println("Digite 5 numeros: ");

        for(int i = 0; i < 5; i++){
            int y = sc.nextInt();
            vetornun.add(y);
        }
        System.out.println("Digite um numero para verificarmos se esta no vetor: ");
        int x = sc.nextInt();

        if(vetornun.contains(x)){
            System.out.println("O valor " +  x + " esta no vetor: \n" +
                    vetornun);
        }else{
            System.out.println("O valor "+ x +" nao esta no vetor");
        }
    }
}
