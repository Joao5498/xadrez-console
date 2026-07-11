import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import java.util.Scanner;

public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    Tabuleiro tab = new Tabuleiro(8,8);

    Tela.imprimirTabuleiro(tab);

    leitor.next();
}
