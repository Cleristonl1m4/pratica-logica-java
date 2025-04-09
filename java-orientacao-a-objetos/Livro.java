public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;

    void exibirInfo(){
        System.out.println("Autor: " + autor + "\n" +
                "Titulo: " + titulo + "\n" +
                "Ano de lançamento: " + anoPublicacao);
    }

}
