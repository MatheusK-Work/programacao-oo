import java.util.List;
import java.util.Scanner;

public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    public void exibirMenu() {
        System.out.println("1. Adicionar Contato");
        System.out.println("2. Remover Contato");
        System.out.println("3. Listar Contatos");
        System.out.println("4. Sair");
    }

    public void mostrarContatos(List<Contato> contatos) {
        System.out.printf("%-20s %-15s %-25s\n", "Nome", "Telefone", "Email");
        for (Contato c : contatos) {
            System.out.printf("%-20s %-15s %-25s\n", c.getNome(), c.getTelefone(), c.getEmail());
        }
    }
}