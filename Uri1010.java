import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int PECA1, NUMPEC1, PECA2, NUMPEC2;
        double UNIT1, UNIT2, VALOR;

        //entrada
        PECA1 = teclado.nextInt();
        NUMPEC1 = teclado.nextInt();
        UNIT1 = teclado.nextDouble();
        PECA2 = teclado.nextInt();
        NUMPEC2 = teclado.nextInt();
        UNIT2 = teclado.nextDouble();

        //processamento
        VALOR = (NUMPEC1 * UNIT1) + (NUMPEC2 * UNIT2);

        //saida
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", VALOR);

    }
}