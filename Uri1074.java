import java.util.Scanner;

public class Uri1074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N; 
        int teste=0;
        N = teclado.nextInt();

        for (int cont=1; cont <= N; cont++){
            teste = teclado.nextInt();

            if (teste == 0){
                System.out.println("NULL");
            }        
            else{
                if (teste % 2 == 0){
                    System.out.print("EVEN");
                }
                else{
                    System.out.print("ODD");  
                }
                if (teste > 0){
                    System.out.println(" POSITIVE");
                }
                else {
                    System.out.println(" NEGATIVE");
                }
            }
        }
        
    }
}
