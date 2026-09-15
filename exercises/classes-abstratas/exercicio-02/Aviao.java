/**
 * Classe Aviao que estende a classe Veiculo e implementa os métodos abstratos.
 */
public class Aviao extends Veiculo{

    private String reg_aeronautico;
    

    /**
     * Construtor da classe Aviao.
     * @param reg_aeronautico Registro aeronautico do avião.
     */
    public Aviao(String reg_aeronautico) {
        this.reg_aeronautico = reg_aeronautico;
    }


    /**
     * Método que implementa a função de ligar o avião.
     */
    public void ligar(){
        System.out.println("O aviao ligou!");
    }

    /**
     * Método que implementa a função de desligar o avião.
     */
    public void desligar(){
        System.out.println("O aviao desligou!");
    }

    /**
     * Método que implementa a função de acelerar o avião.
     */
    public void frente(){
        System.out.println("O aviao se moveu para frente!");
    }

    /**
     * Método que implementa a função de dar ré no avião.
     */
    public void re(){
        System.out.println("O aviao deu ré!");
    }

    /**
     * Método que implementa a função de parar o avião.
     */
    public void parar(){
        System.out.println("O aviao parou!");
    }


    /**
     * Método para obter o registro aeronautico do avião.
     * @return Registro aeronautico do avião.
     */
    public String getReg_aeronautico() {
        return reg_aeronautico;
    }

    /**
     * Método para definir o registro aeronautico do avião.
     * @param reg_aeronautico Registro aeronautico do avião.
     */
    public void setReg_aeronautico(String reg_aeronautico) {
        this.reg_aeronautico = reg_aeronautico;
    }

    
    
}
