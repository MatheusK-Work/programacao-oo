public class Arqueiro extends Personagem {
    public Arqueiro(String nome) {
        super(nome, 120, 25);
    }

    @Override
    public void usarHabilidadeEspecial() {
        System.out.println(nome + " usou Chuva de Flechas!");
    }
}