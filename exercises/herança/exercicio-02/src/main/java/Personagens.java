/**
 * Classe que representa os personagens.
 * Possui energia.
 * 
 */
import java.util.ArrayList;

/**
 * Classe Personagens que serve como base para outros personagens.
 */
public class Personagens {

    private float energia;

    /**
     * Construtor padrão da classe Personagens.
     */
    public Personagens() {
    }

    /**
     * Construtor da classe Personagens com energia.
     * 
     * @param energia Valor que representa a energia do personagem.
     */
    public Personagens(float energia) {
        this.energia = energia;
    }

    /**
     * Método que define o status de um personagem após um dano causado por algum poder.
     * Compara o dano recebido com os danos dos poderes e exibe qual deles causou aquele dano, se
     * algum for correspondente.
     * Subtrai o dano causado da energia do personagem e mostra se ele resistiu ou morreu.
     * 
     * @param poder Lista de poderes disponíveis.
     * @param nome Nome do personagem que está recebendo o dano.
     * @param dano_recebido Valor do dano que foi causado.
     * @param energiainimigo Energia atual do personagem antes de receber o dano.
     * @return Energia do personagem após receber o dano.
     */
    public float status(ArrayList<Poder> poder, String nome, float dano_recebido, float energiainimigo){

        if (dano_recebido != 0) {
            if (dano_recebido == poder.get(0).getDano()){
                System.out.println("\nO "+nome+" recebeu um dano do poder "+poder.get(0).getPoder());
            }
            else if (dano_recebido == poder.get(1).getDano()){
                System.out.println("\nO "+nome+" recebeu um dano do poder "+poder.get(1).getPoder());
            }
            if (dano_recebido == poder.get(2).getDano()){
                System.out.println("\nO "+nome+" recebeu um dano do poder "+poder.get(2).getPoder());
            }
    
            energiainimigo = energiainimigo - dano_recebido;
    
            if (energiainimigo <= 0){
                System.out.println("O "+nome+" morreu!");
                return energiainimigo;
            }
            else {
                System.out.println("O "+nome+" sobreviveu ao dano!");
                System.out.println("Quantidade de energia do "+nome+": " +energiainimigo);
                return energiainimigo;
            }
        }
        else {
            System.out.println("\nO "+nome+" nao recebeu dano!");
            return energiainimigo;
        }

        

    }

    /**
     * Retorna o valor que representa a energia do personagem.
     * 
     * @return Valor que representa a energia do personagem
     */
    public float getEnergia() {
        return energia;
    }

    /**
     * Define o valor que representa a energia do personagem.
     * 
     * @param energia Novo valor que representa a energia do personagem
     */
    public void setEnergia(float energia) {
        this.energia = energia;
    }

}
