package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Carlos";
        funcionario.idade = 18;
        funcionario.salario = new double[]{0,1,10};

        funcionario.imprimir();
        funcionario.calcularMedia();
    }
}
