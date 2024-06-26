package aulas.semana2;

public class Exercicio3 {
    public static void main(String[] args){
        int[] vetor = new int[5];
        int[][] matriz = new int[5][5];
    
        vetor = new int[] {1, 0, 0, 1, 1};
    
        matriz[0] = new int[] {1, 0, 0, 1, 1};
        matriz[1] = new int[] {1, 0, 1, 0, 0};
        matriz[2] = new int[] {1, 0, 0, 0, 1};
        matriz[3] = new int[] {0, 0, 0, 0, 0};
        matriz[4] = new int[] {1, 1, 0, 0, 0};
    
        String texto = "";

        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                texto += matriz[i][j] == 1 ? "# " : ". ";
            }
            System.out.println("| " + texto + "|");
            texto = "";
        }
    }
}
