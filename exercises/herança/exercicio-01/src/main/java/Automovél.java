/**
 * Classe que representa um automóvel, herda da classe Veículo.
 * Possui renavam, placa e controle de marcha.
 * 
 */
public class Automovél extends Veículo{
    
    private String renavam;
    private String placa;
    private boolean marcha;
    private int cont = 0;
    
    /**
     * Construtor padrão da classe Automovél.
     */
    public Automovél() {
    }

    /**
     * Construtor da classe Automóvel com renavan e placa.
     * 
     * @param renavam Número do renavam do automóvel
     * @param placa Placa do automóvel
     */
    public Automovél(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }

    /**
     * Método para passar a marcha do veículo, se já passou o limite de marchas, não faz nada.
     * Se o veículo estiver desligado, não é possível passar marcha.
     * Se o veículo estiver parado, não é possível passar marcha. 
     */
    public void passar_marcha(){

        if ((isOn() == true) && ((isFrente() == true) || (isRe() == true))){
            if (marcha == false){
                cont++;
                System.out.println("\nO veículo passou a " + cont + " marcha!");
                marcha = true;
            }
            else if (cont >= 5){
                System.out.println("\nNúmero de marchas excedido!");
            }
            else {
                cont++;
                System.out.println("\nO veículo passou a " + cont + " marcha!");
            }
        }
        else if (isOn() == false){
            System.out.println("\nO veículo está desligado, nao é possível passar marcha!");
        }
        else { 
            System.out.println("\nO veículo está parado, nao é possível passar marcha!"); 
        }
    }

    /**
     * Método para frear o veículo, se estiver em ponto morto, não faz nada.
     * Se o veículo estiver ligado e indo para frente ou de ré, reduz uma marcha.
     * Se a marcha já estiver na primeira, não faz nada.
     * Se o veículo estiver desligado, não é possível frear.
     */
    public void frear(){

        if (isOn() == true) {
            if ((marcha == true) && (isFrente() == true) || (isRe() == true)){
                System.out.println("\nO veículo freiou! reduzindo uma marcha! ");
                cont--;
                if (cont == 0) {
                    marcha = false;
                }
            }
            else {
                System.out.println("\nO veículo está em ponto morto!");
            }
        }
        else { 
            System.out.println("\nO veículo está desligado, nao é possível freiar!");
        }
    }

    /**
     * Retorna o número do renavam do automóvel.
     * 
     * @return Número do renavam do automóvel
     */
    public String getRenavam() {
        return renavam;
    }

    /**
     * Define o número do renavam do automóvel.
     * 
     * @param renavam Novo número do renavam do veículo
     */
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    /**
     * Retorna a placa do automóvel.
     * 
     * @return Placa do automóvel
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Define a placa do automóvel.
     * 
     * @param placa Nova placa do automóvel
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    

}
