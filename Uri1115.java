import java.util.Scanner;

public class Uri1115{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int X, Y;


    do {

        X = teclado.nextInt();
        Y = teclado.nextInt();

            if (X > 0 && Y > 0){
                System.out.println("primeiro");
             }
            if (X > 0 && Y < 0){
                 System.out.println("quarto");
            }        
            if (X < 0 && Y < 0){
                System.out.println("terceiro");
            }
             if (X < 0 && Y > 0){
                System.out.println("segundo");
            }

        } while (X !=0 && Y !=0);
    }
}