import java.util.Scanner;

public class Uri1046{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, intervalom, iniciom, finalm, duracao, inicionovo;

        inicio = teclado.nextInt();
        fim = teclado.nextInt();

        iniciom = inicio * 60;
        finalm = fim * 60;

        intervalom = finalm - iniciom;

        if (intervalom > 0){
           System.out.println("O JOGO DUROU " + intervalom/60 + " HORA(S)");
        }
        else if (intervalom == 0)
           System.out.println("O JOGO DUROU 24 HORA(S)");
        else if (intervalom < 0){
            inicionovo = 1440 - iniciom;

            System.out.println("O JOGO DUROU " + ((finalm + inicionovo)/60) + " HORA(S)");
        }

    }
}