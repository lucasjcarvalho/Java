import java.util.Scanner;

public class Uri1143{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N, a=1, quad=1, cubo=1;

        N = teclado.nextInt();

        for (int cont=1; cont <=N ; cont++){
            System.out.print(a);
            System.out.print(" " + quad);
            System.out.println(" " + cubo);
            a++;
            quad=a*a;
            cubo=a*a*a;
        }
    }
}