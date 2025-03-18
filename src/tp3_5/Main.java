package tp3_5;

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

    // Métodos Getter (Leitura dos atributos)
    String getNome() {
        return nome;
    }

    double getPreco() {
        return preco;
    }

    int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    // Métodos Setter (Atualização dos atributos)
    void setNome(String novoNome) {
        this.nome = novoNome;
    }

    void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    void setQuantidadeEmEstoque(int novaQuantidade) {
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

        // Atualiza os atributos usando setters
        meuProduto.setNome("Feijão");
        meuProduto.setPreco(7.49);
        meuProduto.setQuantidadeEmEstoque(30);

        // Obtém os valores atualizados usando getters
        System.out.println("\nInformações atualizadas do produto:");
        System.out.println("Nome: " + meuProduto.getNome());
        System.out.println("Preço: R$" + meuProduto.getPreco());
        System.out.println("Quantidade em estoque: " + meuProduto.getQuantidadeEmEstoque());
    }
}
