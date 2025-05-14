public class Personagem {
    protected String nome;
    protected int hp;
    protected int ataqueBase;

    public Personagem(String nome, int hp, int ataqueBase) {
        this.nome = nome;
        this.hp = hp;
        this.ataqueBase = ataqueBase;
    }

    public void atacar(Personagem inimigo) {
        inimigo.defender(ataqueBase);
    }

    public void defender(int dano) {
        hp -= dano;
    }

    public void usarHabilidadeEspecial() {}

    public void status() {
        System.out.println(nome + " - HP: " + hp + " - Ataque: " + ataqueBase);
    }
}