package folha_pagamento;
public class FuncionarioTemporario extends Funcionario {
    public FuncionarioTemporario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase - 100;
    }
}
