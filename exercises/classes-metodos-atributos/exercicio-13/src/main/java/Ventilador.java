/**
 * Classe que representa um ventilador.
 * Possui velocidade e controle de status.
 * 
 */
public class Ventilador {

    private int velocidade;
    private boolean status;

    /**
     * Construtor padrão da classe Ventilador.
     */
    public Ventilador() {
    }
    
    /**
     * Construtor da classe Ventilador com velocidade.
     * 
     * @param velocidade Nível de velocidade do ventilador
     */
    public Ventilador(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * Retorna o nível de velocidade do ventilador. 
     * 
     * @return Nível de velocidade do ventilador. 
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Define o nível de velocidade do ventilador. 
     * 
     * @param velocidade Nível de velocidade do ventilador. 
     */
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    /**
     * Retorna o status do ventilador. 
     * 
     * @return Status do ventilador. 
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Define o status do ventilador. 
     * 
     * @param status Status do ventilador. 
     */
    public void setStatus(boolean status) {
        this.status = status;
    }


}
