/**
 * Classe Eagle que estende a classe Animal e implementa os métodos abstratos.
 */
public class Eagle extends Animal{

    /**
     * Método que implementa a respiração da águia.
     */
    public void respirar(){
        System.out.println("O eagle respirou!");
    }

    /**
     * Método que implementa a função de dormir da águia.
     */
    public void dormir(){
        System.out.println("O eagle dormiu!");
    }

    /**
     * Método que implementa a função de comer da águia.
     */
    public void comer(){
        System.out.println("O eagle comeu!");
    }

    /**
     * Método que implementa a função de andar da águia.
     */
    public void andar(){
        System.out.println("O eagle andou!");
    }

    /**
     * Método específico da águia para voar.
     */
    public void voar(){
        System.out.println("O eagle vuou!");
    }
    
}
