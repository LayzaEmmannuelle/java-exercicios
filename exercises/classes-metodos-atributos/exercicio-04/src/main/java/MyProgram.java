/**
 * Classe MyProgram que define a aplicação para classes e métodos.
 * Imprime uma contagem crescente(1-10) e uma decrescente(10-1).
 * 
 */
public class MyProgram {

    public static void main(String[] args) {

        int cont = 0;

        for (cont = 0; cont <= 10; cont++) {
            System.out.println(cont);
        }

        for (cont = 10; cont > 0; cont--) {
            System.out.println(cont);
        }

    }
}