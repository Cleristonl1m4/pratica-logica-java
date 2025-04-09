public class Turma {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Amanda";
        aluno1.idade = 23;
        aluno1.nota = 10;

        aluno1.exibirInf();

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Daniela";
        aluno2.idade = 27;
        aluno2.nota = 11;

        aluno2.exibirInf();

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Allyson";
        aluno3.idade = 25;
        aluno3.nota = 12;

        aluno3.exibirInf();
    }
}
