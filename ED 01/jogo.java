import java.util.Random;

/**
 * Classe responsável por controlar o funcionamento do jogo de adivinhação.
 * O objetivo é descobrir um número entre 1 e 100.
 */
public class Jogo {

    // Representa o jogador que está participando da rodada
    private Jogador jogador;

    // Número secreto gerado aleatoriamente
    private int numeroSecreto;

    /**
     * Construtor que prepara o jogo com um jogador e define o número secreto.
     *
     * @param jogador Instância do jogador que irá jogar
     */
    public Jogo(Jogador jogador) {
        this.jogador = jogador;
        this.numeroSecreto = gerarNumeroAleatorio();
    }

    // Gera um número aleatório entre 1 e 100
    private int gerarNumeroAleatorio() {
        return new Random().nextInt(100) + 1;
    }

    /**
     * Recebe o palpite do jogador e verifica se ele acertou, errou para mais ou para menos.
     *
     * @param tentativa Palpite do jogador
     * @return Resultado da jogada: "maior", "menor" ou "acertou"
     */
    public String realizarJogada(int tentativa) {
        jogador.adicionarTentativa();

        if (tentativa > numeroSecreto) {
