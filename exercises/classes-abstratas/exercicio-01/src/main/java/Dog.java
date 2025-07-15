/**
 * Classe Dog que estende a classe Animal e implementa os métodos abstratos.
 */
public class Dog extends Animal{

    /**
     * Método que implementa a respiração do cachorro.
     */
    public void respirar(){
        System.out.println("O cachorro respirou!");
    }

    /**
     * Método que implementa a função de dormir do cachorro.
     */
    public void dormir(){
        System.out.println("O cachorro dormiu!");
    }

    /**
     * Método que implementa a função de comer do cachorro.
     */
    public void comer(){
        System.out.println("O cachorro comeu!");
    }

    /**
     * Método que implementa a função de andar do cachorro.
     */
    public void andar(){
        System.out.println("O cachorro andou!");
    }

    /**
     * Método específico do cachorro para latir.
     */
    public void latir(){
        System.out.println("O cachorro latiu!");
    }
    
    
}
