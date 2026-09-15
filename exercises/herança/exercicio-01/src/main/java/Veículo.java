/**
 * Classe que representa um veículo.
 * Possui controle de partida, controle de aceleração e controle de ré.
 *  
 */
public class Veículo {

    private boolean on;
    private boolean frente;
    private boolean re;

    /**
     * Método que representa a partida de um veículo.
     * Leva em consideração se ele está desligado.
     */
    public void ligar(){

        if (on == false){
            System.out.println("\nVeículo ligado!");
            on = true;
        }
        else {
            System.out.println("\nO veículo já está ligado!");
        }
    }

    /**
     * Método que representa o desligamento de um veículo.
     * Leva em consideração se ele está ligado.
     */
    public void desligar(){

        if (on == true){
            System.out.println("\nVeículo desligado!");
            on = false;
        }
        else {
            System.out.println("\nO veículo já está desligado!");
        }
    }

    /**
     * Método que representa a aceleração de um veículo.
     * Leva em consideração se ele está ligado.
     */
    public void mover_frente(){

        if (on == true) {
            if (frente == false){
                System.out.println("\nVeículo em movimento para frente!");
                frente = true;
                re = false;
            }
            else {
                System.out.println("\nO veículo já está se movendo para frente!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível se locomover para frente!");
        }
        
    }

    /**
     * Método que representa a ré de um veículo.
     * Leva em consideração se ele está ligado.
     */
    public void mover_re(){

        if (on == true) {
            if (re == false){
                System.out.println("\nVeículo em movimento de ré!");
                re = true;
                frente = false;
            }
            else {
                System.out.println("\nO veículo já está se movendo de ré!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível se locomover de ré!");
        }

        
    }

    /**
     * Método que representa a paragem de um veículo.
     * Leva em consideração se ele está ligado.
     */
    public void parar(){

        if (on == true) {
            if ((re == false) && (frente == false)) {
                System.out.println("\nO veículo já está parado!");
            }
            else {
                System.out.println("\nO veículo parou!");
                re = false;
                frente = false;
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível parar!");
        }
    }

    /**
     * Retorna o estado do veículo: Ligado ou Desligado.
     * 
     * @return Estado do veículo: Ligado(true) ou Desligado(false)
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Define o estado do veículo: Ligado ou desligado.
     * 
     * @param on Novo estado do veículo: Ligado(true) ou Desligado(false)
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Retorna o estado de movimento do veículo: Indo para frente ou Não.
     * 
     * @return Estado de movimento do veículo: Indo para frente(true) ou Não(false)
     */
    public boolean isFrente() {
        return frente;
    }

    /**
     * Define o estado de movimento do veículo: Indo para frente ou Não.
     * 
     * @param frente Novo estado de movimento do veículo: Indo para frente(true) ou Não(false)
     */
    public void setFrente(boolean frente) {
        this.frente = frente;
    }

    /**
     * Retorna o estado de movimento do veículo: Dando ré ou Não.
     * 
     * @return Estado de movimento do veículo: Dando ré(true) ou Não(false)
     */
    public boolean isRe() {
        return re;
    }

    /**
     * Define o estado de movimento do veículo: Dando ré ou Não.
     * 
     * @param re Novo estado de movimento do veículo: Dando ré(true) ou Não(false)
     */
    public void setRe(boolean re) {
        this.re = re;
    }

    
    
    
}
