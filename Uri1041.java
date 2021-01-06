import java.util.Scanner;

public class Uri1041{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double x, y;

        // entrada
        x = teclado.nextDouble();
        y = teclado.nextDouble();

        //processamento
        if (x > 0) {
            if (y > 0) {
                System.out.println("Q1");
                }
                if (y < 0){
                System.out.println("Q4");
                }
        } 
            if (x < 0 ) {
                if (y > 0) {
                    System.out.println("Q2");
                }
                if (y < 0){
                System.out.println("Q3");
                 }
            }

        if (x == 0.0){
            if (y != 0.0){
            System.out.println("Eixo Y");
            }
            if (y == 0.0){
            System.out.println("Origem");
            }
        }
        if (y == 0.0){
            if (x != 0.0){
            System.out.println("Eixo X");
            }
           
        }

    }
}