import java.time.LocalDate;

/**
 * Classe Teses que estende a classe Publicações e implementa os métodos abstratos.
 */
public class Teses extends Publicações{

    private String grau;
    private String instituição_defendimento;
    private Coordenador coordenador;


    /**
     * Construtor padrão da classe Teses.
     */
    public Teses(){
    }

    /**
     * Construtor da classe Teses.
     * @param nome Nome da tese.
     * @param descrição Descrição da tese.
     * @param data_inicio Data de início da tese.
     * @param tipo_data_termino Tipo de data de término da tese.
     * @param data_termino Data de término da tese.
     * @param area_pesquisa Área de pesquisa da tese.
     * @param titulo Título da tese.
     * @param ano Ano da tese.
     * @param autores Autores da tese.
     * @param coordenador Coordenador responsável pela tese.
     * @param grau Grau acadêmico da tese.
     * @param instituição_defendimento Instituição onde a tese foi defendida.
     */
    public Teses(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, String titulo, String ano, String autores, Coordenador coordenador, String grau, String instituição_defendimento) {

        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.coordenador = coordenador;
        this.grau = grau;
        this.instituição_defendimento = instituição_defendimento;

    }

    


    /**
     * Método que implementa a função de imprimir as informações da tese.
     */
    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nGrau: " + getGrau() + "\nInstituiçao de defendimento: " + getInstituição_defendimento() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+");
    }



    /**
     * Método para obter o grau acadêmico da tese.
     * @return Grau acadêmico da tese.
     */
    public String getGrau() {
        return grau;
    }

    /**
     * Método para definir o grau acadêmico da tese.
     * @param grau Grau acadêmico da tese.
     */
    public void setGrau(String grau) {
        this.grau = grau;
    }

    /**
     * Método para obter a instituição onde a tese foi defendida.
     * @return Instituição onde a tese foi defendida.
     */
    public String getInstituição_defendimento() {
        return instituição_defendimento;
    }

    /**
     * Método para definir a instituição onde a tese foi defendida.
     * @param instituição_defendimento Instituição onde a tese foi defendida.
     */
    public void setInstituição_defendimento(String instituição_defendimento) {
        this.instituição_defendimento = instituição_defendimento;
    }

    /**
     * Método para obter o coordenador responsável pela tese.
     * @return Coordenador responsável pela tese.
     */
    public Coordenador getCoordenador() {
        return coordenador;
    }

    /**
     * Método para definir o coordenador responsável pela tese.
     * @param coordenador Coordenador responsável pela tese.
     */
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    
}
