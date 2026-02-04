public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos a nossa Biblioteca
        Biblioteca minhaBiblioteca = new Biblioteca();

        // 2. Criamos alguns livros para teste
        Livro l1 = new Livro(1, "Java Efetivo", "Joshua Bloch", true);
        Livro l2 = new Livro(2, "Código Limpo", "Robert C. Martin", true);

        // 3. Cadastramos os livros no sistema
        minhaBiblioteca.CadastrarLivro(l1);
        minhaBiblioteca.CadastrarLivro(l2);

        // 4. Testamos a lógica de empréstimo
        System.out.println("--- Teste de Empréstimo ---");
        minhaBiblioteca.emprestar(1); // Deve funcionar
        minhaBiblioteca.emprestar(1); // Deve dizer que já está emprestado
        minhaBiblioteca.emprestar(99); // Deve dizer que não encontrou
    }
}