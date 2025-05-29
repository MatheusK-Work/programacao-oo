import java.util.ArrayList;
import java.util.List;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public void adicionar(Contato contato) {
        contatos.add(contato);
    }

    public void remover(String identificador) {
        contatos.removeIf(c -> {
            if (c instanceof PessoaFisica) {
                return ((PessoaFisica) c).getCpf().equals(identificador);
            } else if (c instanceof PessoaJuridica) {
                return ((PessoaJuridica) c).getCnpj().equals(identificador);
            }
            return false;
        });
    }

    public List<Contato> listar() {
        return contatos;
    }
}