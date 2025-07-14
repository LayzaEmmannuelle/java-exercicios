/**
 * Classe Obstáculos que herda da classe Personagens.
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
     * Construtor da classe Obstáculos.
     * @param nome O nome do obstáculo.
     * @param energia A energia do obstáculo.
     * @param material O material do obstáculo.
     */
    public Obstáculos(String nome, float energia, String material) {
        super(energia);
        this.nome = nome;
        this.material = material;
    }
    
    /**
     * Método para retornar o material do obstáculo.
     * @return O material do obstáculo.
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Método para definir o material do obstáculo.
     * @param material O material do obstáculo.
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * Método para retornar o nome do obstáculo.
     * @return O nome do obstáculo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome do obstáculo.
     * @param nome O nome do obstáculo.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    
}
