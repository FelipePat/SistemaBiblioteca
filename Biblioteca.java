
import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    
    private List<Livro> livros = new ArrayList<>();
    public void cadastrarLivro(Livro livro){
        livros.add(livro);
    }   
    public void emprestar(long id){
        for(Livro livro : livros){
            if(livro.getId() == id && livro.isDisponivel()){
                livro.setDisponivel(false);
                System.out.println("Livro emprestado com sucesso!");
                return;
            }
        }
        System.out.println("Livro indisponível para empréstimo.");
    }
}
