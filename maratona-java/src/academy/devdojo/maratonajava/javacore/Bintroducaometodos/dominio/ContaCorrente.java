package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ContaCorrente {
    private Cliente cliente;
    private int numero;
    private double saldo;
    private boolean ehEspecial;
    private double limite;

    public ContaCorrente(Cliente cliente, int numero, double saldo, boolean ehEspecial, double limite) {
        this.cliente = cliente;
        this.numero = numero;
        this.saldo = saldo;
        this.ehEspecial = ehEspecial;
        this.limite = limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro. Valor do depósito menor ou igual á 0");
        } else {
            this.saldo += valor;
            System.out.println("Valor depositado: " + valor);
        }
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de: " + valor);
        } else if (ehEspecial == true && valor > limite) {
            this.saldo -= valor;
        } else {
            System.out.println("O valor sacado é maior do que o saldo.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo atual é: " + saldo);
        this.limite -= saldo;
        System.out.println("Saldo disponivel na conta: " + limite);
    }

    public void setLimite(double limite) {
        if (ehEspecial) {
            System.out.println("Limite alterado: "+limite);
        } else {
            System.out.println("A conta não é especial para alterar seu limite.");
        }
    }
}
