import java.util.Scanner;

public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        
        double valores, soma=0;
        int contador=0;

        for (int i=1; i <= 6; i++){
        valores = teclado.nextDouble();
            if (valores > 0){
            contador++;
            soma = soma + valores;
            }  
        }

        System.out.println(contador + " valores positivos");
        System.out.printf("%.1f\n", soma/contador);
    }
}