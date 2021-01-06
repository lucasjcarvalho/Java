import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horainicio, horafim, minutoinicio, minutofim, duracao;

        horainicio = teclado.nextInt();
        minutoinicio=teclado.nextInt();
        horafim = teclado.nextInt();
        minutofim=teclado.nextInt();

        horainicio = horainicio * 60;
        horafim = horafim * 60;

        duracao = (horafim + minutofim) - (horainicio + minutoinicio);

        if (duracao <= 0){
           duracao = duracao + 1440;
        }
           System.out.println("O JOGO DUROU " + duracao/60 + " HORA(S) E " + duracao%60 + " MINUTO(S)");
        
    }
}