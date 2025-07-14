import java.util.ArrayList;

/**
 * Classe que representa a personagem Kate, herda da classe Personagens.
 * Possui valor que representa a quantidade de vida e uma lista de poderes.
 * 
 */
public class Kate extends Personagens{

    private int qtd_vida;
    private ArrayList<Poder> poder;
    private int poder_atual = 0;

    /**
     * Construtor padrão da classe Kate.
     */
    public Kate() {
        this.poder = new ArrayList<Poder>();
    }

    /**
     * Construtor da classe Kate com energia e quantidade de vida.
     * 
     * @param energia Valor que representa a energia da personagem
     * @param qtd_vida Valor que representa a quantidade de vida da personagem
     */
    public Kate(float energia, int qtd_vida) {
        super(energia);
        this.qtd_vida = qtd_vida;
    }

    /**
     * Método que representa a ação de pular da personagem.
     */
    public void pular() {
        System.out.println("\nA kate pulou!");
    }

    /**
     * Método que representa a ação de pular da personagem.
     */
    public void andar() {
        System.out.println("\nA kate andou!");
    }

    /**
     * Método que representa a arternagem entre os poderes da personagem.
     * 
     * @param poder_atual Poder a ser alterado
     */
    public void alterarpoder(int poder_atual) {
        this.poder_atual = poder_atual;
    }

    /**
     * Retorna o valor do dano causado por um poder da personagem.
     * 
     * @param poder Habilidade especial usado pela personagem
     * @return Valor do dano causado pelo poder da personagem
     */
    public float poder(ArrayList<Poder> poder) {
        float dano = poder.get(poder_atual).getDano();;
        return dano;
    }

    /**
     * Retorna o valor da quantidade de vida da personagem.
     * 
     * @return Valor da quantidade de vida da personagem
     */
    public int getQtd_vida() {
        return qtd_vida;
    }

    /**
     * Define a valor da quantidade de vida da personagem.
     * 
     * @param qtd_vida Novo valor da quantidade de vida da personagem
     */
    public void setQtd_vida(int qtd_vida) {
        this.qtd_vida = qtd_vida;
    }

    /**
     * Retorna a lista de poderes da personagem.
     * 
     * @return Lista de poderes da personagem
     */
    public ArrayList<Poder> getPoder() {
        return poder;
    }

    /**
     * Define um novo poder para a lista de poderes da personagem.
     * 
     * @param poder Novo poder para a lista de poderes da personagem
     */
    public void setPoder(ArrayList<Poder> poder) {
        this.poder = poder;
    }  

}
