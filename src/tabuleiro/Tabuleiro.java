package tabuleiro;

public class Tabuleiro {
    public int linhas;
    public int colunas;
    private Peca[][] pecas;

    public Tabuleiro(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        pecas = new Peca[linhas][colunas];
    }

    public Peca peca(int linha, int coluna){
        return pecas[linha][coluna];
    }

    public Peca peca(Posicao pos){
        return pecas[pos.linha][pos.coluna];
    }

    public boolean existePeca(Posicao pos) throws TabuleiroException {
        validarPosicao(pos);
        return peca(pos) != null;
    }

    public void colocarPeca(Peca p, Posicao pos) throws TabuleiroException {
        if(existePeca(pos)){
            throw new TabuleiroException("Já existe uma peça nessa posição");
        }
        pecas[pos.linha][pos.coluna] = p;
        p.posicao = pos;
    }

    public Peca retirarPeca(Posicao pos){
        if(peca(pos) == null ){
            return null;
        }
        Peca aux = peca(pos);
        aux.posicao = null;
        pecas[pos.linha][pos.coluna] = null;
        return aux;
    }


    public boolean posicaoValida(Posicao pos){
        if(pos.linha < 0 || pos.linha >= linhas || pos.coluna < 0 || pos.coluna>=colunas){
            return false;
        }
        return true;
    }

    public void validarPosicao(Posicao pos) throws TabuleiroException {
        if(!posicaoValida(pos)){
            throw new TabuleiroException("Posicao Invalida");
        }

    }
}
