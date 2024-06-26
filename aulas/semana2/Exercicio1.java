package aulas.semana2;

public class Exercicio1 {
    public static void main(String[] args){
        int[] vetor = new int[5];
        int[][] matriz = new int[5][5];
    
        vetor = new int[] {1, 0, 0, 1, 1};
    
        matriz[0] = new int[] {1, 0, 0, 1, 1};
        matriz[1] = new int[] {1, 0, 1, 0, 0};
        matriz[2] = new int[] {1, 0, 0, 0, 1};
        matriz[3] = new int[] {0, 0, 0, 0, 0};
        matriz[4] = new int[] {1, 1, 0, 0, 0};
    
        int contador = 0;
        int numero = 1;

        for(int i=0; i<vetor.length; i++){
            /* 
             * ############ OPARADOR TERNÁRIO ############
             * O operador ternário é uma forma sucinta de
             * uma estrutura de comparação. Sua sintaxe
             * funciona da seguinte forma:
             * 
             * CONDICAO ? VALOR1 : VALOR2;
             * 
             * se a condição for verdadeira, será retornado o VALOR1
             * se for falso, retornará o VALOR2 
             * 
             * ###########################################*/
            
            contador += vetor[i] == numero ? 1 : 0;
        }

        System.out.println("O número " + numero + " aparece " + contador + " vezes no vetor.");
    }
}
