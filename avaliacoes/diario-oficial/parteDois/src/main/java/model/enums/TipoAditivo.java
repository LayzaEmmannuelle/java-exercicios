package model.enums;

/**
 * Enumeração que representa os tipos de aditivos contratuais que podem ser aplicados a contratos ou acordos.
 * 
 * <p>Os tipos disponíveis são:</p>
 * <ul>
 *   <li>{@link #Valor} - Aditivo relacionado à alteração no valor do contrato.</li>
 *   <li>{@link #Vigencia} - Aditivo relacionado à alteração no prazo de vigência do contrato.</li>
 *   <li>{@link #Outro} - Aditivo de outro tipo não especificado.</li>
 * </ul>
 * 
 * <p>Este enum pode ser utilizado para classificar modificações contratuais no sistema.</p>
 * 
 * @author Roma
 */
public enum TipoAditivo {
    /**
     * Aditivo que altera o valor do contrato.
     */
    Valor, 
    
    /**
     * Aditivo que altera o prazo de vigência do contrato.
     */
    Vigencia,
    
    /**
     * Aditivo de outro tipo, não especificado.
     */
    Outro
}