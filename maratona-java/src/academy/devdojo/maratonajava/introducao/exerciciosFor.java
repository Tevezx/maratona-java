package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;


public class exerciciosFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Numeros Primos
        /*
        for (int i = 2; i <= 100; i++) {
            int divisores = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println("Numero primo: " + i);
            }
        }
    }
}/*

        /*
        //quebrar linhas com for
        System.out.println("Digite o numero de linhas: ");
        int linhas = scanner.nextInt();

        for(int i = 1; i <= linhas ; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*
        //tabuada com for
        System.out.println("Digite um numero para mostrar a tabuada: ");
        int num = scanner.nextInt();

        for(int i = 0;i <= 10; i++){
            System.out.println(num*i);
        }*/

        /*
        System.out.println("Tabuada do numero 1 á __?: ");
        int num = scanner.nextInt();

        int resultado = 0;

        for (int i = 1; i <= num; i++){
            System.out.println("Tabuada do numero: "+i);
            for (int j = 0; j <= 10; j++){
                resultado = i*j;
                System.out.println(resultado);
            }
        }*/
    }
}