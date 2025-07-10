package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante2.nome = "Ana";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        estudante01.imprime();
        estudante2.imprime();

    }
}
