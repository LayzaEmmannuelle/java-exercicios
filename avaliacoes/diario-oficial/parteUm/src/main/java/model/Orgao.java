package model;

import model.enums.Poder;

/**
 * Representa um órgão público, com identificador, nome e poder a que pertence.
 */
public class Orgao {
    private int id;
    private String nomeOrg;
    private Poder poder;

    /**
     * Construtor da classe Orgao.
     * 
     * @param id identificador único do órgão
     * @param nomeOrg nome do órgão
     * @param poder poder ao qual o órgão está vinculado (Executivo, Legislativo, Judiciário)
     */
    public Orgao(int id, String nomeOrg, Poder poder) {
        this.id = id;
        this.nomeOrg = nomeOrg;
        this.poder = poder;
    }

    /**
     * Retorna o poder ao qual o órgão está vinculado.
     * 
     * @return o poder do órgão
     */
    public Poder getPoder() {
        return poder;
    }

    /**
     * Define o poder ao qual o órgão está vinculado.
     * 
     * @param poder o poder a ser definido
     */
    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    /**
     * Retorna o nome do órgão.
     * 
     * @return nome do órgão
     */
    public String getNomeOrg() {
        return nomeOrg;
    }

    /**
     * Define o nome do órgão.
     * 
     * @param nomeOrg nome do órgão
     */
    public void setNomeOrg(String nomeOrg) {
        this.nomeOrg = nomeOrg;
    }

    /**
     * Retorna o identificador do órgão.
     * 
     * @return id do órgão
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do órgão.
     * 
     * @param id identificador a ser definido
     */
    public void setId(int id) {
        this.id = id;
    }
}
