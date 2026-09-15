import java.time.LocalDate;
import java.time.Period;

/**
 * Classe que representa uma pessoa.
 * 
 */
public class Pessoa {

    private String nome, apelido;
    private LocalDate datanascimento;

    /**
     * Construtor padrão da classe Pessoa com data de nascimento.
     * 
     * @param datanascimento Data de nascimento
     */
    public Pessoa(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    /**
     * Construtor padrão da classe Pessoa com nome, apelido e data de nascimento.
     * @param nome Nome
     * @param apelido Apelido
     * @param datanascimento Data de nascimento
     */
    public Pessoa (String nome, String apelido, LocalDate datanascimento){
        this.nome = nome;
        this.apelido = apelido;
        this.datanascimento = datanascimento;
    }

    /**
     * Retorna a idade da pessoa com base na data atual.
     * 
     * @return Idade da pessoa
     */
    public int getIdade(){
        LocalDate dataAtual = LocalDate.now();
        Period periodo = Period.between(datanascimento, dataAtual);

        return periodo.getYears();
    }

    /**
     * Define o nome da pessoa.
     * 
     * @param nome Nome da pessoa
     */
    public void setNome(String nome){
        this.nome = nome;
    }

    /**
     * Retorna o nome da pessoa.
     * 
     * @return Nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o apelido da pessoa.
     * 
     * @param apelido Apelido da pessoa
     */
    public void setApelido(String apelido){
        this.apelido = apelido;
    }

    /**
     * Retorna o apelido da pessoa.
     * 
     * @return Apelido da pessoa
     */
    public String getApelido() {
        return apelido;
    }

    /**
     * Retorna a data de nascimento da pessoa.
     * 
     * @return Data de nascimento da pessoa
     */
    public LocalDate getDatanascimento() {
        return datanascimento;
    }

    /**
     * Define a data de nascimento da pessoa.
     * 
     * @param datanascimento Data de nascimento da pessoa
     */
    public void setDatanascimento(LocalDate datanascimento) {
        this.datanascimento = datanascimento;
    }

    
    
}
