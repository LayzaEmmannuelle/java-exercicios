package model.enums;

/**
 * Enumeração que representa os diferentes tipos de legislação existentes no ordenamento jurídico.
 * 
 * <p>Os tipos disponíveis são:</p>
 * <ul>
 *   <li>{@link #LeisOrdinarias} - Leis que tratam de matérias gerais, aprovadas por maioria simples.</li>
 *   <li>{@link #LeisComplementares} - Leis que complementam a Constituição, exigindo quórum qualificado para aprovação.</li>
 *   <li>{@link #LeisDelegadas} - Leis elaboradas pelo Presidente da República mediante autorização do Congresso Nacional.</li>
 *   <li>{@link #MedidasProvisorias} - Normas com força de lei editadas pelo Presidente em situações de relevância e urgência.</li>
 *   <li>{@link #EmendasConstitucionais} - Alterações no texto da Constituição.</li>
 *   <li>{@link #DecretosLegislativos} - Atos normativos de competência exclusiva do Poder Legislativo.</li>
 *   <li>{@link #Resolucoes} - Atos normativos geralmente utilizados para regulamentar assuntos internos dos órgãos legislativos.</li>
 *   <li>{@link #Portaria} - Ato administrativo que regulamenta a aplicação de leis e normas, geralmente emitido por ministros ou secretários.</li>
 * </ul>
 * 
 * <p>Este enum pode ser utilizado para classificar documentos, normas ou processos legislativos em sistemas jurídicos ou administrativos.</p>
 * 
 * @author Roma
 */
public enum TipoLegislacao {
    /**
     * Leis ordinárias, aprovadas por maioria simples, que tratam de matérias gerais.
     */
    LeisOrdinarias, 
    
    /**
     * Leis complementares que exigem quórum qualificado e complementam a Constituição.
     */
    LeisComplementares,
    
    /**
     * Leis delegadas elaboradas pelo Presidente com autorização do Congresso Nacional.
     */
    LeisDelegadas, 
    
    /**
     * Medidas provisórias editadas pelo Presidente em casos de relevância e urgência.
     */
    MedidasProvisorias,
    
    /**
     * Emendas constitucionais que modificam o texto da Constituição.
     */
    EmendasConstitucionais,
    
    /**
     * Decretos legislativos, atos normativos exclusivos do Poder Legislativo.
     */
    DecretosLegislativos,
    
    /**
     * Resoluções que regulamentam assuntos internos dos órgãos legislativos.
     */
    Resolucoes,
    
    /**
     * Portarias administrativas emitidas por ministros, secretários ou autoridades competentes.
     */
    Portaria
}