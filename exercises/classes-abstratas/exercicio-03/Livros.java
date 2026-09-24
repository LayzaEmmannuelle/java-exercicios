import java.time.LocalDate;

/**
 * Classe Livros que estende a classe Publicações e implementa os métodos abstratos.
 */
public class Livros extends Publicações{

    private String editora;
    private String local_publicação;
    private Coordenador coordenador;


    /**
     * Construtor padrão da classe Livros.
     */
    public Livros(){
    }


    /**
     * Construtor da classe Livros.
     * @param nome Nome do livro.
     * @param descrição Descrição do livro.
     * @param data_inicio Data de início do livro.
     * @param tipo_data_termino Tipo de data de término do livro.
     * @param data_termino Data de término do livro.
     * @param area_pesquisa Área de pesquisa do livro.
     * @param titulo Título do livro.
     * @param ano Ano de publicação do livro.
     * @param autores Autores do livro.
     * @param coordenador Coordenador responsável pelo livro.
     * @param editora Editora do livro.
     * @param local_publicação Local de publicação do livro.
     */
    public Livros(String nome, String descrição, LocalDate data_inicio, Data_termino tipo_data_termino, LocalDate data_termino, Areas_pesquisas area_pesquisa, 
        String titulo, String ano, String autores, Coordenador coordenador, String editora, String local_publicação) {

        super(nome, descrição, data_inicio, tipo_data_termino, data_termino, area_pesquisa, titulo, ano, autores);
        this.editora = editora;
        this.coordenador = coordenador;
        this.local_publicação = local_publicação;

    }


    /**
     * Método que implementa a função de imprimir as informações do livro.
     */
    public void imprimir_informações(){
        System.out.println("\n\n+------------------------------------------------------+");
        System.out.println("Nome da publicaçao: " + getNome() + "\nDescriçao: " + getDescrição() + "\n\nData início: " + getData_inicio()
        + "\nData final " + getTipo_data_termino() + ": " + getData_termino() + "\nAréa da pesquisa: " + getArea_pesquisa() + "\n\nTitulo: " + getTitulo() + "\nAno: " + getAno() + "\nAutores: " + getAutores()
        + "\nEditora: " + getEditora() + "\nLocal da publicaçao: " + getLocal_publicação() + "\n\nNome do coordenador: " + coordenador.getNome_cordenador()
        + "\nE-mail: " + coordenador.getEmail() + "\nInstituiçao de origem: " + coordenador.getInstituição_origem() + "\nEndereço: " + coordenador.getEndereço()
        + "\nFunçao: " + coordenador.getFunção());
        System.out.println("+------------------------------------------------------+");
    }


    /**
     * Método para obter a editora do livro.
     * @return Editora do livro.
     */
    public String getEditora() {
        return editora;
    }


    /**
     * Método para definir a editora do livro.
     * @param editora Editora do livro.
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }


    /**
     * Método para obter o local de publicação do livro.
     * @return Local de publicação do livro.
     */
    public String getLocal_publicação() {
        return local_publicação;
    }


    /**
     * Método para definir o local de publicação do livro.
     * @param local_publicação Local de publicação do livro.
     */
    public void setLocal_publicação(String local_publicação) {
        this.local_publicação = local_publicação;
    }

    
    
}
