package model.enums;

/**
 * Enumeração que representa as diferentes fases de um processo, como por exemplo um processo licitatório.
 * 
 * <p>As fases disponíveis são:</p>
 * <ul>
 *   <li>{@link #Edital} - Fase de publicação do edital.</li>
 *   <li>{@link #Apresentacao} - Fase de apresentação das propostas ou documentos.</li>
 *   <li>{@link #Julgamento} - Fase de análise e julgamento das propostas.</li>
 *   <li>{@link #Habilitacao} - Fase de habilitação dos participantes.</li>
 *   <li>{@link #Homologacao} - Fase de homologação do resultado final.</li>
 * </ul>
 * 
 * <p>Este enum pode ser utilizado para controlar o progresso ou status de processos administrativos ou licitatórios.</p>
 * 
 * @author Roma
 */
public enum Fase {
    /**
     * Fase de publicação do edital.
     */
    Edital,

    /**
     * Fase de apresentação das propostas ou documentos.
     */
    Apresentacao,

    /**
     * Fase de análise e julgamento das propostas.
     */
    Julgamento,

    /**
     * Fase de habilitação dos participantes.
     */
    Habilitacao,

    /**
     * Fase de homologação do resultado final.
     */
    Homologacao
}