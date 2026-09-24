package pets;

/**
 * Classe Cachorro representa um cachorro, que é uma extensão da classe Pet.
 * Ela possui um construtor que recebe o nome e a data de nascimento do
 * cachorro,
 * além de um método para obter informações formatadas sobre o cachorro e um
 * método para simular o som do cachorro.
 * 
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
public class Cachorro extends Pet {
    /**
     * Construtor da classe Cachorro.
     * Cria uma nova instância de Cachorro com o nome e data de nascimento
     * fornecidos.
     * 
     * @param nome       o nome do cachorro
     * @param nascimento a data de nascimento do cachorro
     */
    public Cachorro(String nome, String nascimento) {
        super(nome, nascimento);
    }

    /**
     * Método para criar e retornar uma String com as informações do cachorro.
     * Sobrescreve o método getInfo da classe Pet para incluir informações
     * específicas do cachorro.
     * 
     * @return uma String contendo o nome e a data de nascimento do cachorro.
     */
    @Override // sobrescreve o getinfo do pet
    public String getInfo() {
        return "Cachorro: " + getNome() + ", Nascimento: " + getNascimento();
    }

    /**
     * Método para simular o som do cachorro.
     * Imprime uma mensagem no console representando o som que o cachorro faz.
     */
    public void latir() {
        System.out.println("O cachorro " + getNome() + ": AUAU!");
    }
}