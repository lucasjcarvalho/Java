import java.util.Scanner;

public class Uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int X = 0;

        X = teclado.nextInt();

        for (int cont=1; cont <= X ; cont++){
            if (cont%2 == 1){
                System.out.println(cont);
            }
        }

    }
}