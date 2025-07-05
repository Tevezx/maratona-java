package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor
    // por exemplo: 25 primeiros de 50
    public static void main(String[] args) {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break; //Quebra o laço, nao o if, se nao o codigo quebra. Precisa estar dentro de laço ou switch
            }
            System.out.println(i);

        }
    }
}
