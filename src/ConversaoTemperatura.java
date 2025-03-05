import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       float cel, fah;

        System.out.println("Digie qual é a temperatura Celsius (ºC): " );
        cel = scanner.nextFloat();

        fah = cel * (9/5) + 32;

        System.out.println("A temperatura Celsius " + cel + "em fahrenheit é: " + fah);
    }
}
