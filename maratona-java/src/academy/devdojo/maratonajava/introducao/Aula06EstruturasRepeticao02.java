package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao02 {
    public static void main(String[] args) {
        // Imprima todos os numeros pares até 1000000
        for (int i = 0; i <= 100000; i++){
            if (i%2 == 0){
            System.out.println("Numeros pares até 100000: "+i);
            }
        }
    }
}
