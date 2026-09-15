package model;

import java.util.ArrayList;
import model.enums.TipoLegislacao;

/**
 * Classe que representa uma legislação, que é um tipo específico de publicação contendo normas jurídicas.
 * 
 * <p>Esta classe estende {@link Publicacao} e adiciona o atributo {@code tipoLegislacao} para especificar
 * o tipo de legislação, conforme o enum {@link TipoLegislacao}.</p>
 * 
 * <p>O método {@code imprimirPublicação} está sobrescrito para imprimir o conteúdo dos blocos da legislação.</p>
 * 
 * @author Roma
 */
public class Legislacao extends Publicacao {

    /**
     * Tipo da legislação, conforme definido pelo enum {@link TipoLegislacao}.
     */
    private TipoLegislacao tipoLegislacao;

    /**
     * Construtor padrão.
     */
    public Legislacao() {
    }

    /**
     * Construtor que inicializa a legislação com os dados informados.
     * 
     * @param id identificador da legislação (não usado diretamente na classe base, mas pode ser útil)
     * @param tituloPrincipal título principal da publicação
     * @param tituloAuxiliar título auxiliar da publicação
     * @param conteudo conteúdo textual da publicação
     * @param orgao órgão responsável pela publicação
     * @param blocos lista de blocos de conteúdo
     * @param legislacao tipo da legislação
     */
    public Legislacao(int id, String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos, TipoLegislacao legislacao) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
        this.tipoLegislacao = legislacao;
    }

    /**
     * Obtém o tipo da legislação.
     * 
     * @return o tipo da legislação
     */
    public TipoLegislacao getTipoLegislacao() {
        return tipoLegislacao;
    }

    /**
     * Define o tipo da legislação.
     * 
     * @param tipoLegislacao o tipo da legislação a ser definido
     */
    public void setTipoLegislacao(TipoLegislacao tipoLegislacao) {
        this.tipoLegislacao = tipoLegislacao;
    }

    /**
     * Imprime o conteúdo dos blocos da legislação.
     * 
     * <p>Atualmente, apenas blocos do tipo texto são exibidos no console. Blocos do tipo imagem e tabela possuem
     * comentários indicando onde implementar a exibição adequada.</p>
     */
    @Override
    public void imprimirPublicação() {
        for (Bloco b : this.getBlocos()) {
            switch (b.getTipo()) {
                case Texto:
                    System.out.println(b.getTexto());
                    break;
                case Imagem:
                    // Implementar um mecanismo para exibir imagens.
                    break;
                case Tabela:
                    // Implementar um mecanismo para exibir tabelas.
                    break;
            }
        }
    }
}
