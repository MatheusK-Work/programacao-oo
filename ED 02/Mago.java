public class Mago extends Personagem {
    public Mago(String nome) {
        super(nome, 100, 40);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " lançou Bola de Fogo!");
    }
}