import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Didige 5 notas de um aluno: ");
        double media = 0, soma, notas;
        soma = 0;
        for(int i = 0; i < 5; i++){
            notas = sc.nextDouble();
            soma = soma + notas;
        }
        media = soma / 5 ;
        if(media >= 7){
            System.out.println("Media "+media+" Situacao do aluno: Aprovado!");
        }else{
            System.out.println("Media "+media+" Situacao do aluno: Reprovado!");
        }
    }

}
