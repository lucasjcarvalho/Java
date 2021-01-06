import java.util.Scanner;

public class Uri074{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int N; 
        int teste;

        for (int cont=1; cont <= N; cont++){
            teste = teclado.nextFloat();
            if (teste % 2 == 0 && teste > 0){
                System.out.println("EVEN POSITIVE");             
            }
            else if (teste % 2 == 0 && teste < 0){
                System.out.println("EVEN NEGATIVE")
            }
            else if (teste % 2 == 1 && teste > 0){
                System.out.println("ODD POSITIVE");
            }
             else if (teste % 2 == 1 && teste < 0){
                System.out.println("ODD NEGATIVE");
            }
             else if ( teste == 0){
                System.out.println("NULL");
            }          
        }
        
    }
}
