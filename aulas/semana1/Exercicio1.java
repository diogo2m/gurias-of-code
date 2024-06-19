package aulas.semana1;
import java.util.Scanner;

public class Exercicio1{
    public static void main(String[] args){
        int numero1, numero2, resultado;
        Scanner leitor = new Scanner(System.in);

        numero1 = leitor.nextInt();
        numero2 = leitor.nextInt();

        resultado = numero1 + numero2;
        System.out.println("O resultado eh: " + resultado);

        leitor.close();
    }
}
