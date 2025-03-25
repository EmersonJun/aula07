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

    public Contato buscarContato(String nome){
        
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + "]";
    }

}
