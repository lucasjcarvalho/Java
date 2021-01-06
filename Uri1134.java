import java.util.Scanner;

public class Uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, alc=0, gas=0, die=0;

        do {
            codigo = teclado.nextInt();
            if (codigo == 1){
                alc++;
            }
            if (codigo == 2){
                gas++;
            }
            if (codigo == 3){
                die++;
            }

        } while (codigo != 4);

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alc);
        System.out.println("Gasolina: "+ gas);
        System.out.println("Diesel: "+ die);


    }
}