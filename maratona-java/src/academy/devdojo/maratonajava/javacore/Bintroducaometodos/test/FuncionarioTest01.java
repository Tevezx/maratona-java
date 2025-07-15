package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Carlos");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{1200, 1000, 1000});

        funcionario.imprimir();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
