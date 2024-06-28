package aulas.semana3;

public class Impressora {

    public int numeroDeUsos = 0;
    public char caractereEspecial = '-';

    public void imprimeBarra(int tamanhoTexto, char caractere){
        this.numeroDeUsos++;

        System.out.print(caractere);
        
        for(int i=0; i<tamanhoTexto; i++){
            System.out.print(caractere);
        }

        System.out.print(caractere);
        
        System.out.println("");
    }

    public void imprimeTexto(String texto){
        this.numeroDeUsos++;
        imprimeBarra(texto.length(), this.caractereEspecial);
        System.out.println(" " + texto + " ");
        imprimeBarra(texto.length(), this.caractereEspecial);        
    }
}
