package pets;

/**
 * Classe Tutor representa um tutor de pets, que é uma extensão da classe Pessoa.
 * Ela possui uma lista de pets adotados, métodos para adotar e obter informações sobre a pessoa e os pets.
 * 
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.List;

public class Tutor extends Pessoa {

    private List<Pet> pets;

    /**
     * Construtor da classe Tutor.
     * Cria uma nova instância de Tutor com o nome e apelido fornecidos.
     * Inicializa a lista de pets como uma nova ArrayList vazia.
     * 
     * @param nome
     * @param apelido
     */
    public Tutor(String nome, String apelido) {
        super(nome, apelido);
        this.pets = new ArrayList<>();
    }

    /**
     * Método para adotar um pet.
     * Adiciona o pet à lista de pets do tutor.
     * 
     * @param pet o pet a ser adotado pelo tutor.
     */
    public void adotar(Pet pet) {
        pets.add(pet);
    }

    /**
     * Método para obter a lista de pets adotados pelo tutor.
     * 
     * @return a lista de pets adotados.
     */
    public List<Pet> getPets() {
        return pets;
    }

    /**
     * Método para criar uma String com as informações do tutor e seus pets.
     * Sobrescreve o método getInfo da classe Pessoa para incluir informações sobre
     * os pets adotados.
     * 
     * @return uma String contendo o nome, apelido e informações dos pets adotados
     *         pelo tutor.
     */
    @Override
    public String getInfo() {
        String info = super.getInfo() + "\nPets: ";

        for (Pet pet : pets) {
            info += pet.getInfo() + "; ";
        }
        return info;
    }

}