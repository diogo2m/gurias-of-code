package aulas.semana2;

public class Exercicio2 {

    public static void mudarValorMatriz(int linha, int coluna, int[][] matriz, int valor){
        matriz[linha][coluna] = valor;
    }

    public static void main(String[] args){
        int[] vetor = new int[5];
        int[][] matriz = new int[5][5];
    
        vetor = new int[] {1, 0, 0, 1, 1};
    
        matriz[0] = new int[] {1, 0, 0, 1, 1};
        matriz[1] = new int[] {1, 0, 1, 0, 0};
        matriz[2] = new int[] {1, 0, 0, 0, 1};
        matriz[3] = new int[] {0, 0, 0, 0, 0};
        matriz[4] = new int[] {1, 1, 0, 0, 0};

        mudarValorMatriz(0, 0, matriz, 0);
    }
}
