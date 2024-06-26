package aulas.semana2;

import java.util.Scanner;

public class Main{

    public static int tiro(int[][] matriz, int linha, int coluna){
        final int AGUA = 0;
        final int NAVIO = 1;

        if(matriz[linha][coluna] == NAVIO){
            System.out.println("Navio!");
            matriz[linha][coluna] = AGUA;
            return NAVIO;
        }
        else{
            System.out.println("Agua!");
            return AGUA;
        }
    }

    public static boolean ganhou(int[][] matriz){
        final int AGUA = 0;
        final int NAVIO = 1;

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                if(matriz[i][j] == NAVIO){
                    return false;
                }
            }
        }

        return true;
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
    
        int linha, coluna;
        int tempo = 0;

        Scanner leitor = new Scanner(System.in);

        while(!ganhou(matriz)){
            System.out.print("Digite a coordenada X: ");
            linha = leitor.nextInt();

            System.out.print("Digite a coordenada Y: ");
            coluna = leitor.nextInt();

            tiro(matriz, linha, coluna);
            tempo++;
        }

        leitor.close();

        System.out.println("Voce ganhou, demorando " + tempo + " rodadas.");
    }
}
