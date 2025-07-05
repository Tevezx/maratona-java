package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class ExerciciosSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("======CALCULADORA======");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("Digite uma opção: ");
        int opcao = scanner.nextInt();

        switch (opcao){
            case 1:{
                System.out.println("Digite o primeiro numero: ");
                double a = scanner.nextDouble();

                System.out.println("Digite o segundo numero: ");
                double b = scanner.nextDouble();

                System.out.println("O resultado da soma é: "+(a+b));
                break;
            }
            case 2: {

                System.out.println("Digite o primeiro numero: ");
                double a = scanner.nextDouble();

                System.out.println("Digite o segundo numero: ");
                double b = scanner.nextDouble();

                System.out.println("O resultado da subtração é: " + (a - b));
                break;
            }
            case 3: {
                System.out.println("Digite o primeiro numero: ");
                double a = scanner.nextDouble();

                System.out.println("Digite o segundo numero: ");
                double b = scanner.nextDouble();

                System.out.println("O resultado da multiplicação é: " + (a * b));
                break;
            }
            case 4: {
                System.out.println("Digite o primeiro numero: ");
                double a = scanner.nextDouble();

                System.out.println("Digite o segundo numero: ");
                double b = scanner.nextDouble();

                if (a == 0 || b == 0){
                    System.out.println("Error!! divisão por zero.");
                }else{
                    System.out.println("O resultado da divisão é: "+ (a/b));
                }
                break;
            }
            default: {
                System.out.println("Opção inválida");
                break;
            }
        }
        scanner.close();
    }
}
