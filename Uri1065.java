import java.util.Scanner;

public class Uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        int valores = 0, pares = 0;

        for (int cont=1; cont <=5 ; cont++){
            valores = teclado.nextInt();
            if (valores%2 == 0){
                pares++;
            }
     
        }

        System.out.println(pares + " valores pares");

    }
}