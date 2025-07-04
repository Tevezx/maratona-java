package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se o salario for maior que 5000
        double salario = 6000;

        // operador ternario
        String resultado = salario > 5000 ? "Eu vou doar 500 reais" : "Ainda não tenho condicoes, mas irei ter";
        boolean isPosso = salario > 5000; // vai dar verdadeiro ou falso

        System.out.println(resultado);

        /*
        if(salario > 5000){
            resultado = mensagemDoar;
        }else{
            resultado = mensagemNaoDoar;
        }
        System.out.println(resultado);

 */
    }
}
