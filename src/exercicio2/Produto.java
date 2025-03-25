package exercicio2;

public class Produto {
    private String nome;
    private float preco;
    public Produto( String nome, float preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "produto [nome=" + nome + ", preco=" + preco + "]";
    }

    public int getCodigo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCodigo'");
    }

   

    
}
