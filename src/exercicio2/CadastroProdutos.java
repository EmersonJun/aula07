package exercicio2;
import java.util.List;

public class CadastroProdutos{
    private List<Produto> produtos;

    public CadastroProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public void adicionarProduto(Produto produto){
        if (buscarProdutoPorCodigo(produto.getCodigo())== null) {
            produtos.add(produto);
        }
    }

    public void removerProduto(Produto produto){
        if (buscarProdutoPorCodigo(produto.getCodigo())!= null) {
            produtos.remove(produto);
        }
    }

    public Produto buscarProdutoPorNome(String nome){
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    public Produto buscarProdutoPorCodigo(int codigo){
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                return produto;
            }
        }
        return null;
    }

    private int criarCodigo(){
        int res = 0;
        for(Produto p : produtos){
            if (p.getCodigo() > res) {
                res = p.getCodigo();
            }
        }
        return ++res;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "CadastroProdutos [produtos=" + produtos + "]";
    }

    
}
