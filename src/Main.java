import tabuleiro.Cor;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import java.util.Scanner;
import tabuleiro.TabuleiroException;
import xadrez.*;

public static void main(String[] args) throws TabuleiroException {
    Scanner leitor = new Scanner(System.in);
    try {
        PosicaoXadrez pos = new PosicaoXadrez('a', 7);
        Tabuleiro tab = new Tabuleiro(8 ,8);

        tab.colocarPeca(new Rei(tab, Cor.Preta), new Posicao(4,0));
        tab.colocarPeca(new Torre(tab, Cor.Preta), new Posicao(5,0));
        tab.colocarPeca(new Torre(tab, Cor.Preta), new Posicao(6,0));

        tab.colocarPeca(new Rei(tab, Cor.Branca), new Posicao(1,0));
        tab.colocarPeca(new Torre(tab, Cor.Branca), new Posicao(2,0));
        tab.colocarPeca(new Torre(tab, Cor.Branca), new Posicao(3,0));

        Tela.imprimirTabuleiro(tab);

    }catch (TabuleiroException e){
        System.out.println(e);
    }

    leitor.next();
}
