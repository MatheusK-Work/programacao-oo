public class ContaCorrente extends Conta {
    public ContaCorrente(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.001;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Corrente - Cliente: " + cliente + " - Saldo: " + saldo);
    }
}