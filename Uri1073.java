import java.util.Scanner;

public class Uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int X = 0, quadrado = 0;

        X = teclado.nextInt();

        if (X%2 == 1){
            X++;
        }

        for (int cont=2; cont <= X ; cont += 2){
            quadrado = cont*cont;
            System.out.println(cont + " ^ 2 = " + quadrado);
        }
        

    }
}