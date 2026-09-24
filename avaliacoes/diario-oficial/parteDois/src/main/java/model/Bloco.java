package model;

import model.enums.TipoBloco;

/**
 * Classe que representa um bloco de conteúdo que pode ser texto, imagem ou tabela.
 * 
 * <p>Cada bloco possui um texto associado, um tipo que indica sua natureza e uma ordem para organização.</p>
 * 
 * <p>Construtores disponíveis para criação de blocos com diferentes níveis de informação:</p>
 * <ul>
 *   <li>Construtor padrão que inicializa o texto vazio.</li>
 *   <li>Construtor que recebe apenas o texto.</li>
 *   <li>Construtor que recebe texto, tipo e ordem.</li>
 * </ul>
 * 
 * <p>Este modelo é útil para estruturar conteúdos dinâmicos e organizados.</p>
 * 
 * @author Roma
 */
public class Bloco {

    /**
     * Texto associado ao bloco.
     */
    private String texto;

    /**
     * Tipo do bloco, definido pelo enum {@link TipoBloco}.
     */
    private TipoBloco tipo;

    /**
     * Ordem do bloco dentro de uma sequência ou documento.
     */
    private int ordem;

    /**
     * Construtor padrão que inicializa o texto como vazio.
     */
    public Bloco() {
        this.texto = "";
    }

    /**
     * Construtor que inicializa o bloco com o texto informado.
     * 
     * @param texto texto do bloco
     */
    public Bloco(String texto) {
        this.texto = texto;
    }

    /**
     * Construtor que inicializa o bloco com texto, tipo e ordem.
     * 
     * @param texto texto do bloco
     * @param tipo tipo do bloco, conforme {@link TipoBloco}
     * @param ordem ordem do bloco
     */
    public Bloco(String texto, TipoBloco tipo, int ordem) {
        this.texto = texto;
        this.tipo = tipo;
        this.ordem = ordem;
    }

    /**
     * Obtém a ordem do bloco.
     * 
     * @return a ordem do bloco
     */
    public int getOrdem() {
        return ordem;
    }

    /**
     * Define a ordem do bloco.
     * 
     * @param ordem a ordem a ser definida
     */
    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    /**
     * Obtém o tipo do bloco.
     * 
     * @return o tipo do bloco
     */
    public TipoBloco getTipo() {
        return tipo;
    }

    /**
     * Define o tipo do bloco.
     * 
     * @param tipo o tipo a ser definido, conforme {@link TipoBloco}
     */
    public void setTipo(TipoBloco tipo) {
        this.tipo = tipo;
    }

    /**
     * Obtém o texto do bloco.
     * 
     * @return o texto do bloco
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define o texto do bloco.
     * 
     * @param texto o texto a ser definido
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }
}

