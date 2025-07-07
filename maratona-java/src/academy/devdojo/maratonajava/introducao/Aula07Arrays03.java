package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        //int[] numeros = new int[3];
        //Iniciando o array direto com os valores (5 posições com 4 indices)
        int[] numeros = {1, 2, 3, 4, 5};
        /*
        //Indice especifico
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
        */
        //

        //for each - basicamente ele percorre toda a array sem precisar do for normal
        for (int num : numeros) {
            System.out.println(num);
        }
    }
}
