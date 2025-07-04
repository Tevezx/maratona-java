package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class exerciciosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "";

        while (!senha.equals("1234")){
            System.out.println("Digite sua senha: ");
            senha = scanner.next();

            if (!senha.equals("1234")){
                System.out.println("Senha incorreta");
            }
        }
        System.out.println("Acesso permitido");
    }
}
