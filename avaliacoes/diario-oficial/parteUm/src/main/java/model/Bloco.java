package model;

import model.enums.TipoBloco;

/**
 * Representa um bloco de conteúdo em uma publicação do Diário Oficial.
 * Pode ser texto, imagem, tabela, etc., com uma ordem para exibição.
 */
public class Bloco {

    private String texto;
    private TipoBloco tipo;
    private int ordem;

    /**
     * Construtor padrão, inicializa texto vazio.
     */
    public Bloco() {
        this.texto = "";
    }

    /**
     * Construtor que define apenas o texto.
     * 
     * @param texto conteúdo textual do bloco
     */
    public Bloco(String texto) {
        this.texto = texto;
    }

    /**
     * Construtor completo com texto, tipo e ordem.
     * 
     * @param texto conteúdo do bloco
     * @param tipo tipo do bloco (Texto, Imagem, Tabela, etc.)
     * @param ordem ordem sequencial do bloco na publicação
     */
    public Bloco(String texto, TipoBloco tipo, int ordem) {
        this.texto = texto;
        this.tipo = tipo;
        this.ordem = ordem;
    }

    // Getters e Setters

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public TipoBloco getTipo() {
        return tipo;
    }

    public void setTipo(TipoBloco tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

}
