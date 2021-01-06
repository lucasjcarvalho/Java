import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float salario = 0.00f, imposto, valor= 0.00f;

        salario = teclado.nextFloat();

        if (salario >= 0.0f && salario < 2000.00f){
            imposto = 0.0f;
            valor = 0.00f;
        }
        else if (salario > 2000.0f && salario <= 3000.00f){
            imposto = 8;
            valor = (salario - 2000.00f)*0.08f;
        }
        else if (salario > 3000.0f && salario <= 4500.00f){
            imposto = 18;
            valor = (salario - 3000.00f)*0.18f + (3000.00f - 2000.00f)*0.08f;
        }
        else if (salario > 4500.00f){
            imposto = 28;
            valor = (salario - 4500.00f)*0.28f + (4500.00f - 3000.00f)*0.18f + (3000.00f - 2000.00f)*0.08f;
        }
        if (valor == 0){
            System.out.println("Isento");
        }
        else {
             System.out.printf("R$ %.2f\n", valor);
        }


    }
}
