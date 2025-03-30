import java.time.Year;
import java.util.Scanner;

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        if(idade < 18){
            System.out.println("Voce ainda nao pode se alistar ao Servico Militar");
        } else if(idade == 18){
            System.out.println("Com idade de "+ idade + " ja pode se alistar no Servico Militar" +
                    " e tem ate 6 mese para faze-lo.");
        }else if ( idade >= 19 && idade <= 45){
            System.out.println("Com idade de "+idade+" ainda pode se alistar ao Servico Militar" +
                    " mas tera que pagar uma multa.");
        }else{
            System.out.println("Com idade maior de 45 nao pode mais se alistar");
        }

    }
}
