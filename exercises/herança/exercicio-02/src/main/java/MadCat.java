/**
 * Classe que representa a personagem MadCat, herda da classe Personagens.
 * Possui nome e controle de dano recebido.
 * 
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
     * Construtor da classe MadCat com energia e nome.
     * 
     * @param energia Valor que representa a energia da personagem
     * @param nome Nome da personagem
     */
    public MadCat(float energia, String nome) {
        super(energia);
        this.nome = nome;
    }

    /**
     * Retorna o nome da personagem.
     * 
     * @return Nome da personagem.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da personagem.
     * 
     * @param nome Novo nome da personagem
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o valor que representa a quantidade de dano recebido.
     * 
     * @return Valor que representa a quantidade de dano recebido
     */
    public float getDano_recebido() {
        return dano_recebido;
    }

    /**
     * Define o valor que representa a quantidade de dano recebido.
     * 
     * @param dano_recebido Novo valor que representa a quantidade de dano recebido
     */
    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }

    

}
