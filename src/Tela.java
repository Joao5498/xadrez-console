import tabuleiro.*;
import java.util.Scanner;
import xadrez.PosicaoXadrez;

public class Tela {
    private static final String amarelo = "\u001B[33m";
    public static final String padrao = "\u001B[0m";

    public static void imprimirTabuleiro(Tabuleiro tab){
        for(int i = 0; i < tab.linhas; i++  ){
            System.out.print(8 - i + " ");
            for (int j = 0; j<tab.colunas; j++){
                if(tab.peca(i,j) == null){
                    System.out.print("- ");
                }
                else {
                    imprimirPeca(tab.peca(i, j));
                    System.out.print(" ");
                }
            }

            System.out.println("");
        }
        System.out.print("  a b c d e f g h");
    }

    public static PosicaoXadrez lerPosicaoXadrez(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char coluna = s.charAt(0);
        int linha = Integer.parseInt(String.valueOf(s.charAt(1)));

        return new PosicaoXadrez(coluna, linha);
    }

    public static void imprimirPeca(Peca peca){
        if(peca.cor == Cor.Branca){
            System.out.print(peca);
        }else {
            System.out.print(amarelo + peca + padrao );

        }
    }

}
