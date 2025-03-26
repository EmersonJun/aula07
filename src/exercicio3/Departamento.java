package exercicio3;

import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome, List<Funcionario> funcionarios) {
        this.nome = nome;
        this.funcionarios = funcionarios;
    }

    public Funcionario buscarFuncionarioPorNome(String nome){
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }
    public Funcionario buscarFuncionarioPorCpf(String cpf){
        for (Funcionario f : funcionarios) {
            if (f.getCpf().equalsIgnoreCase(cpf)) {
                return f;
            }
        }
        return null;
    }
    
    void adicionarFuncionario(Funcionario funcionario){
        if (buscarFuncionarioPorCpf(funcionario.getCpf()) == null) {
            funcionarios.add(funcionario);
        }
    }
    
    void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(buscarFuncionarioPorCpf(funcionario.getCpf()));
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }
    @Override
    public String toString() {
        return "Departamento [nome=" + nome + ", funcionarios=" + funcionarios + "]";
    }
    
}
