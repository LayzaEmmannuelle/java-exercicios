/**
 * Classe que representa o personagem BadFish, herda da classe Personagens.
 * Possui nome e controle de dano recebido.
 * 
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
     * Construtor da classe BadFish com energia e nome.
     * 
     * @param energia Valor que representa a energia possuída pelo personagem
     * @param cod Nome do personagem
     */
    public BadFish(float energia, String cod) {
        super(energia);
        this.nome = cod;
    }

    /**
     * Retorna o nome do personagem.
     * 
     * @return Nome do personagem
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do personagem.
     * 
     * @param cod Novo nome do personagem
     */
    public void setNome(String cod) {
        this.nome = cod;
    }

    /**
     * Retorna o valor do dano recebido pelo personagem.
     * 
     * @return Valor do dano recebido
     */
    public float getDano_recebido() {
        return dano_recebido;
    }

    /**
     * Define o valor do dano recebido pelo personagem.
     * 
     * @param dano_recebido Novo valor do dano recebido
     */
    public void setDano_recebido(float dano_recebido) {
        this.dano_recebido = dano_recebido;
    }
    
}
