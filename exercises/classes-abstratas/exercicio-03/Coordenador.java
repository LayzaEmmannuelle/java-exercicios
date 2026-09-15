/**
 * Classe Coordenador
 */
public class Coordenador {

    private String nome_cordenador;
    private String email;
    private String instituição_origem;
    private String endereço;
    private String função;


    /**
     * Construtor da classe Coordenador.
     * @param nome_cordenador Nome do coordenador.
     * @param email E-mail do coordenador.
     * @param instituição_origem Instituição de origem do coordenador.
     * @param endereço Endereço do coordenador.
     * @param função Função do coordenador.
     */
    public Coordenador(String nome_cordenador, String email, String instituição_origem, String endereço,
            String função) {
        this.nome_cordenador = nome_cordenador;
        this.email = email;
        this.instituição_origem = instituição_origem;
        this.endereço = endereço;
        this.função = função;
    }

    /**
     * Método para obter o nome do coordenador.
     * @return Nome do coordenador.
     */
    public String getNome_cordenador() {
        return nome_cordenador;
    }

    /**
     * Método para definir o nome do coordenador.
     * @param nome_cordenador Nome do coordenador.
     */
    public void setNome_cordenador(String nome_cordenador) {
        this.nome_cordenador = nome_cordenador;
    }

    /**
     * Método para exibir o Email do coordenador.
     * @return Email do coordenador.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Método para definir o Email do coordenador.
     * @param email Email do coordenador.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Método para obter a instituição de origem do coordenador.
     * @return Instituição de origem do coordenador.
     */
    public String getInstituição_origem() {
        return instituição_origem;
    }

    /**
     * Método para definir a instituição de origem do coordenador.
     * @param instituição_origem Instituição de origem do coordenador.
     */
    public void setInstituição_origem(String instituição_origem) {
        this.instituição_origem = instituição_origem;
    }

    /**
     * Método para obter o endereço do coordenador.
     * @return Endereço do coordenador.
     */
    public String getEndereço() {
        return endereço;
    }

    /**
     * Método para definir o endereço do coordenador.
     * @param endereço Endereço do coordenador.
     */
    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    /**
     * Método para exibir a função do coordenador.
     * @return Função do coordenador.
     */
    public String getFunção() {
        return função;
    }

    /**
     * Método para definir a função do coordenador.
     * @param função Função do coordenador.
     */
    public void setFunção(String função) {
        this.função = função;
    }


    
    
}
