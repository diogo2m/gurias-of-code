package aulas.semana1;
import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
        int numero1, numero2, resultado;
        boolean ehPrimo = false;

        Scanner leitor = new Scanner(System.in);

        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();

        resultado = numero1 + numero2;
        System.out.println("O resultado eh: " + resultado);

        leitor.close();

        for(int i=1; i<resultado; i++){
            if(resultado % i == 0){
                ehPrimo = true;
                break;
            }
        }

        if(ehPrimo){
            System.out.println("O resultado eh primo.");
        }
        else{
            System.out.println("O resultado nao eh primo.");
        }
    }
}

