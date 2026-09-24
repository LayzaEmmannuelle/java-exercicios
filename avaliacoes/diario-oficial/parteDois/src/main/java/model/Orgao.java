package model;

import model.enums.Poder;

/**
 * Classe que representa um órgão público, com informações de identificação e esfera de poder.
 * 
 * <p>Contém um identificador, nome do órgão e o poder ao qual pertence.</p>
 * 
 * @author Roma
 */
public class Orgao {

    /**
     * Identificador único do órgão.
     */
    private int id;

    /**
     * Nome do órgão público.
     */
    private String nomeOrg;

    /**
     * Poder ao qual o órgão pertence, definido pelo enum {@link Poder}.
     */
    private Poder poder;

    /**
     * Construtor que inicializa o órgão com seus atributos.
     * 
     * @param id identificador do órgão
     * @param nomeOrg nome do órgão público
     * @param poder poder ao qual o órgão pertence
     */
    public Orgao(int id, String nomeOrg, Poder poder) {
        this.id = id;
        this.nomeOrg = nomeOrg;
        this.poder = poder;
    }

    /**
     * Obtém o poder ao qual o órgão pertence.
     * 
     * @return o poder do órgão
     */
    public Poder getPoder() {
        return poder;
    }

    /**
     * Define o poder ao qual o órgão pertence.
     * 
     * @param poder o poder a ser definido
     */
    public void setPoder(Poder poder) {
        this.poder = poder;
    }

    /**
     * Obtém o nome do órgão.
     * 
     * @return o nome do órgão
     */
    public String getNomeOrg() {
        return nomeOrg;
    }

    /**
     * Define o nome do órgão.
     * 
     * @param nomeOrg o nome a ser definido
     */
    public void setNomeOrg(String nomeOrg) {
        this.nomeOrg = nomeOrg;
    }

    /**
     * Obtém o identificador do órgão.
     * 
     * @return o identificador do órgão
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do órgão.
     * 
     * @param id o identificador a ser definido
     */
    public void setId(int id) {
        this.id = id;
    }
}

