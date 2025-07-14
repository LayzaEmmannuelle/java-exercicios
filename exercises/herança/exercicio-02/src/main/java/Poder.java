/**
 * Classe Poder que representa os poderes de um personagem.
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
     * Construtor da classe Poder.
     * @param poder O nome do poder.
     * @param dano O dano causado pelo poder.
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
     * Método para retornar o nome do poder.
     * @return O nome do poder.
     */
    public String getPoder() {
        return poder;
    }

    /**
     * Método para definir o nome do poder.
     * @param poder O nome do poder.
     */
    public void setPoder(String poder) {
        this.poder = poder;
    }

    /**
     * Método para retornar o dano causado pelo poder.
     * @return O dano causado pelo poder.
     */
    public float getDano() {
        return dano;
    }

    /**
     * Método para definir o dano causado pelo poder.
     * @param dano O dano causado pelo poder.
     */
    public void setDano(float dano) {
        this.dano = dano;
    }
 
}
