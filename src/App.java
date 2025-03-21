public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Materia materia1 = new Materia("php", 1000);
        Materia materia2 = new Materia("java", 100);

        Aluno aluno = new Aluno("jorge", "alcantra", new Endereco("15x", "123", 456), materia2);
        System.out.println(aluno);

        aluno.setRua("12b");
        System.out.println(aluno);
    }
}
