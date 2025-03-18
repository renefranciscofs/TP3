package tp3_9;

public class TestaConta {
    public static void main(String[] args) {
        // Instanciando um objeto da classe Conta
        Conta conta1 = new Conta("João Silva", 12345, "001", 1000.0, "18/03/2025");

        // Exibindo informações iniciais da conta
        System.out.println("Informações iniciais da conta:");
        conta1.exibeInformacoes();

        // Realizando um saque
        System.out.println("Tentando sacar R$ 200,00...");
        conta1.saca(200.0);
        System.out.println("Saldo após saque: R$ " + conta1.saldo);
        System.out.println();

        // Realizando um depósito
        System.out.println("Depositando R$ 500,00...");
        conta1.deposita(500.0);
        System.out.println("Saldo após depósito: R$ " + conta1.saldo);
        System.out.println();

        // Calculando rendimento
        double rendimento = conta1.calculaRendimento();
        System.out.println("Rendimento mensal (10%): R$ " + rendimento);
        System.out.println();

        // Exibindo informações finais da conta
        System.out.println("Informações finais da conta:");
        conta1.exibeInformacoes();
    }
}

