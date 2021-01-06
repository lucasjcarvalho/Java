import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int NUMBER, HORAS;
        double PORHORA, SALARY;

        //entrada
        NUMBER = teclado.nextInt();
        HORAS = teclado.nextInt();
        PORHORA = teclado.nextDouble();

        //processamento
        SALARY = HORAS * PORHORA;

        //saida
        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f%n" , SALARY);
    }
}