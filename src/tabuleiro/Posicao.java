package tabuleiro;

public class Posicao {
    public int coluna;
    public int linha;

    public Posicao(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public String ToString(){
        return linha + ", " + coluna;
    }


}
