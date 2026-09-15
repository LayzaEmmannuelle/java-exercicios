/**
 * Classe que representa o personagem MegaBob, herda da classe Personagens.
 * Possui nome e controle de dano recebido.
 * 
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
     * Construtor da classe MegaBob com energia e nome.
     * 
     * @param energia Valor que representa a energia do personagem
     * @param nome Nome do personagem
     */
    public MegaBob(float energia, String nome) {
        super(energia);
        this.nome = nome;
    }

    /**
     * Retorna o nome do personagem.
     * 
     * @return Nome do personagem.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do personagem.
     * 
     * @param nome Novo nome do personagem
     */
    public void setNome(String cod) {
        this.nome = cod;
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
