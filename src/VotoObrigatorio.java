import java.util.*;

public class VotoObrigatorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();
        if(idade < 16){
            System.out.println("Voce ainda não pode votar!");
        } else if (idade >= 16  && idade <= 17) {
            System.out.println("Voto facultativo!");
        }else if(idade >= 18 && idade <= 70){
            System.out.println("Voto obrigatorio!");
        }else{
            System.out.println("Voto facultativo!");
        }
    }
}
