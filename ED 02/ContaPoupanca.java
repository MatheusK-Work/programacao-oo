public class ContaPoupanca extends Conta {
    public ContaPoupanca(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {
        saldo += saldo * 0.0008;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Poupança - Cliente: " + cliente + " - Saldo: " + saldo);
    }
}