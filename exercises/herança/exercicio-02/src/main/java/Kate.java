import java.util.ArrayList;

/**
 * Classe Kate que herda da classe Personagens.
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
     * Construtor da classe Kate.
     * @param energia A energia da Kate.
     * @param qtd_vida A quantidade de vida da Kate.
     */
    public Kate(float energia, int qtd_vida) {
        super(energia);
        this.qtd_vida = qtd_vida;
    }

    /**
     * Método para pular, imprime uma mensagem indicando que a Kate pulou.
     */
    public void pular() {
        System.out.println("\nA kate pulou!");
    }

    /**
     * Método para andar, imprime uma mensagem indicando que a Kate andou.
     */
    public void andar() {
        System.out.println("\nA kate andou!");
    }


    /**
     * Método para alterar o poder atual da Kate.
     * @param poder_atual O poder atual da Kate.
     */
    public void alterarpoder(int poder_atual) {
        this.poder_atual = poder_atual;
    }

    /**
     * Método para retornar o dano causado pelo poder atual da Kate. 
     * @param poder A lista de poderes da Kate.
     * @return O dano causado pelo poder atual da Kate.
     */
    public float poder(ArrayList<Poder> poder) {
        float dano = poder.get(poder_atual).getDano();;
        return dano;
    }

    /**
     * Método para retornar a quantidade de vida da Kate.
     * @return A quantidade de vida da Kate.
     */
    public int getQtd_vida() {
        return qtd_vida;
    }

    /**
     * Método para definir a quantidade de vida da Kate.
     * @param qtd_vida A quantidade de vida da Kate.
     */
    public void setQtd_vida(int qtd_vida) {
        this.qtd_vida = qtd_vida;
    }

    /**
     * Método para retornar a lista de poderes da Kate.
     * @return A lista de poderes da Kate.
     */
    public ArrayList<Poder> getPoder() {
        return poder;
    }

    /**
     * Método para definir a lista de poderes da Kate.
     * @param poder A lista de poderes da Kate.
     */
    public void setPoder(ArrayList<Poder> poder) {
        this.poder = poder;
    }  

}
