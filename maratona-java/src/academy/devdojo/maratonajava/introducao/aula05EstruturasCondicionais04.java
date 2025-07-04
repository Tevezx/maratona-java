package academy.devdojo.maratonajava.introducao;

public class aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double imposto;

        if(salarioAnual <= 34712){
            imposto = salarioAnual * 0.97;
        }else if (salarioAnual >= 34713 && salarioAnual <=68507) {
            imposto = salarioAnual * 0.3735;
        }else{
            imposto = salarioAnual * 0.4950;
        }
        System.out.println("O valor de imposto pago é: "+imposto);
    }
}
