package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class ExerciciosArrays {
    public static void main(String[] args) {
        /* Soma de 5 numeros
        int[] numerosInt = {1,2,3,4,5};
        int soma = 0;

        for (int i : numerosInt) {
            soma += i;
            System.out.println("Soma: "+soma);
        }
         */
        /*
        int [] numeros = new int[10];
        int maior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite um numero: ");
            numeros[i] = scanner.nextInt();

            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("Numero maior: "+maior);
        scanner.close();
         */

        /*
        Projeto: Controle de Estoque Simples
        Cadastrar até 10 produtos (nome + quantidade).
        Exibir lista de produtos cadastrados.
        Permitir "vender" produtos, atualizando a quantidade.
         */

        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[10];
        int[] produtos = new int[10];
        int totalProdutos = 0;

        while (true) {

            System.out.println("=========Bem vindo ao menu==========");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Produtos");
            System.out.println("3 - Vender");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando...");
                    break;
                case 1:
                    if (totalProdutos >= 10) {
                        System.out.println("Atingiu o máximo de produtos!");
                        break;
                    }

                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.next();
                    System.out.print("Quantidade: ");
                    int qntd = scanner.nextInt();

                    nomes[totalProdutos] = nomeProduto;
                    produtos[totalProdutos] = qntd;

                    totalProdutos++;

                    System.out.println(qntd + " " + nomeProduto + " Cadastrado(a)!");
                    break;
                case 2:
                    System.out.println("Lista de Produtos: ");
                    if (totalProdutos == 0) {
                        System.out.println("Nenhum produto cadastrado!");
                    }
                    for (int i = 0; i < totalProdutos; i++) {
                        System.out.println((i + 1) + " - Produtos cadastrados: " + produtos[i] + " " + nomes[i]);
                    }
                    break;
                case 3:
                    for (int i = 0; i < totalProdutos; i++) {
                        System.out.println((i + 1) + " - Produtos cadastrados: " + produtos[i] + " " + nomes[i]);
                    }

                    System.out.println("Digite o número do produto que deseja vender: ");
                    int escolha = scanner.nextInt();

                    if (escolha < 1 || escolha > totalProdutos) {
                        System.out.println("Essa opção não existe!");
                        break;
                    } else if (produtos[escolha-1] <= 0) {
                        System.out.println("Estoque zerado para este produto!");
                        break;
                    }else {
                        produtos[escolha - 1]--;
                        System.out.println("1 venda realizada!");
                    }

                default:
                    System.out.println("Escolha uma opção válida!");
                    break;
            }
        }


    }
}

