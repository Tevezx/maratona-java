package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class exerciciosIf {
    public static void main(String[] args) {
        // Numero inteiro (positivo ou negativo)

        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Digite o numero: ");
        double num = scanner.nextDouble();

        if (num >= 0){
            System.out.println("Numero positivo");
        }else{
            System.out.println("Numero negativo");
        }
        scanner.close();
        */

        //Qual numero é maior
        //Escreva um programa que leia dois números e informe qual é o maior, ou se são iguais.
        /*
        System.out.println("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O numero "+num1+" è maior que o numero "+num2);
        } else if (num2 > num1) {
            System.out.println("O numero "+num2+" è maior que o numero "+num1);
        }else {
            System.out.println("\"O numero "+num1+" è igual ao numero "+num2);
        }
        scanner.close();
        */
        /*
        //Multiplo de 3 e 5
        System.out.println("Digite um numero: ");
        double num = scanner.nextDouble();

        if (num % 3 == 0 || num % 5 == 0){
            System.out.println("O numero é multiplo de 3 ou 5");
        }else{
            System.out.println("O numero não é multiplo de 3 ou 5");
        }
        scanner.close();
        */
        //Angulo de um triangulo
        // Receba os três lados de um triângulo e informe se ele é:Equilátero (3 lados iguais),
        //Isósceles (2 lados iguais) ou Escaleno (3 lados diferentes).

    /*
        System.out.println("Dê o primeiro lado do triângulo: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Dê o segundo lado do triângulo: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Dê o terceiro lado do triângulo: ");
        double lado3 = scanner.nextDouble();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Triângulo Equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Triângulo Isósceles");
        }else{
            System.out.println("Triângulo Escaleno");
        }
        scanner.close();
        */
    }
}
