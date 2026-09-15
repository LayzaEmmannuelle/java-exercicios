/**
 * Classe que representa uma célula.
 * 
 */
public class Celula {
    
    private static int num_instancias = 0;

    /**
     * Construtor padrão da classe Celula.
     */
    public Celula(){
        num_instancias++;
    }

    /**
     * Método que imprime o número de instâncias de células.
     */
    public static void getNumInstancias() {
        System.out.println("Número de instâncias de células: " + num_instancias);
    }


}
