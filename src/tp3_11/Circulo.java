package tp3_11;

public class Circulo {
    double raio;

    // Construtor
    Circulo(double raio) {
        this.raio = raio;
    }

    // Método para calcular a área do círculo
    double calcularArea() {
        return Math.PI * (raio * raio);
    }
}

