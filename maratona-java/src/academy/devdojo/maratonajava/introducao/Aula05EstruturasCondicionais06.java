package academy.devdojo.maratonajava.introducao;

//importando a bibliteca para utilizar scanner e permitir a entrada de dados pelo usuario
import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {

        //Inicializando o Scanner
        Scanner scanner = new Scanner(System.in);

        // Dados os valores de 1 a 7, imprima se é dia util ou final de semana
        // considerando 1 como domingo
        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo - Final de semana");
                break;
            case 2:
                System.out.println("Segunda - Dia útil");
                break;
            case 3:
                System.out.println("Terça-Feira - Dia útil");
                break;
            case 4:
                System.out.println("Quarta-Feira - Dia útil");
                break;
            case 5:
                System.out.println("Quinta-Feira - Dia útil");
                break;
            case 6:
                System.out.println("Sexta-feira - Dia útil");
                break;
            case 7:
                System.out.println("Sábado - Final de semana");
                break;
            default:
                System.out.println("Digite um numero entre 1 á 7");
                break;
        }
        scanner.close();

        // atualizacao
        /*
            byte day = 1;
            // Using switch expressions (added in java 13)
            String answer = switch (day) {
                case 1, 7 -> "Final de semana";
                case 2, 3, 4, 5, 6 -> "Dia útil";
                default -> "Dia não existente";
             };
            System.out.println(answer);
         */
    }
}
