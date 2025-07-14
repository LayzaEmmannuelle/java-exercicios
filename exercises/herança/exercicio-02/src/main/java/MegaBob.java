/**
 * Classe MegaBob que herda da classe Personagens.
 */
public class MegaBob extends Personagens{

    private String nome;
    private float dano_recebido;

    /**
     * Construtor padrão da classe MegaBob.
     */
    public MegaBob() {
    }

    /**
     * Construtor da classe MegaBob.
     * @param energia A energia do MegaBob.
     * @param nome O nome do MegaBob.
     */
    public MegaBob(float energia, String nome) {
        super(energia);
        this.nome = nome;
    }

    /**
     * Método para retornar o nome do MegaBob.
     * @return O nome do MegaBob.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do MegaBob.
     * @param cod O nome do MegaBob.
     */
    public void setNome(String cod) {
        this.nome = cod;
    }

    /**
     * Método para retornar o dano que o MegaBob recebeu.
     * @return O dano recebido pelo MegaBob.
     */
    public float getDano_recebido() {
        return dano_recebido;
    }

    /**
     * Método para definir o dano que o MegaBob recebeu.
     * @param dano_recebido O dano recebido pelo MegaBob.
     */
    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }

    
    
}
