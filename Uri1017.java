import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int TEMPO;
        double VM, LITROS;

        //entrada
        TEMPO = teclado.nextInt();
        VM = teclado.nextDouble();

        //processamento
        LITROS = (TEMPO * VM)/12;

        //saida
        System.out.printf("%.3f%n", LITROS);
    
    }
}