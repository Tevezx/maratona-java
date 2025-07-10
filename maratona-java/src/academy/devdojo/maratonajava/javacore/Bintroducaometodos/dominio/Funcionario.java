package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome = "Carlos";
    public int idade = 18;
    public double[] salario;

    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salario == null) {
            return;
        }
        for (double salarios : salario) {
            System.out.println("Salário: " + salarios);
        }
    }

    public void calcularMedia() {
        if (salario == null) {
            return;
        }
        double media = 0;
        for (double salarios : salario) {
            media += salarios;
        }
        media /= salario.length;
        System.out.println("A média dos salários: " + media);
    }
}



