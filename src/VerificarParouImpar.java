import java.net.SocketTimeoutException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class VerificarParouImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite um numero: ");
        num = scanner.nextInt();

        if(num == 0){
            System.out.println(" O numero digitato foi 0");
        }else if(num % 2 == 0){
            System.out.println(" O numero digitato é par");
        }else{
            System.out.println("O numero digitado é ìmpar");
        }
    }
}
