public class Produto {
    String nome;
    double preco;
    int quantidadeEmEstoque;
    double valortotalDoEstoque;

    public void exibirInfo() {
        valortotalDoEstoque =preco* quantidadeEmEstoque;
        System.out.println("Produto: " +nome +"\n" +
                "Preço: "+ preco +"\n" +
                "Qt Estoque: "+ quantidadeEmEstoque+"\n" +
                "Valor total do Estoque: " + valortotalDoEstoque +"\n");
    }
}
