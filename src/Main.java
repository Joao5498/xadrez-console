import tabuleiro.Cor;
import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import java.util.Scanner;
import tabuleiro.TabuleiroException;
import xadrez.*;

public static void main(String[] args) throws TabuleiroException {
    Scanner leitor = new Scanner(System.in);

    PosicaoXadrez pos = new PosicaoXadrez('c' ,7);

    System.out.println(pos.toPosicao());

    leitor.next();
}
