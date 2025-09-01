import java.util.Locale;
import java.util.Scanner;

public class AreaOfTheCircle1002 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        final double n = 3.14159, area, ray;
        Scanner sc = new Scanner(System.in);
        ray = sc.nextDouble();
        area = n * Math.pow(ray,2);
        System.out.format("A=%.4f\n",area);
    }
}
