/**
 * Representa um jogador dentro do jogo, contendo seu nome, número de tentativas e sua pontuação.
 */
public class Jogador {

    // Armazena o nome do jogador
    private String nome;

    // Quantidade de tentativas realizadas
    private int tentativas;

    // Pontuação acumulada do jogador
    private int pontuacao;

    /**
     * Construtor da classe Jogador. Inicializa com nome e valores zerados.
     * 
     * @param nome Nome do jogador
     */
    public Jogador(String nome) {
        this.nome = nome;
        this.tentativas = 0;
        this.pontuacao = 0;
    }

    // Retorna o nome atual do jogador
    public String getNome() {
        return nome;
    }

    // Define um novo nome para o jogador
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Retorna quantas tentativas o jogador já realizou
    public int getTentativas() {
        return tentativas;
    }

    // Define uma nova quantidade de tentativas
    public void setTentativas(int tentativas) {
        this.tentativas = tentativas;
    }

    // Obtém a pontuação atual
    public int getPontuacao() {
        return pontuacao;
    }

    // Define uma nova pontuação
    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    // Adiciona pontos à pontuação atual
    public void somarPontuacao(int pontos) {
        this.pontuacao += pontos;
    }

    // Aumenta em uma unidade a contagem de tentativas
    public void adicionarTentativa() {
        this.tentativas++;
    }
}
