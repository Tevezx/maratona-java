package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasRepeticao01 {
    public static void main(String[] args) {
        //while, do while e for
        int count = 0;
        while(count < 10){
            System.out.println(count);
            count++;
        }
        count = 0;
        do {
            System.out.println("Dentro DO-While"+count);//do = faça
            count++;
        }while (count<10);

        for (int i = 0; i < 10; i++){
            System.out.println("For "+i);
        }
    }
}
