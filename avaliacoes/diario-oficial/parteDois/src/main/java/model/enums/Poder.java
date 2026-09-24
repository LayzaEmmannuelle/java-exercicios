package model.enums;

/**
 * Enumeração que representa os diferentes poderes e órgãos autônomos no sistema governamental.
 * 
 * <p>As opções disponíveis são:</p>
 * <ul>
 *   <li>{@link #Executivo} - Poder responsável pela administração e execução das leis.</li>
 *   <li>{@link #Legislativo} - Poder responsável por criar, alterar e revogar leis.</li>
 *   <li>{@link #Juciciario} - Poder responsável por interpretar e aplicar as leis, resolvendo conflitos.</li>
 *   <li>{@link #MinisterioPublico} - Órgão independente que fiscaliza o cumprimento das leis e defende os interesses da sociedade.</li>
 * </ul>
 * 
 * <p>Este enum pode ser utilizado para classificar entidades, processos ou agentes de acordo com o poder a que pertencem.</p>
 * 
 * @author Roma
 */
public enum Poder {
    /**
     * Poder Executivo - responsável pela administração pública e execução das leis.
     */
    Executivo,

    /**
     * Poder Legislativo - responsável pela criação, alteração e revogação das leis.
     */
    Legislativo,

    /**
     * Poder Judiciário - responsável por interpretar as leis e resolver conflitos.
     */
    Juciciario,

    /**
     * Ministério Público - órgão independente que fiscaliza o cumprimento das leis e protege os interesses da sociedade.
     */
    MinisterioPublico
}