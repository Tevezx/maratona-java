package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasRepeticao04 {
    /*
        Dado um valor de um carro, descubra em quantas vezes
        ele pode ser parcelado, a condição é que o valor da parcela precisa
        ser > ou = á 1000
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;

            if (valorParcela >= 1000) {
                System.out.println("Em " + parcela + " parcelas, voce irá pagar: " + valorParcela + "R$");
            } else {
                break;
            }
        }
    }
}
