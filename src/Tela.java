import tabuleiro.*;

public class Tela {
    public static void imprimirTabuleiro(Tabuleiro tab){
        for(int i = 0; i < tab.linhas; i++  ){
            for (int j = 0; j<tab.colunas; j++){
                if(tab.peca(i,j) == null){
                    System.out.print("- ");
                }
                else {
                    System.out.print(tab.peca(i, j) + " ");
                }
            }
            System.out.println("");
        }
    }
}
