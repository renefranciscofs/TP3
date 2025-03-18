package tp3_12;

public class TestaFiguras {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Circulo com raio 3.0
        Circulo circulo = new Circulo(3.0);

        // Instanciando um objeto da classe Esfera com raio 5.0
        Esfera esfera = new Esfera(5.0);

        // Chamando os métodos de cálculo
        double areaCirculo = circulo.calcularArea();
        double volumeEsfera = esfera.calcularVolume();

        // Exibindo os resultados no console
        System.out.println("Área do Círculo com raio 3.0: " + areaCirculo);
        System.out.println("Volume da Esfera com raio 5.0: " + volumeEsfera);
    }
}

