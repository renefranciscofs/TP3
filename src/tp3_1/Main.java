package tp3_1;

// Definição da classe Carro
class Carro {
    // Atributos (ou campos) da classe
    String modelo;
    int ano;

    // Construtor para inicializar os atributos
    Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    // Método para exibir informações do carro
    void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Ano: " + ano);
    }
}

// Classe principal para testar a classe Carro
public class Main {
    public static void main(String[] args) {
        // Cria um objeto da classe Carro
        Carro meuCarro = new Carro("Toyota Corolla", 2022);

        // Chama o método para exibir os detalhes do carro
        meuCarro.exibirDetalhes();
    }
}
