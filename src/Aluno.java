public class Aluno {
    private String nome, sobrenome;
    private Matricula matricula; //composição
    private Materia materia; //associação
    private Endereco endereco; // Agregação

    public Aluno(String nome, String sobrenome, Endereco endereco, Materia materia){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = new Matricula(1);
        this.endereco = endereco;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Matricula getMatricula() {
        return matricula;
    }

    public void setMatricula(Matricula matricula) {
        this.matricula = matricula;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setRua(String rua){
        endereco.setRua(rua);
    }

    public String getRua(){
        return endereco.getRua();
    }

    @Override
    public String toString() {
        return "\nAluno [nome=" + nome + ", sobrenome=" + sobrenome + "\n   " + matricula + "\n   " + materia
        + "\n   " + endereco + "]";
    }
    
}
