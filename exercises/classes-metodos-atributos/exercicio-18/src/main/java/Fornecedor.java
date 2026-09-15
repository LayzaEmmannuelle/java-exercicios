/**
 * Classe que representa um fornecedor.
 * Possui nome, telefone, endereço e cnpj.
 * 
 */
public class Fornecedor {

    private String nome, telefone, endereço, cnpj;

    /**
     * Construtor padrão da classe Fornecedor.
     */
    public Fornecedor() {
    }

    /**
     * Construtor da classe Fornecedor com nome, telefone, endereço e cnpj.
     * 
     * @param nome Nome do fornecedor
     * @param telefone Telefone do fornecedor
     * @param endereço Enereço do fornecedor
     * @param cnpj Cnpj do fornecedor
     */
    public Fornecedor(String nome, String telefone, String endereço, String cnpj) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereço = endereço;
        this.cnpj = cnpj;
    }

    /**
     * Retorna o nome do fornecedor.
     * 
     * @return Nome do fornecedor
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do fornecedor.
     * 
     * @param nome Nome do fornecedor.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o número de telefone do fornecedor.
     * 
     * @return Número de telefone do fornecedor
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * Define o núemro de telefone do fornecedor.
     * 
     * @param telefone Número de telefone do fornecedor.
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Retorna o endereço do fornecedor.
     * 
     * @return Endereço do fornecedor
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * Define o endereço do fornecedor.
     * 
     * @param endereço Endereço do fornecedor.
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * Retorna o cnpj do fornecedor.
     * 
     * @return Cnpj do fornecedor
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Define o cnpj do fornecedor.
     * 
     * @param cnpj Cnpj do fornecedor.
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    
    
}
