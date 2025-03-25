 package exercicio2;
 import java.util.ArrayList;
 import java.util.List;
// import Aluno;
// import Endereco;
// import Materia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("exercicio 1 - agenda");

        // Materia materia1 = new Materia("PHP", 10000);
        // Materia materia2 = new Materia("Java", 500);

        // Aluno aluno = new Aluno("Pedro", "Silva", new Endereco("XV", "800000", 123), materia2);

        // System.out.println(aluno);

        // aluno.getEndereco().setRua("Rua nova");

        // System.out.println(aluno);

        // aluno.setRua("Outra Rua");

        // System.out.println(aluno);

        // List<Materia> materias = new ArrayList<>();
        // materias.add(materia2);
        // materias.add(new Materia("C++", 10000));

        // materia2.setNome("JavaScript");
        // System.out.println(aluno);
        // System.out.println("\n" + materias);













        // Agenda agenda = new Agenda(new ArrayList<>());
        // Contato contato1 = new Contato("jonas", "2131232");
        // Contato contato2 = new Contato("joao", "2131232");
        // Contato contato3 = new Contato("josias", "2131232");
        // Contato contato4 = new Contato("joana", "2131232");

        // agenda.adicionarContato(contato4);
        // agenda.adicionarContato(contato3);
        // agenda.adicionarContato(contato2);
        // agenda.adicionarContato(contato1);
        
        // System.out.println(agenda);
        // agenda.removerContato(agenda.buscarContato("josias"));
        // System.out.println(agenda);
        // Contato novoContato = new Contato("josias", "2131232");
        // agenda.adicionarContato(novoContato);
        // System.out.println(agenda);














        Produto produto1 = new Produto("produto1", 10.5f);
        Produto produto2 = new Produto("produto2", 100.5f);
        Produto produto3 = new Produto("produto3", 1000.5f);
        Produto produto4 = new Produto("produto4", 10000.5f);

        CadastroProdutos estoque = new CadastroProdutos (new ArrayList<>());
        estoque.adicionarProduto(produto1);
        estoque.adicionarProduto(produto2);
        estoque.adicionarProduto(produto3);
        estoque.adicionarProduto(produto4);
        System.out.println(estoque);

        estoque.removerProduto(produto3);
        System.out.println(estoque);

        
    }
}
