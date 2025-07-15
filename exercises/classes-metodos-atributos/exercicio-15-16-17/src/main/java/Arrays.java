import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe que representa um array.
 * 
 */
public class Arrays {

    /**
     * Construtor padrão da classe Arrays
     */
    public Arrays() {
    }

    /**
     * Método que ordena e exibe uma lista em ordem crescente com lista de números
     * 
     * @param num Lista de números
     */
    public static void crescente(ArrayList<Float> num){
        System.out.println("\nORDEM CRESCENTE: ");
        Collections.sort(num);
        for (Float n : num) {
            System.out.println(n);
        }
    }

    /**
     * Método que ordena e exibe uma lista em ordem decrescente com lista de números
     * 
     * @param num Lista de números
     */
    public static void decrescente(ArrayList<Float> num) {
        System.out.println("\nORDEM DECRESCENTE: ");
        Collections.sort(num, Collections.reverseOrder());
        for (Float n : num) {
            System.out.println(n);
        }
    }

    /**
     * Método que analisa e exibe o maior numero de uma lista de números com lista de números
     * 
     * @param num Lista de números
     */
    public static void maiornum(ArrayList<Float> num){
        
        float maior = num.get(0), numatual;

        for (int i = 1; i < num.size(); i++) {
            numatual = num.get(i);
            if (numatual > maior) {
                maior = numatual;
            }
        }

        System.out.println("\nMaior número: " + maior);

    }

    /**
     * Método que analisa e exibe o menor numero de uma lista de números com lista de números
     * 
     * @param num Lista de números
     */
    public static void menornum(ArrayList<Float> num){
        
        float menor = num.get(0), numatual;

        for (int i = 1; i < num.size(); i++) {
            numatual = num.get(i);
            if (numatual < menor) {
                menor = numatual;
            }
        }

        System.out.println("\nMenor número: " + menor);
    }

    /**
     * Método que analisa e exibe a media entre os numeros com lista de números
     * 
     * @param num Lista de números
     */
    public static void media(ArrayList<Float> num){
        
        float media = 0;

        for (int i = 0; i < num.size(); i++) {
            media = media + num.get(i);
        }

        media = media/num.size();

        System.out.println("\nMédia: " + media);

    }

    /**
     * Método que analisa e exibe o desvio padrão entre os numeros com lista de números
     * 
     * @param num Lista de números
     */
    public static void desviopadrão(ArrayList<Float> num){

        float media = 0, soma = 0, dp; 

        for (int i = 0; i < num.size(); i++) {
            media = media + num.get(i);
        }

        media = media/num.size();

        for (int i = 0; i < num.size(); i++) {
            soma = (float) (soma + (Math.pow(num.get(i)-media, 2)));
        }

        dp = soma/num.size();
        
        dp = (float) Math.sqrt(dp);

        System.out.println("\nDesvio padrao: " + dp + "\n");

    }

    /**
     * Método que analisa e exibe um texto invertido com lista do tipo String
     * 
     * @param num Lista de strings
     */
    public static void inverter(ArrayList<String> texto){
        System.out.println("\nOrdem invertida Array: ");
        Collections.reverse(texto);
        for (String t : texto) {
            System.out.println(t);
        }
    }
    
    
}





    