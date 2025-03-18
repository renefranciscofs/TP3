package tp3_12;

public class Esfera {
    double raio;

    Esfera(double raio) {
        this.raio = raio;
    }

    double calcularVolume() {
        return (4.0 / 3.0) * Math.PI * (raio * raio * raio);
    }
}
