package tp3_4;

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

    // Método para alterar o preço do produto
    void alterarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    // Método para alterar a quantidade em estoque
    void alterarQuantidade(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    // Método para exibir informações do produto
    void exibirInformacoes() {
        System.out.println("Produto: " + nome + ", Preço: R$" + preco + ", Quantidade em estoque: " + quantidadeEmEstoque);
    }
}

// Classe principal para testar a classe Produto
public class Main {
    public static void main(String[] args) {
        // Instancia um objeto da classe Produto
        Produto meuProduto = new Produto("Arroz", 5.99, 50);

        // Exibe informações iniciais
        System.out.println("Informações iniciais do produto:");
        meuProduto.exibirInformacoes();

        // Atualiza preço e quantidade
        meuProduto.alterarPreco(6.49);
        meuProduto.alterarQuantidade(45);

        // Exibe informações atualizadas
        System.out.println("\nInformações atualizadas do produto:");
        meuProduto.exibirInformacoes();
    }
}
