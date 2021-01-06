import java.util.Scanner;

public class Uri1142{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, a=1, b=2, c=3;

        N = teclado.nextInt();

        for (int cont=1; cont <=N ; cont++){
            System.out.print(a);
            System.out.print(" " + b);
            System.out.print(" " + c);
            System.out.println(" PUM");
            a+=4;
            b+=4;
            c+=4;
        }
    }
}