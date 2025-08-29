import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 2; i++){
            x += sc.nextInt();
        }
        System.out.println("X = "+x);
    }
}
