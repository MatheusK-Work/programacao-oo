import java.util.Scanner;

/**
 * Classe responsável por iniciar o jogo e interagir com o usuário.
 * O jogador deve tentar descobrir um número secreto entre 1 e 100.
 */
public class Main {

    /**
     * Ponto de entrada do jogo.
     *
     * @param args Argumentos passados via linha de comando (não utilizados).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Placar ranking = new Placar();

        System.out.print("Informe seu nome para começar: ");
        String nomeJogador = input.nextLine();

        Jogador participante = new Jogador(nomeJogador);
        Jogo partida = new Jogo(participante);

        boolean jogoAtivo = true;

        while (jogoAtivo) {
            System.out.print("Tente adivinhar o número (entre 1 e 100): ");
            int palpite = input.nextInt();
            String resposta = partida.realizarJogada(palpite);

            switch (resposta) {
                case "maior":
                    System.out.println("Tente um número menor.");
                    break;
                case "menor":
                    System.out.println("Tente um número maior.");
                    break;
                case "acertou":
                    System.out.println("\n🎉 Parabéns! Você acertou o número!");
                    System.out.println("Total de tentativas: " + participante.getTentativas());
                    System.out.println("Sua pontuação final: " + participante.getPontuacao());
                    jogoAtivo = false;
                    break;
            }
        }

        // Registra o jogador no placar e exibe o ranking final
        ranking.adicionarJogador(participante);
        ranking.mostrarRanking();

        input.close();
    }
}
