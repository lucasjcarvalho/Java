import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int dias, anos, meses;

        //entrada
        dias = teclado.nextInt();

        //processamento
        anos = dias / 365;
        dias = dias % 365;
        meses = dias / 30;
        dias = dias % 30;

        //saida
        System.out.println(anos + " ano(s)");
        System.out.println(meses + " mes(es)");
        System.out.println(dias + " dia(s)");
    }
}