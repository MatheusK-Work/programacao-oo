import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por armazenar e exibir os dados dos jogadores.
 */
public class Placar {

    /**
     * Lista com todos os participantes que jogaram.
     */
    private List<Jogador> jogadores;

    /**
     * Construtor padrão que inicializa a lista de jogadores.
     */
    public Placar() {
        jogadores = new ArrayList<>();
    }

    /**
     * Registra um novo jogador no placar.
     *
     * @param jogador Instância do jogador a ser adicionada.
     */
    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    /**
     * Exibe o ranking final dos jogadores, listando seus nomes e pontuações.
     */
    public void mostrarRanking() {
        System.out.println("\n=== PLACAR FINAL ===");
        for (Jogador jogador : jogadores) {
            System.out.printf("%s -> %d pontos\n", jogador.getNome(), jogador.getPontuacao());
        }
    }
}
