package tp3_11;

public class Esfera {
    double raio;

    // Construtor
    Esfera(double raio) {
        this.raio = raio;
    }

    // Método para calcular o volume da esfera
    double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}

