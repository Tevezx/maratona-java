package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[]args){
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000000000L; // isso é um casting, estou forçando a variavel aceitar outro valor que nao seja permitido.
        long numeroGrande = 10000000;
        double salarioDouble = 2000.50;
        float salarioFloat = 2500.60F;
        byte idadeByte = -128; // se baseia por meio de bytes, indo de -128 até 127
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Carlos";

        System.out.println("Sua idade é: "+idade+" anos");
        System.out.println("Seu Salario é: "+salarioFloat+" Reais");
        System.out.println("Seu sexo é: "+caractere);
        System.out.println("Seu nome é: "+nome);
    }
}
