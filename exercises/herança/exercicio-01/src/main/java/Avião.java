/**
 * Classe que representa um avião, herda da classe Veículo.
 * Possui registro aeronáutico e controle de decolagem.
 * 
 */
public class Avião extends Veículo{

    private String registro_aeronaútico;
    private boolean decolar;
    
    /**
     * Construtor padrão da classe Avião.
     */
    public Avião() {
    }

    /**
     * Construtor da classe Avião com registro aeronáutico.
     * 
     * @param registro_aeronaútico Número do registro aeronáutico
     */
    public Avião(String registro_aeronaútico) {
        this.registro_aeronaútico = registro_aeronaútico;
    }


    /**
     * Método para decolar o veículo, se já tiver decolado, não faz nada.
     * Se o veículo estiver desligado, não é possível decolar.
     */
    public void decolar(){

        if (isOn() == true) {
            if (decolar == false){
                System.out.println("\nO aviao decolou!!");
                decolar = true;
            }
            else {
                System.out.println("\nNao é possivel decolar pois o aviao já decolou!");
            }
        }

        else {
            System.out.println("\nO veículo está desligado, nao é possível decolar!");
        }
        
    }

    /**
     * Método que representa a aterrissagem do avião.
     * Leva em consideração se ele está ligado.
     */
    public void pousar(){

        if (isOn() == true) {
            if (decolar == true){
                System.out.println("\nO aviao pousou!");
                decolar = false;
            }
            else {
                System.out.println("\nNao é possivel pousar pois o aviao já está em pouso!");
            }
        }
        else {
            System.out.println("\nO veículo está desligado, nao é possível pousar!");
        }
        
    }

    /**
     * Retorna o número do registro aeronáutico do avião.
     * 
     * @return Número do registro aeronáutico do avião
     */
    public String getRegistro_aeronaútico() {
        return registro_aeronaútico;
    }

    /**
     * Define o número do registro aeronáutico do avião.
     * 
     * @param registro_aeronaútico Novo número do registro aeronáutico do avião
     */
    public void setRegistro_aeronaútico(String registro_aeronaútico) {
        this.registro_aeronaútico = registro_aeronaútico;
    }    
    
}
