/**
 * Classe Veículo que serve como base para outros tipos de veículos.
 */
public class Veículo {

    private boolean on;
    private boolean frente;
    private boolean re;

    /**
     * Método para ligar o veículo, se já estiver ligado, não faz nada.
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
     * Método para desligar o veículo, se já estiver desligado, não faz nada.
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
     * Método para movimentar o veículo para frente, se já estiver em movimento, não faz nada.
     * Se o veículo estiver desligado, não é possível se locomover.
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
     * Método para movimentar o veículo de ré, se já estiver em movimento de ré, não faz nada.
     * Se o veículo estiver desligado, não é possível se locomover de ré.
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
     * Método para parar o veículo, se já estiver parado, não faz nada.
     * Se o veículo estiver desligado, não é possível parar.
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
     * Método para dizer se o veículo está ligado ou não. 
     * @return true se o veículo estiver ligado, false caso contrário.
     */
    public boolean isOn() {
        return on;
    }

    /**
     * Método para definir se o veículo está ligado ou não.
     * @param on diz se o veículo está ligado ou não.
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     * Método para verificar se o veículo está em movimento para frente. 
     * @return true se o veículo estiver em movimento para frente, false caso contrário.
     */
    public boolean isFrente() {
        return frente;
    }

    /**
     * Método para definir se o veículo está em movimento para frente. 
     * @param frente diz se o veículo está em movimento para frente ou não.
     */
    public void setFrente(boolean frente) {
        this.frente = frente;
    }

    /**
     * Método para verificar se o veículo está em movimento de ré.
     * @return true se o veículo estiver em movimento de ré, false caso contrário.
     */
    public boolean isRe() {
        return re;
    }

    /**
     * Método para definir se o veículo está em movimento de ré.
     * @param re diz se o veículo está em movimento de ré ou não.
     */
    public void setRe(boolean re) {
        this.re = re;
    }

    
    
    
}
