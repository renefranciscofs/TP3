package tp3_8;

public class Conta {
    //Atributos da conta
    String titular;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    //Construtor para inicializar os atributos
    Conta(String titular, int numero, String agencia, double saldo, String dataAbertura) {
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    //Método para saque
    void saca(double valor) {
        if (valor>0 && valor<=saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    //Método para depósito
    void deposita(double valor) {
        if (valor>0){
            saldo += valor;
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    //Método para calcular o rendimento mensal de 10%
    double calculaRendimento(){
        return saldo * 0.1;
    }
}
