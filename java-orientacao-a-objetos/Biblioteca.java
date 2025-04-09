public class Biblioteca {
    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.autor = "Cleriston";
        livro.titulo = "Do Abismo ao universo";
        livro.anoPublicacao = 2035;


        livro.exibirInfo();
    }
}
