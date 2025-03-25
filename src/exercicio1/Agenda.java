package exercicio1;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void adicionarContato(Contato contato){
        if (buscarContato(contato.getNome()) == null) {
            contatos.add(contato);
        }
    }

    public void removerContato(Contato contato){
        if (buscarContato(contato.getNome()) != null) {
            contatos.remove(contato);
        }
    }

    public Contato buscarContato(String nome){
        for (Contato contato : contatos) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + "]";
    }

}
