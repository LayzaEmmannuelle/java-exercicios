/**
 * Classe BadFish que herda da classe Personagens.
 */
public class BadFish extends Personagens{

    private String nome;
    private float dano_recebido;

    /**
     * Construtor padrão da classe BadFish.
     */
    public BadFish() {
    }

    /**
     * Construtor da classe BadFish.
     * @param energia A energia do BadFish.
     * @param cod O código do BadFish.
     */
    public BadFish(float energia, String cod) {
        super(energia);
        this.nome = cod;
    }

    /**
     * Método para retornar o nome do BadFish.
     * @return O nome do BadFish.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do BadFish.
     * @param cod O nome do BadFish.
     */
    public void setNome(String cod) {
        this.nome = cod;
    }

    /**
     * Método para retornar dano que o BadFish recebeu.
     * @return O dano recebido pelo BadFish.
     */
    public float getDano_recebido() {
        return dano_recebido;
    }

    /**
     * Método para definir o dano que o BadFish recebeu.
     * @param dano_recebido O dano recebido pelo BadFish.
     */
    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }
    
    
}
