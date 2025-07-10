package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisnumeros() {
        System.out.println(10 - 5);
    }

    //Metodo com parametro
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    //Metodo com retorno - com variaveis
    public double divideDoisNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return 0;
        } else {
            return num1 / num2;
        }
    }

    public void imprimeNumeros(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("Não existe divisão por zero");
            return; //Só pode ser utilizado quando o metodo for void (funciona como break)
        }
        System.out.println(num1 / num2);

    }

    //Tipos e Parametros
    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 99;
        numero2 = 33;
        System.out.println("Dentro do altera dois numeros");
        System.out.println("Num 1: " + numero1);
        System.out.println("Num 2: " + numero2);
    }

    //Arrays
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }

    //VarArgs - sintaxe mais simples do array: precisa ser o ultimo atributo
    public void somaVarArgs(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println(soma);
    }
}
