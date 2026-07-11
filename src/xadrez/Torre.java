package xadrez;

import tabuleiro.Cor;
import tabuleiro.Peca;
import tabuleiro.Tabuleiro;

public class Torre extends Peca {
    public Torre(Tabuleiro tab, Cor cor) {
        super(tab, cor);
    }

    @Override
    public String toString(){
        return "T";
    }
}
