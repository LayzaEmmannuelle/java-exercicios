package model.enums;

/**
 * Enumeração que representa os critérios para escolha do vencedor em um processo de decisão ou seleção.
 * 
 * <p>As opções disponíveis são:</p>
 * <ul>
 *   <li>{@link #Preco} - O vencedor é escolhido com base no menor preço.</li>
 *   <li>{@link #Tecnica} - O vencedor é escolhido com base na melhor técnica.</li>
 *   <li>{@link #TecnicaEPreco} - O vencedor é escolhido com base em uma combinação de técnica e preço.</li>
 * </ul>
 * 
 * <p>Esta enum pode ser usada para representar diferentes estratégias de avaliação.</p>
 * 
 * @author Roma
 */
public enum EscolhaVencedor {
    /**
     * Critério baseado no menor preço.
     */
    Preco,

    /**
     * Critério baseado na melhor técnica.
     */
    Tecnica,

    /**
     * Critério baseado na combinação de técnica e preço.
     */
    TecnicaEPreco
}
