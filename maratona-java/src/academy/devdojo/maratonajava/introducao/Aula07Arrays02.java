package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // bte, short, long, double, int e float o valor iniciado é 0
        // char o valor iniciado é '\u0000' que imprimi um espaço em branco
        // boolean o valor iniciado é false
        // String o valor é null
        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Naruto";
        nomes[2] = "Sasuke";

        //i comeca do indice 0, precisa ser ate o 2 e vai colocando mais um a cada volta no laço
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
