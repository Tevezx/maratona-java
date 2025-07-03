package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - * /
        int numero1 = 10;
        double numero2 = 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        // % pega o resto da divisao
        int resto = 20 % 2;
        System.out.println(resto);

        // < menor e > maior <= menor igual e >= maior igual == igualdade != diferente
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezIgualVinte = 10.0 == 20.5; // em boolean pode float, apenas quando os vaores forem inconparaveis não pode
        System.out.println("10 é maior que 20? " + isDezMaiorQueVinte);
        System.out.println("10.0 é igual á 20.5? " + isDezIgualVinte);

        // Operadores Lógicos - &&, ||, !
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQue = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQue = idade < 30 && salario <= 3381;

        System.out.println("isDentroDaLeiMaiorQue: "+isDentroDaLeiMaiorQue);
        System.out.println("isDentroDaLeiMenorQue: "+isDentroDaLeiMenorQue);

        double contaCorrente = 200;
        double contaPoupanca = 13000;
        float valorPlaystation = 5000F;
        boolean isPlaystation5Compravel = contaCorrente > valorPlaystation || contaPoupanca > valorPlaystation;

        System.out.println("IsPlaystationCompravel: "+isPlaystation5Compravel);

        //Operadores de Atribuicao: =, +=, -=, *=, /=, %=
        double bonus = 1800; //1800
        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0
        System.out.println("Seu bonus é de: "+bonus);
        // ++, --
        int contador = 0;
        contador++; //1
        contador--; //0
        System.out.println(contador);
    }
}
