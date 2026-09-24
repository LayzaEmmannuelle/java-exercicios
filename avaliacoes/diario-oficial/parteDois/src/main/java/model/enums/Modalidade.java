package model.enums;

/**
 * Enumeração que representa as diferentes modalidades de licitação ou contratação pública.
 * 
 * <p>As modalidades disponíveis são:</p>
 * <ul>
 *   <li>{@link #Convite} - Modalidade para licitações entre interessados do ramo pertinente, escolhidos e convidados pela administração.</li>
 *   <li>{@link #TomadaDePrecos} - Modalidade para licitações com fornecedores previamente cadastrados que atendam às condições exigidas.</li>
 *   <li>{@link #Concorrencia} - Modalidade para licitações com participação aberta a qualquer interessado que atenda às exigências do edital.</li>
 *   <li>{@link #Pregao} - Modalidade para aquisição de bens e serviços comuns, onde os licitantes apresentam lances sucessivos.</li>
 *   <li>{@link #DispensaDeLicitacao} - Casos específicos onde a licitação pode ser dispensada por previsão legal.</li>
 *   <li>{@link #Inexigibilidade} - Casos em que a competição é inviável, como quando há fornecedor exclusivo.</li>
 *   <li>{@link #Concurso} - Modalidade para escolha de trabalho técnico, científico ou artístico mediante a instituição de prêmios ou remuneração.</li>
 * </ul>
 * 
 * <p>Este enum pode ser usado para classificar e controlar os tipos de processos licitatórios em um sistema de gestão pública.</p>
 * 
 * @author Roma
 */
public enum Modalidade {
    /**
     * Modalidade para licitações entre interessados convidados pela administração.
     */
    Convite,

    /**
     * Modalidade para licitações com fornecedores previamente cadastrados.
     */
    TomadaDePrecos,

    /**
     * Modalidade para licitações abertas a qualquer interessado.
     */
    Concorrencia,

    /**
     * Modalidade para aquisição de bens e serviços comuns, com lances sucessivos.
     */
    Pregao,

    /**
     * Casos onde a licitação pode ser dispensada conforme a lei.
     */
    DispensaDeLicitacao,

    /**
     * Casos em que a competição é inviável, como fornecedor exclusivo.
     */
    Inexigibilidade,

    /**
     * Modalidade para escolha de trabalhos técnicos, científicos ou artísticos mediante prêmio.
     */
    Concurso
}