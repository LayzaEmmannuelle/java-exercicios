/**
 * Classe Barco que estende a classe Veiculo.
 */
public class Barco extends Veiculo{

    private String reg_embarcação;


    /**
     * Construtor da classe Barco.
     * @param reg_embarcação Registro da embarcação.
     */
    public Barco(String reg_embarcação) {
        this.reg_embarcação = reg_embarcação;
    }


    /**
     * Método que implementa a função de ligar o barco.
     */
    public void ligar(){
        System.out.println("O barco ligou!");
    }

    /**
     * Método que implementa a função de desligar o barco.
     */
    public void desligar(){
        System.out.println("O barco desligou!");
    }

    /**
     * Método que implementa a função de acelerar o barco.
     */
    public void frente(){
        System.out.println("O barco se moveu para frente!");
    }

    /**
     * Método que implementa a função de dar ré no barco.
     */
    public void re(){
        System.out.println("O barco deu ré!");
    }

    /**
     * Método que implementa a função de parar o barco.
     */
    public void parar(){
        System.out.println("O barco parou!");
    }


    /**
     * Método para obter o registro da embarcação.
     * @return Registro da embarcação.
     */
    public String getReg_embarcação() {
        return reg_embarcação;
    }

    /**
     * Método para definir o registro da embarcação.
     * @param reg_embarcação Registro da embarcação.
     */
    public void setReg_embarcação(String reg_embarcação) {
        this.reg_embarcação = reg_embarcação;
    }


    
}
