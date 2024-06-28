package aulas.semana3;

public class Calculadora {
    
    public static int numeroDeUsos = 0;

    public static int soma(int a, int b){
        Calculadora.numeroDeUsos++;
        return a+b;
    }

    public static int multiplicacao(int a, int b){
        Calculadora.numeroDeUsos++;
        return a*b;
    }

    public static int elevado(int base, int expoente){
        Calculadora.numeroDeUsos++;
        for(int i=0; i<expoente; i++){
            base *= base;
        }

        return base;
    }
}
