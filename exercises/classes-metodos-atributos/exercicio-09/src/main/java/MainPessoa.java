import java.time.LocalDate;

/**
 * Classe MainPessoa que define a aplicação para as classes e métodos existentes.
 * 
 */
public class MainPessoa {
    
    public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("Joao","Jon",LocalDate.of(2003,9,14));
    
    System.out.println("Nome: " + pessoa1.getNome() +"\nApelido: " + pessoa1.getApelido() + "\nIdade: " + pessoa1.getIdade());

    }
}
