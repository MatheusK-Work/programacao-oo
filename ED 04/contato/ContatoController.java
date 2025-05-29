package ed04.controller;

import java.util.ArrayList;
import java.util.List;
import ed04.model.Contato;
import ed04.model.PessoaFisica;
import ed04.model.PessoaJuridica;

public class ContatoController {
    private List<Contato> contatos = new ArrayList<>();

    public boolean adicionarContato(Contato contato) {
        for (Contato c : contatos) {
            if (c.getDocumento().equals(contato.getDocumento())) {
                return false;
            }
        }
        contatos.add(contato);
        return true;
    }

    public List<Contato> listarContatos() {
        return contatos;
    }

    public boolean removerContato(String documento) {
        return contatos.removeIf(c -> c.getDocumento().equals(documento));
    }

    public boolean atualizarContato(String documento, Contato novoContato) {
        for (int i = 0; i < contatos.size(); i++) {
            if (contatos.get(i).getDocumento().equals(documento)) {
                contatos.set(i, novoContato);
                return true;
            }
        }
        return false;
    }
}