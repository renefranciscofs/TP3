package tp3_12;

public class Circulo {
    double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    double calcularArea() {
        return Math.PI * (raio * raio);
    }
}

