package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro();

        carro.nome = "Fiat FastBack";
        carro.ano = 2025;
        carro.modelo = "SUV";

        carro2.nome = "Honda Civic";
        carro2.ano = 2008;
        carro2.modelo = "Hatch";

        //Referencia de objetos
        carro2 = carro3;

        carro3.nome = "Toyotta Corolla";
        carro3.ano = 2008;
        carro3.modelo = "Hatch";

        System.out.println("Meu ultimo carro é um: " + carro.nome + ". Modelo: " + carro.modelo + ". Ano: " + carro.ano);
        System.out.println("Meu segundo carro foi um: " + carro2.nome + ". Modelo: " + carro2.modelo + ". Ano: " + carro2.ano);
        System.out.println("Meu primeiro carro foi um: " + carro3.nome + ". Modelo: " + carro3.modelo + ". Ano: " + carro3.ano);


    }
}
