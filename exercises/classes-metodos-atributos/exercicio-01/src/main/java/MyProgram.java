import java.util.Scanner;

/**
 * Classe MyProgram que define a aplicação para classes e métodos.
 * Lê duas notas do usuário, calcula a média e informa se o aluno foi aprovado ou reprovado.
 * 
 */
public class MyProgram {

    public static void main (String[] args) {

        @SuppressWarnings("resource")
        Scanner in = new Scanner (System.in);
        
        double n1, n2;

        System.out.println("Digite a primeira nota");
        n1 = in.nextDouble();

        System.out.println("Digite a segunda nota");           
        n2 = in.nextDouble();

        double media = (n1+n2)/2;

        if (media >= 7.0) {
                System.out.println("Aluno aprovado");
        }

        else {
            System.out.println("Aluno reprovado");    
        }
    }
}