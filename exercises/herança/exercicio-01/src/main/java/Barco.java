/**
 * Classe que representa um barco, herda da classe Veículo.
 * Possui registro da embarcação, controle de navegação e controle de ancoragem.
 * 
 */
public class Barco extends Veículo{

    private String registro_embarcação;
    private boolean navegar;
    private boolean ancorar = true;

    /**
     * Construtor padrão da classe Barco.
     */
    public Barco() {
    }

    /**
     * Construtor da classe Barco com número do registro da embarcação.
     * 
     * @param registro_embarcação Número do registro da embarcação
     */
    public Barco(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }

    /**
     * Método que representa a navegação do barco.
     * Leva em consideração se ele ligado.
     */
    public void navegar(){

        if (isOn() == true) {
            if ((navegar == false) && (ancorar == false)){
                System.out.println("\nO barco está em navegaçao!!");
                navegar = true;
            }
            else if (ancorar == true){
                System.out.println("\nO barco está ancorado, nao é possivel navegar! ");
            }
            else {
                System.out.println("\nO barco já está navegando!");
            }
        }

        else {
            System.out.println("\nO veículo está desligado, nao é possível navegar!");
        }
        
    }

    /**
     * Método que representa a ancoragem do barco.
     * Leva em consideração se ele está ligado.
     */
    public void ancorar(){

        if (isOn() == true) {
            if (ancorar == false){
                System.out.println("\nO barco ancorou!");
                ancorar = true;
                navegar = false;
            }
            else {
                System.out.println("\nO barco já está ancorado!");
            }
        }
        
        else {
            System.out.println("\nO veículo está desligado, nao é possível ancorar!");
        }
    }

    /**
     * Método que representa a desatracação do barco.
     * Leva em consideração se ele está ligado.
     */
    public void desancorar(){
        if (isOn() == true) {
            if (ancorar == true){
                System.out.println("\nO barco desancorou!");
                ancorar = false;
            }
            else {
                System.out.println("\nO barco já está desancorado!");
            }
        }
        
        else {
            System.out.println("\nO veículo está desligado, nao é possível passar desancorar!");
        }
    }

    /**
     * Retorna o número do registro da embarcação do barco.
     * 
     * @return Número do registro da embarcação do barco
     */
    public String getRegistro_embarcação() {
        return registro_embarcação;
    }

    /**
     * Define o número do registro da embarcação do barco.
     * 
     * @param registro_embarcação Novo número do registro da embarcação do barco
     */
    public void setRegistro_embarcação(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }
    
}
