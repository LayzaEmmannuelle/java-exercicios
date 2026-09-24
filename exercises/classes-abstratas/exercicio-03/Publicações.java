import java.time.LocalDate;

/**
 * Classe Publicações que é uma classe abstrata.
 */
public abstract class Publicações {


    private String nome;
    private String descrição;
    private LocalDate data_inicio;
    private Data_termino tipo_data_termino;
    private LocalDate data_termino;
    private Areas_pesquisas area_pesquisa;

    private String titulo;
    private String ano;
    private String autores;



    /**
     * Construtor padrão da classe Publicações.
     */
    public Publicações() {
    }


    /**
     * Construtor da classe Publicações.
     * @param nome Nome da publicação.
     * @param descrição Descrição da publicação.
     * @param data_inicio Data de início da publicação.
     * @param tipo_data_termino Tipo de data de término da publicação.
     * @param data_termino Data de término da publicação.
     * @param area_pesquisa Área de pesquisa da publicação.
     * @param titulo Título do artigo ou livro.
     * @param ano Ano de publicação do artigo ou livro.
     * @param autores Autores do artigo ou livro.
     */
    public Publicações(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino,
        Areas_pesquisas area_pesquisa, String titulo, String ano, String autores) {

        this.nome = nome;
        this.descrição = descrição;
        this.data_inicio = data_inicio;
        this.tipo_data_termino = tipo_data_termino;
        this.data_termino = data_termino;
        this.area_pesquisa = area_pesquisa;
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        
    }


    /**
     * Método abstrato para imprimir as informações da publicação.
     */
    public abstract void imprimir_informações();



    /**
     * Método para obter o nome da publicação.
     * @return Nome da publicação.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir o nome da publicação.
     * @param nome Nome da publicação.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter a descrição da publicação.
     * @return Descrição da publicação.
     */
    public String getDescrição() {
        return descrição;
    }

    /**
     * Método para definir a descrição da publicação.
     * @param descrição Descrição da publicação.
     */
    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    /**
     * Método para obter a data de início da publicação.
     * @return Data de início da publicação.
     */
    public LocalDate getData_inicio() {
        return data_inicio;
    }

    /**
     * Método para definir a data de início da publicação.
     * @param data_inicio Data de início da publicação.
     */
    public void setData_inicio(LocalDate data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * Método para obter a data de término da publicação.
     * @return Data de término da publicação.
     */
    public LocalDate getData_termino() {
        return data_termino;
    }

    /**
     * Método para definir a data de término da publicação.
     * @param data_termino Data de término da publicação.
     */
    public void setData_termino(LocalDate data_termino) {
        this.data_termino = data_termino;
    }

    /**
     * Método para obter a área de pesquisa da publicação.
     * @return Área de pesquisa da publicação.
     */
    public Areas_pesquisas getArea_pesquisa() {
        return area_pesquisa;
    }

    /**
     * Método para definir a área de pesquisa da publicação.
     * @param area_pesquisa Área de pesquisa da publicação.
     */
    public void setArea_pesquisa(Areas_pesquisas area_pesquisa) {
        this.area_pesquisa = area_pesquisa;
    }

    /**
     * Método para obter o título da publicação.
     * @return Título da publicação.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Método para definir o título da publicação.
     * @param titulo Título da publicação.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método para obter o ano da publicação.
     * @return Ano da publicação.
     */
    public String getAno() {
        return ano;
    }

    /**
     * Método para definir o ano da publicação.
     * @param ano Ano da publicação.
     */
    public void setAno(String ano) {
        this.ano = ano;
    }

    /**
     * Método para obter os autores da publicação.
     * @return Autores da publicação.
     */
    public String getAutores() {
        return autores;
    }

    /**
     * Método para definir os autores da publicação.
     * @param autores Autores da publicação.
     */
    public void setAutores(String autores) {
        this.autores = autores;
    }

    /**
     * Método para obter o tipo de data de término da publicação.
     * @return Tipo de data de término da publicação.
     */
    public Data_termino getTipo_data_termino() {
        return tipo_data_termino;
    }

    /**
     * Método para definir o tipo de data de término da publicação.
     * @param tipo_data_termino Tipo de data de término da publicação.
     */
    public void setTipo_data_termino(Data_termino tipo_data_termino) {
        this.tipo_data_termino = tipo_data_termino;
    }

    
}
