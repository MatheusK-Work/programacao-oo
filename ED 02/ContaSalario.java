public class ContaSalario extends Conta {
    public ContaSalario(String cliente, double saldoInicial) {
        super(cliente, saldoInicial);
    }

    @Override
    public void aplicarJurosDiarios() {}

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta Salário - Cliente: " + cliente + " - Saldo: " + saldo);
    }
}