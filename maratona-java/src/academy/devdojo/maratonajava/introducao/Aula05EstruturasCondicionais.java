package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizacao = idade >= 18;
        if (isAutorizacao) {
            System.out.println("Voce pode comprar bebidas alcolica");
        }
        // !
        if(!isAutorizacao){
            System.out.println("Voce nao pode comprar bebidas alcolicas");
        }
        boolean c = true;
        if(c == false){
            System.out.println("Não pode ser feito assim");
        }
        System.out.println("Fora do if");
    }
}
