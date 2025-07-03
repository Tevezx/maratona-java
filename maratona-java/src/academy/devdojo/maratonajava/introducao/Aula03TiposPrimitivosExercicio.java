package academy.devdojo.maratonajava.introducao;

/*
    Prática

    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

    eu <nome>, morando no endereço <endereco>,
    confirmo que ecebi o salario de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Carlos";
        String endereco = "R. Professor Joaquim Alvares Cruz, 790";
        double salario = 2000.10;
        String dataReciboSalario = "09/12/2006";

        System.out.println("Eu "+nome+", morando no endereço "+endereco+" confirmo que recebi o salario de "+salario+", na data "+dataReciboSalario);
    }

}
