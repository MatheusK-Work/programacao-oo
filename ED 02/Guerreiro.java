public class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(nome, 150, 30);
    }

    @Override
    public void defender(int dano) {
        hp -= dano / 2;
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Golpe Duplo!");
    }
}