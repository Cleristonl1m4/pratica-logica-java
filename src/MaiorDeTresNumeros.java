import java.util.*;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maiornumero = 0;
        System.out.println("Digite três numeros");
        for(int i = 0; i < 3; i++){
            numero = sc.nextInt();
            if(numero > maiornumero){
                maiornumero = numero;
            }
        }
        System.out.println("O maior numero é: " + maiornumero);
    }
}
