/**
 * Classe Barco que herda da classe Veículo.
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
     * Construtor da classe Barco.
     * @param registro_embarcação O registro da embarcação.
     */
    public Barco(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }

    /**
     * Método para navegar com o veículo, se estiver ancorado, não faz nada.
     * Se já estiver navegando, não faz nada.
     * Se o veículo estiver desligado, não é possível navegar.
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
     * Método para ancorar o veículo, se já estiver ancorado, não faz nada.
     * Se o veículo estiver desligado, não é possível ancorar.
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
     * Método para desancorar o veículo, se já estiver desancorado, não faz nada.
     * Se o veículo estiver desligado, não é possível desancorar.
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
     * Método para pegar registro da embarcação.
     * @return o registro da embarcação.
     */
    public String getRegistro_embarcação() {
        return registro_embarcação;
    }

    /**
     * Método para definir o registro da embarcação.
     * @param registro_embarcação o registro da embarcação.
     */
    public void setRegistro_embarcação(String registro_embarcação) {
        this.registro_embarcação = registro_embarcação;
    }
    
}
