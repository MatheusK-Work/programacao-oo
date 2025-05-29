package ed04.view;

import java.util.Scanner;
import ed04.model.Contato;

public class ContatoView {
    private Scanner scanner = new Scanner(System.in);

    public String lerTexto(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void exibirContato(Contato contato) {
        System.out.printf("%s | %s | %s | %s%n", contato.getNome(), contato.getTelefone(), contato.getEmail(), contato.getDocumento());
    }
}