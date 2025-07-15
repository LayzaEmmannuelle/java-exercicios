/**
 * Classe Automovel que estende a classe Veiculo e implementa os métodos abstratos.
 */
public class Automovel extends Veiculo{

    private String renavam;
    private String placa;
    

    /**
     * Construtor da classe Automovel.
     * @param renavam Número de identificação do veículo.
     * @param placa Placa do veículo.
     */
    public Automovel(String renavam, String placa) {
        this.renavam = renavam;
        this.placa = placa;
    }


    /**
     * Método que implementa a função de ligar o carro.
     */
    public void ligar(){
        System.out.println("O carro ligou!");
    }

    /**
     * Método que implementa a função de desligar o carro.
     */
    public void desligar(){
        System.out.println("O carro desligou!");
    }

    /**
     * Método que implementa a função de acelerar o carro.
     */
    public void frente(){
        System.out.println("O carro se moveu para frente!");
    }

    /**
     * Método que implementa a função de dar ré no carro.
     */
    public void re(){
        System.out.println("O carro deu ré!");
    }

    /**
     * Método que implementa a função de parar o carro.
     */
    public void parar(){
        System.out.println("O carro parou!");
    }


    /**
     * Método para obter o renavam do automóvel.
     * @return Número do renavam do veículo.
     */
    public String getRenavam() {
        return renavam;
    }

    /**
     * Método para definir o renavam do automóvel.
     * @param renavam Número do renavam do veículo.
     */
    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    /**
     * Método para obter a placa do automóvel.
     * @return Placa do veículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Método para definir a placa do automóvel.
     * @param placa Placa do veículo.
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    
}
