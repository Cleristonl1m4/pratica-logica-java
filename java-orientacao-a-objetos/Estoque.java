public class Estoque {
    public static void main(String[] args) {
        Produto item1 = new Produto();
        item1.nome = "Proteto Solar";
        item1.preco = 12.5;
        item1.quantidadeEmEstoque = 17;

        item1.exibirInfo();

        Produto item2 = new Produto();
        item2.nome = "Bota Pvc";
        item2.preco = 17.67;
        item2.quantidadeEmEstoque = 35;

        item2.exibirInfo();

        Produto item3 = new Produto();
        item3.nome = "Tela tapume";
        item3.preco = 10.75;
        item3.quantidadeEmEstoque = 5;

        item3.exibirInfo();
    }
}
