import java.time.LocalDate;

/**
 * Classe ArtigosRevista_Conferencias que estende a classe Publicações e implementa os métodos abstratos.
 */
public class ArtigosRevista_Conferencias extends Publicações{

    private String periódico;
    private String volume;
    private String numero;
    private Coordenador coordenador;


    /**
     * Construtor padrão da classe ArtigosRevista_Conferencias.
     */
    public ArtigosRevista_Conferencias(){
    }


    /**
     * Construtor da classe ArtigosRevista_Conferencias.
     * @param nome Nome do artigo.
     * @param descrição Descrição do artigo.
     * @param data_inicio Data de início do artigo.
     * @param tipo_data_termino Tipo de data de término do artigo.
     * @param data_termino Data de término do artigo.
     * @param area_pesquisa Área de pesquisa do artigo.
     * @param titulo Título do artigo.
     * @param ano Ano de publicação do artigo.
     * @param autores Autores do artigo.
     * @param coordenador Coordenador responsável pelo artigo.
     * @param periódico Periódico onde o artigo foi publicado.
     * @param volume Volume do artigo.
     * @param numero Número do artigo.
     */
    public ArtigosRevista_Conferencias(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, 
        String titulo, String ano, String autores, Coordenador coordenador, String periódico, String volume, String numero) {
        
        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.periódico = periódico;
        this.volume = volume;
        this.numero = numero;
        this.coordenador = coordenador;
    }


    /**
     * Método que implementa a função de imprimir as informações do artigo.
     */
    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nPeriódico: " + getPeriódico() + "\nVolume: " + getVolume() + "\nNúmero: " + getNumero() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+\n\n");
    }

    /**
     * Método para obter o periódico do artigo.
     * @return Periódico do artigo.
     */
    public String getPeriódico() {
        return periódico;
    }

    /**
     * Método para definir o periódico do artigo.
     * @param periódico Periódico do artigo.
     */
    public void setPeriódico(String periódico) {
        this.periódico = periódico;
    }

    /**
     * Método para obter o volume do artigo.
     * @return Volume do artigo.
     */
    public String getVolume() {
        return volume;
    }

    /**
     * Método para definir o volume do artigo.
     * @param volume Volume do artigo.
     */
    public void setVolume(String volume) {
        this.volume = volume;
    }

    /**
     * Método para obter o número do artigo.
     * @return Número do artigo.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Método para definir o número do artigo.
     * @param numero Número do artigo.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Método para obter o coordenador responsável pela publicação.
     * @return Coordenador responsável pela publicação.
     */
    public Coordenador getCoordenador() {
        return coordenador;
    }

    /**
     * Método para definir o coordenador responsável pela publicação.
     * @param coordenador Coordenador responsável pela publicação.
     */
    public void setCoordenador(Coordenador coordenador) {
        this.coordenador = coordenador;
    }

    
}
