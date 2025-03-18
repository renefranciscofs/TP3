package tp3_2;

// Classe que representa um produto em um supermercado
class Produto {
    // Atributos da classe
    String nome; // Nome do produto
    double preco; // Preço do produto
    int quantidadeEmEstoque; // Quantidade disponível no estoque

    // Construtor para inicializar os atributos
    Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Método para exibir informações do produto
    void exibirDetalhes() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Quantidade em estoque: " + quantidadeEmEstoque);
    }
}

// Classe principal para testar a classe Produto
public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe Produto
        Produto meuProduto = new Produto("Arroz", 5.99, 50);

        // Chama o método para exibir os detalhes do produto
        meuProduto.exibirDetalhes();
    }
}
