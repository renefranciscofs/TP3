package tp3_6;

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
        // Cria um objeto Produto usando o construtor
        Produto produto1 = new Produto("Macarrão", 4.99, 100);

        // Exibe informações do produto para verificar a inicialização correta
        System.out.println("Informações do produto criado:");
        produto1.exibirInformacoes();
    }
}

// Usar um construtor facilita a criação de objetos porque permite inicializar todos os atributos obrigatórios no momento
// da instânciação, em uma única linha de código. Isso evita a necessidade de chamar vários métodos set separadamente,
// tornando o código mais limpo, legível e menos propenso a erros.
