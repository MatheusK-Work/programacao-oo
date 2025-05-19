package sistema_login;
public class Visitante extends Usuario {
    public Visitante(String login, String senha) {
        super(login, senha);
    }

    public void exibirLogin() {
        System.out.println("Visitante - acesso restrito ao sistema.");
    }
}
