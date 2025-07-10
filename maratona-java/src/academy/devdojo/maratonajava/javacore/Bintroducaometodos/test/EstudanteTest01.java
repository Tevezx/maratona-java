package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Carlos";
        estudante01.idade = 18;
        estudante01.sexo = 'M';

        estudante2.nome = "Ana";
        estudante2.idade = 18;
        estudante2.sexo = 'F';

        impressoraEstudante.imprime(estudante01);
        //A variavel estudante morre, podendo passar a ter outro valor
        impressoraEstudante.imprime(estudante2);

        impressoraEstudante.imprime(estudante01);
        impressoraEstudante.imprime(estudante2);
    }
}
