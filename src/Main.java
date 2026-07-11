import tabuleiro.Cor;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import java.util.Scanner;
import tabuleiro.TabuleiroException;
import xadrez.*;

public static void main(String[] args) throws TabuleiroException {
    Scanner leitor = new Scanner(System.in);
    try {
        Tabuleiro tab = new Tabuleiro(8, 8);

        tab.colocarPeca(new Torre(tab, Cor.Preta), new Posicao(0, 0));
        tab.colocarPeca(new Torre(tab, Cor.Preta), new Posicao(1, 9));
        tab.colocarPeca(new Rei(tab, Cor.Preta), new Posicao(2, 4));
        //tab.colocarPeca(new Rei(tab, Cor.Preta), new Posicao(2, 4));

        Tela.imprimirTabuleiro(tab);
    }catch (TabuleiroException e){
        System.out.println(e);
    }






    leitor.next();
}
