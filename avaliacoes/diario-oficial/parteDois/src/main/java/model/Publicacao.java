package model;

import java.util.ArrayList;

/**
 * Classe abstrata que representa uma publicação genérica.
 * 
 * <p>Define os atributos comuns a diferentes tipos de publicações, como título principal, título auxiliar,
 * conteúdo, órgão responsável e blocos de conteúdo.</p>
 * 
 * <p>Subclasses devem implementar o método abstrato {@code imprimirPublicação()} para definir
 * como a publicação será impressa ou exibida.</p>
 * 
 * @author Roma
 */
public abstract class Publicacao {

    /**
     * Título principal da publicação.
     */
    private String tituloPrincipal;

    /**
     * Título auxiliar da publicação.
     */
    private String tituloAuxiliar;

    /**
     * Conteúdo textual da publicação.
     */
    private String conteudo;

    /**
     * Órgão responsável pela publicação.
     */
    private Orgao orgao;

    /**
     * Lista de blocos de conteúdo que compõem a publicação.
     */
    private ArrayList<Bloco> blocos;

    /**
     * Construtor padrão que inicializa a lista de blocos vazia.
     */
    public Publicacao() {
        this.blocos = new ArrayList<Bloco>();
    }

    /**
     * Construtor que inicializa a publicação com uma lista de blocos fornecida.
     * 
     * @param blocos lista de blocos da publicação
     */
    public Publicacao(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    /**
     * Construtor que inicializa todos os atributos da publicação.
     * 
     * @param tituloPrincipal título principal da publicação
     * @param tituloAuxiliar título auxiliar da publicação
     * @param conteudo conteúdo textual da publicação
     * @param orgao órgão responsável pela publicação
     * @param blocos lista de blocos da publicação
     */
    public Publicacao(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao, ArrayList<Bloco> blocos) {
        this.tituloPrincipal = tituloPrincipal;
        this.tituloAuxiliar = tituloAuxiliar;
        this.conteudo = conteudo;
        this.orgao = orgao;
        this.blocos = blocos;
    }

    /**
     * Obtém o título principal da publicação.
     * 
     * @return o título principal
     */
    public String getTituloPrincipal() {
        return tituloPrincipal;
    }

    /**
     * Define o título principal da publicação.
     * 
     * @param tituloPrincipal o título principal a ser definido
     */
    public void setTituloPrincipal(String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }

    /**
     * Obtém o título auxiliar da publicação.
     * 
     * @return o título auxiliar
     */
    public String getTituloAuxiliar() {
        return tituloAuxiliar;
    }

    /**
     * Define o título auxiliar da publicação.
     * 
     * @param tituloAuxiliar o título auxiliar a ser definido
     */
    public void setTituloAuxiliar(String tituloAuxiliar) {
        this.tituloAuxiliar = tituloAuxiliar;
    }

    /**
     * Obtém o conteúdo textual da publicação.
     * 
     * @return o conteúdo da publicação
     */
    public String getConteudo() {
        return conteudo;
    }

    /**
     * Define o conteúdo textual da publicação.
     * 
     * @param conteudo o conteúdo a ser definido
     */
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    /**
     * Obtém o órgão responsável pela publicação.
     * 
     * @return o órgão responsável
     */
    public Orgao getOrgao() {
        return orgao;
    }

    /**
     * Define o órgão responsável pela publicação.
     * 
     * @param orgao o órgão a ser definido
     */
    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }

    /**
     * Obtém a lista de blocos que compõem a publicação.
     * 
     * @return a lista de blocos
     */
    public ArrayList<Bloco> getBlocos() {
        return blocos;
    }

    /**
     * Define a lista de blocos que compõem a publicação.
     * 
     * @param blocos a lista de blocos a ser definida
     */
    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    /**
     * Método abstrato que deve ser implementado pelas subclasses para definir
     * como a publicação será impressa ou exibida.
     */
    public abstract void imprimirPublicação();
}
