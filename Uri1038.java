import java.util.Scanner;

public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int codigo, qt;
        double total;

        //entrada
        codigo = teclado.nextInt();
        qt = teclado.nextInt();

        //processamento
        total = 0;
        if (codigo == 1){
            total = qt * 4.00;
        }
         if (codigo == 2){
            total = qt * 4.50;
        }
         if (codigo == 3){
            total = qt * 5.00;
        }
         if (codigo == 4){
            total = qt * 2.00;
        }
         if (codigo == 5){
            total = qt * 1.50;
        }

    System.out.printf("Total: R$ %.2f%n" , total);
  

    }
}