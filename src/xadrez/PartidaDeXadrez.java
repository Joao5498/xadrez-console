package xadrez;
import tabuleiro.*;

public class PartidaDeXadrez {
    public Tabuleiro tab;
    private int turno;
    private Cor jogadorAtual;
    public boolean terminada;

    public Tabuleiro get_Tabuleiro(){
        return this.tab;
    }

    private void set_Tabuleiro(Tabuleiro tab){
        this.tab = tab;
    }

    public boolean getTerminada() {
        return terminada;
    }

    private void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    public PartidaDeXadrez(){
        this.tab = new Tabuleiro(8,8);
        this.turno = 1;
        this.jogadorAtual = Cor.Branca;
        colocarPecas();
    }

    public void executaMovimento(Posicao origem, Posicao destino){
        Peca p = tab.retirarPeca(origem);
        p.incrementaMovimentos();
        Peca pecaCapturada = tab.retirarPeca(destino);
        tab.colocarPeca(p, destino);
    }

    private void colocarPecas(){
        tab.colocarPeca(new Rei(tab, Cor.Branca), new PosicaoXadrez('d',1).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('c',1).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('c',2).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('d',2).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('e',1).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('e',2).toPosicao());

        tab.colocarPeca(new Rei(tab, Cor.Preta), new PosicaoXadrez('d',8).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Preta), new PosicaoXadrez('c',8).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Preta), new PosicaoXadrez('c',7).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Preta), new PosicaoXadrez('d',7).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Preta), new PosicaoXadrez('e',8).toPosicao());
        tab.colocarPeca(new Torre(tab, Cor.Preta), new PosicaoXadrez('e',7).toPosicao());


        //tab.colocarPeca(new Rei(tab, Cor.Branca), new PosicaoXadrez('d',1).toPosicao());
        //tab.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('e',1).toPosicao());
        //tb.colocarPeca(new Torre(tab, Cor.Branca), new PosicaoXadrez('f',1).toPosicao());
    }
}
