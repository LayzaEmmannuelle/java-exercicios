package model.enums;

/**
 * Enumeração que representa os diferentes tipos de blocos que podem compor um conteúdo, como relatórios, documentos ou páginas.
 * 
 * <p>Os tipos disponíveis são:</p>
 * <ul>
 *   <li>{@link #Texto} - Bloco de texto.</li>
 *   <li>{@link #Imagem} - Bloco contendo uma imagem.</li>
 *   <li>{@link #Tabela} - Bloco contendo uma tabela de dados.</li>
 * </ul>
 * 
 * <p>Este enum pode ser utilizado para estruturar conteúdos dinâmicos ou formatados em sistemas de gerenciamento.</p>
 * 
 * @author Roma
 */
public enum TipoBloco {
    /**
     * Bloco contendo texto.
     */
    Texto,

    /**
     * Bloco contendo uma imagem.
     */
    Imagem, 

    /**
     * Bloco contendo uma tabela de dados.
     */
    Tabela 
}