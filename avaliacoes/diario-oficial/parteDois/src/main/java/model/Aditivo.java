package model;

import model.enums.TipoAditivo;

/**
 * Classe que representa um aditivo contratual, podendo envolver alterações como valor, vigência ou outros tipos.
 * 
 * <p>Um aditivo é utilizado para formalizar modificações em contratos previamente firmados.</p>
 * 
 * <p>Esta classe contém:</p>
 * <ul>
 *   <li>Um identificador único ({@link #id}).</li>
 *   <li>O tipo de aditivo ({@link #tipoAditivo}), que pode ser valor, vigência ou outro.</li>
 * </ul>
 * 
 * @author Roma
 */
public class Aditivo {

    /**
     * Identificador único do aditivo.
     */
    private int id;

    /**
     * Tipo do aditivo, definido pelo enum {@link TipoAditivo}.
     */
    private TipoAditivo tipoAditivo;

    /**
     * Obtém o tipo do aditivo.
     * 
     * @return o tipo do aditivo
     */
    public TipoAditivo getTipoAditivo() {
        return tipoAditivo;
    }

    /**
     * Define o tipo do aditivo.
     * 
     * @param tipoAditivo o tipo do aditivo a ser definido
     */
    public void setTipoAditivo(TipoAditivo tipoAditivo) {
        this.tipoAditivo = tipoAditivo;
    }

    /**
     * Obtém o identificador do aditivo.
     * 
     * @return o identificador do aditivo
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do aditivo.
     * 
     * @param id o identificador a ser definido
     */
    public void setId(int id) {
        this.id = id;
    }
}
