import tabuleiro.Cor;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import java.util.Scanner;
import xadrez.*;

public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    Tabuleiro tab = new Tabuleiro(8,8);

    tab.colocarPeca(new Torre(tab, Cor.Preta), new Posicao(0,0));
    tab.colocarPeca(new Torre(tab, Cor.Preta), new Posicao(1,3));
    tab.colocarPeca(new Rei(tab, Cor.Preta), new Posicao(2,4));




    Tela.imprimirTabuleiro(tab);

    leitor.next();
}
