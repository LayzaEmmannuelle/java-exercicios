/**
 * Classe que representa o poder do personagem.
 * Possui nome e valor do dano.
 * 
 */
public class Poder {

    private String poder;
    private float dano;
    public static int qtd_instancia = 0;

    /**
     * Construtor padrão da classe Poder.
     */
    public Poder() {
        qtd_instancia++;
    }

    /**
     * Construtor da classe Poder com nome e dano.
     * 
     * @param poder Nome do poder
     * @param dano Valor do dano
     */
    public Poder(String poder, float dano) {
        if (qtd_instancia >= 4) {
            System.out.println("Erro de instância, a Kate só pode ter até 4 poderes! apartir do 4 poder, ele nao será instanciado! por favor remova");
        }
        else {
            this.poder = poder;
            this.dano = dano;
            qtd_instancia++;
        }
    }

    /**
     * Retorna o nome do poder.
     * 
     * @return Nome do poder
     */
    public String getPoder() {
        return poder;
    }

    /**
     * Define o nome do poder.
     * 
     * @param poder Novo nome do poder
     */
    public void setPoder(String poder) {
        this.poder = poder;
    }

    /**
     * Retorna o valor do dano do poder.
     * 
     * @return Valor do dano do poder
     */
    public float getDano() {
        return dano;
    }

    /**
     * Define o valor do dano do poder.
     * 
     * @param dano Novo valor do dano do poder
     */
    public void setDano(float dano) {
        this.dano = dano;
    }
 
}
