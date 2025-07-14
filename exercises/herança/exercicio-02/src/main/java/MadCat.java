/**
 * Classe MadCat que herda da classe Personagens.
 */
public class MadCat extends Personagens{
    
    private String nome;
    private float dano_recebido;

    /**
     * Construtor padrão da classe MadCat.
     */
    public MadCat() {
    }

    /**
     * Construtor da classe MadCat.
     * @param energia A energia do MadCat.
     * @param nome O nome do MadCat.
     */
    public MadCat(float energia, String nome) {
        super(energia);
        this.nome = nome;
    }

    /**
     * Método para retornar o nome do MadCat.
     * @return O nome do MadCat.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do MadCat.
     * @param nome O nome do MadCat.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para retornar o dano que o MadCat recebeu.
     * @return O dano recebido pelo MadCat.
     */
    public float getDano_recebido() {
        return dano_recebido;
    }

    /**
     * Método para definir o dano que o MadCat recebeu.
     * @param dano_recebido O dano recebido pelo MadCat.
     */
    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }

    

}
