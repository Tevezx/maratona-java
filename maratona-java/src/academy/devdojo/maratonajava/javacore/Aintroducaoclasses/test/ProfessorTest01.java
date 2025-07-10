package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "João";
        professor.idade = 44;
        professor.sexo = 'M';

        System.out.println("Meu nome é " + professor.nome + ", tenho " + professor.idade + " anos" + " e meu sexo é " + professor.sexo);
    }
}
