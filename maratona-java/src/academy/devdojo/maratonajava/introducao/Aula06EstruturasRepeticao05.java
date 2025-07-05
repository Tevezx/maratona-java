package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula06EstruturasRepeticao05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do carro: ");
        double valorCarro = scanner.nextDouble();

        for (int parcela = (int) valorCarro; parcela >= 1; parcela--) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Em " + parcela + " parcelas, voce irá pagar: " + valorParcela + "R$");

        }
    }
}
