import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste = 0, novo, percentual;
        String simbolo = "%";

        //entrada
        salario = teclado.nextFloat();

        if (salario >=0 && salario <= 400){
            reajuste = salario * 0.15;
        }
        else if (salario > 400 && salario <= 800)
            reajuste = salario * 0.12;
        else if (salario > 800 && salario <= 1200)
            reajuste = salario * 0.10;    
        else if (salario > 1200 && salario <= 2000)
            reajuste = salario * 0.07;
        else if (salario > 2000)
            reajuste = salario * 0.04;
        
    novo = salario + reajuste;
    percentual = ((novo/salario)-1)*100;
    System.out.printf("Novo salario: %.2f\n", novo);
    System.out.printf("Reajuste ganho: %.2f\n", reajuste);
    System.out.printf("Em percentual: %.0f %%\n", percentual);

    }
}