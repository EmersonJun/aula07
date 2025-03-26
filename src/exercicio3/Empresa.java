package exercicio3;

import java.util.List;

public class Empresa {
    private List<Departamento> departamentos;

    public Empresa(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public Departamento buscarDepartamento(Departamento departamento){
        for (Departamento d : departamentos) {
            if (departamento.getNome().equalsIgnoreCase(d.getNome())) {
                return d;
            }
        }
        return null;
    }

    public void removerFuncionario(Funcionario funcionario){
        for (Departamento d : departamentos) {
            d.removerFuncionario(funcionario);
        }
    }

    //  public void adicionarFuncionario(Funcionario funcionario, String nomeDepartamento){
    //      for (Departamento d : departamentos) {
    //          if (d.getNome().equalsIgnoreCase(nomeDepartamento)) {
    //              if (buscarFuncionarioPorCpf(nomeDepartamento)) {
                    
    //              }
                    
    //              }
    //          }
    //      }
    //  }

    public Funcionario buscarFuncionarioPorNome(String nome){
        Funcionario f = null;
        for (Departamento d : departamentos) {
            f =d.buscarFuncionarioPorNome(nome);
            if (f != null) {
                return f;
            }
        }
        return f;
    }
    public Funcionario buscarFuncionarioPorCpf(String cpf){
        Funcionario f = null;
        for (Departamento d : departamentos) {
            f =d.buscarFuncionarioPorNome(cpf);
            if (f != null) {
                return f;
            }
        }
        return f;
    }

    public void adicionarDepartamento(Departamento departamento){
        if (buscarDepartamento(departamento) == null) {
            departamentos.add(departamento);
        }
    }

    public void removerDepartamentos(Departamento departamento){
        departamentos.remove(buscarDepartamento(departamento));
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(List<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    @Override
    public String toString() {
        return "Empresa [departamentos=" + departamentos + "]";
    }
    
}
