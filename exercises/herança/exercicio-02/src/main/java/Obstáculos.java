/**
 * Classe que representa os obstáculos, herda de Personagens.
 * Possui nome e material.
 * 
 */
public class Obstáculos extends Personagens{

    private String nome;
    private String material;

    /**
     * Construtor padrão da classe Obstáculos.
     */
    public Obstáculos() {
    }

    /**
     * Construtor da classe Obstáculos com nome, energia e material.
     * 
     * @param nome Nome do obstáculo
     * @param energia Valor que representa a energia do obstáculos
     * @param material Material que compõe o obstáculo
     */
    public Obstáculos(String nome, float energia, String material) {
        super(energia);
        this.nome = nome;
        this.material = material;
    }
   
    /**
     * Retorna o material que compõe o obstáculo.
     * 
     * @return Material que compõe o obstáculo
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Define o material que compõe o obstáculo.
     * 
     * @param material Novo material que compõe o obstáculo
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Retorna o nome do obstáculo.
     * 
     * @return Nome do obstáculo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do obstáculo.
     * 
     * @param nome Novo nome do obstáculo.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
