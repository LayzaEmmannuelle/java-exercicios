package pets;

/**
 * A classe Pessoa representa uma pessoa com um nome e um apelido.
 * Ela possui métodos para acessar e modificar esses atributos, além de um
 * método
 * para obter informações formatadas sobre a pessoa.
 *
 * @author João Victor Tavares Fróes
 * @version 1.0
 */
public class Pessoa {

    private String nome;
    private String apelido;

    /**
     * Construtor da classe Pessoa.
     * Cria uma nova instância de Pessoa com o nome e apelido fornecidos.
     * 
     * @param nome    O nome da pessoa.
     * @param apelido o apelido da pessoa.
     */
    public Pessoa(String nome, String apelido) {
        this.nome = nome;
        this.apelido = apelido;
    }

    /**
     * Retorna o nome da pessoa.
     * 
     * @return O nome da pessoa.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome O novo nome da pessoa.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o apelido da pessoa.
     * 
     * @return O apelido da pessoa.
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Define o apelido da pessoa.
     * 
     * @param apelido O novo apelido da pessoa.
     */
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    /**
     * Retorna uma string formatada com os atributos da pessoa.
     * A informação inclui o nome e o apelido.
     * 
     * @return Uma string contendo nome e o apelido da pessoa.
     */
    public String getInfo() {
        return "Nome: " + nome + ", Apelido: " + apelido;
    }
}