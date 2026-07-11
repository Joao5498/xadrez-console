package tabuleiro;

public class Peca {
    public Posicao posicao;
    public Cor cor;
    public int qteMovimentos;
    public Tabuleiro tab;

    public Peca(Tabuleiro tab, Cor cor ) {
        this.posicao = null;
        this.cor = cor;
        this.tab = tab;
        this.qteMovimentos = 0;
    }

    public Posicao getPosicao() {
        return posicao;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public Cor getCor() {
        return cor;
    }

    protected void setCor(Cor cor) {
        this.cor = cor;
    }

    public int getQteMovimentos() {
        return qteMovimentos;
    }

    public void setQteMovimentos(int qteMovimentos) {
        this.qteMovimentos = qteMovimentos;
    }

    public Tabuleiro getTab() {
        return tab;
    }

    public void setTab(Tabuleiro tab) {
        this.tab = tab;
    }
}
