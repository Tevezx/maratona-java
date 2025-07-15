package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ContaCorrente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Carlos", "513.596.098-81");
        System.out.println("Nome: " + cliente.getNome() + " Cpf: " + cliente.getCpf());
        ContaCorrente contaCorrente = new ContaCorrente(cliente, 1234, 4500, false, 5000);

        contaCorrente.depositar(10);
        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        contaCorrente.sacar(4000);
        System.out.println("Saldo atual: " + contaCorrente.getSaldo());

        contaCorrente.consultarSaldo();

        contaCorrente.setLimite(5000);
    }
}
