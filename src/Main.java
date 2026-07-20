import tabuleiro.*;
import java.util.Scanner;
import xadrez.*;

public static void main(String[] args) throws TabuleiroException {
    Scanner leitor = new Scanner(System.in);
    try {
        PartidaDeXadrez partida = new PartidaDeXadrez();

        while (!partida.terminada) {
            Tela.imprimirTabuleiro(partida.tab);
            System.out.printf("\nOrigem:");
            Posicao origem = Tela.lerPosicaoXadrez().toPosicao();
            System.out.printf("\nDestino:");
            Posicao destino = Tela.lerPosicaoXadrez().toPosicao();
            System.out.println("");

            partida.executaMovimento(origem, destino);

        }



    } catch (TabuleiroException e) {
        System.out.println(e);
    }

    leitor.next();
}


public static void limpar() {
    try {
        String sistema = System.getProperty("os.name");

        if (sistema.contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls")
                    .inheritIO()
                    .start()
                    .waitFor();
        } else {
            new ProcessBuilder("clear")
                    .inheritIO()
                    .start()
                    .waitFor();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
