public class Biblioteca {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.autor = "Cleriston";
        livro1.titulo = "Do Abismo ao universo";
        livro1.anoPublicacao = 2035;

        livro1.exibirInfo();

        Livro livro2 = new Livro();
        livro2.autor = "Thiago Nigro";
        livro2.titulo = "Do Mil a Um Milhao";
        livro2.anoPublicacao = 2002;

        livro2.exibirInfo();

        Livro livro3 = new Livro();
        livro3.autor = "Prof. Pier";
        livro3.titulo = "Aprendendo Inteligencia";
        livro3.anoPublicacao = 1995;

        livro3.exibirInfo();

    }
}
