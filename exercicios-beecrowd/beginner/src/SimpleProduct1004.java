import java.io.IOException;
import java.util.Scanner;

public class SimpleProduct1004 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int number1, number2, productSimple;
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        productSimple = number1 * number2;
        System.out.println("PROD = " + productSimple);
    }
}
