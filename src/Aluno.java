public class Aluno {
    private String nome, sobrenome;
    private Matricula Matricula;//compodicao
    private Materia materia;//associacao
    private Endereco endereco;//agregacao

    public Aluno(String nome,String sobrenome, Endereco endereco2, Materia materia2){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.Matricula = new Matricula(1);
        this.endereco = endereco;
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
        return Matricula;
    }

    public void setMatricula(Matricula matricula) {
        Matricula = matricula;
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
        return "Aluno [nome=" + nome + ", sobrenome=" + sobrenome + ", Matricula=" + Matricula + ", materia=" + materia
                + ", endereco=" + endereco + "]";
    }
    
}
