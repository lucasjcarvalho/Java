import java.util.Scanner;

public class Uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int X = 0, contador=1;

        X = teclado.nextInt();


            if (X%2 == 0){
                X++;
            }
             for (int cont=1 ; cont <= 6; cont++){

                if (X%2 == 1){
                System.out.println(X);
                X +=2;
                }
            }

        




    }
}