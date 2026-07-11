package xadrez;
import tabuleiro.Cor;
import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class Rei extends Peca {
    public Rei(Tabuleiro tab, Cor cor) {
        super(tab, cor);
    }

    @Override
    public String toString() {
        return "R";
    }
}
