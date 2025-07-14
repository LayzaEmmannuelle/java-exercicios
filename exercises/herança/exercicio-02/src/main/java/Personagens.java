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
     * Construtor da classe Personagens.
     * @param energia A energia do personagem.
     */
    public Personagens(float energia) {
        this.energia = energia;
    }

    /**
     * Método para verificar o status do personagem.
     * @param poder Lista de poderes disponíveis.
     * @param nome Nome do personagem.
     * @param dano_recebido Dano recebido pelo personagem.
     * @param energiainimigo Energia do inimigo.
     * @return A energia restante do inimigo após o dano recebido.
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
     * Método para retornar a energia do personagem.
     * @return A energia do personagem.
     */
    public float getEnergia() {
        return energia;
    }

    /**
     * Método para definir a energia do personagem.
     * @param energia A energia do personagem.
     */
    public void setEnergia(float energia) {
        this.energia = energia;
    }

}
