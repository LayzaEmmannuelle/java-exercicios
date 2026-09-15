package model;

import java.util.ArrayList;
import model.enums.Modalidade;
import model.enums.Fase;

/**
 * Classe que representa uma Licitação, um tipo de publicação que trata de processos licitatórios.
 * 
 * <p>Esta classe estende {@link Publicacao} e adiciona atributos específicos do processo de licitação, como fase,
 * datas das fases, modalidade e tipo de escolha do vencedor.</p>
 * 
 * <p>O método {@code imprimirPublicação} está sobrescrito para imprimir o título e o conteúdo dos blocos.</p>
 * 
 * @author Roma
 */
public class Licitacao extends Publicacao {

    /**
     * Fase atual da licitação, conforme o enum {@link Fase}.
     */
    private Fase fase;

    /**
     * Data de abertura da fase (representada como inteiro, sugere-se melhorar para tipo de data).
     */
    private int dataAberturaFase;

    /**
     * Modalidade da licitação, conforme o enum {@link Modalidade}.
     */
    private Modalidade modalidade;

    /**
     * Data de encerramento da fase (representada como inteiro, sugere-se melhorar para tipo de data).
     */
    private int dataEncerramentoFase;

    /**
     * Tipo da escolha do vencedor (representado como inteiro, pode ser aprimorado para enum).
     */
    private int tipoEscolhaVencedor;

    /**
     * Construtor que inicializa a licitação com os dados básicos da publicação.
     * 
     * @param tituloPrincipal título principal da publicação
     * @param tituloAuxiliar título auxiliar da publicação
     * @param conteudo conteúdo textual da publicação
     * @param orgao órgão responsável pela publicação
     * @param blocos lista de blocos de conteúdo
     */
    public Licitacao(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
    }

    /**
     * Imprime a publicação, exibindo o título principal, título auxiliar e o conteúdo dos blocos.
     * 
     * <p>Atualmente, apenas blocos do tipo texto são exibidos no console. Blocos do tipo imagem e tabela possuem
     * comentários indicando onde implementar a exibição adequada.</p>
     */
    @Override
    public void imprimirPublicação() {
        System.out.println(this.getTituloPrincipal());
        System.out.println(this.getTituloAuxiliar());
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

    /**
     * Obtém o tipo da escolha do vencedor.
     * 
     * @return o tipo da escolha do vencedor
     */
    public int getTipoEscolhaVencedor() {
        return tipoEscolhaVencedor;
    }

    /**
     * Define o tipo da escolha do vencedor.
     * 
     * @param tipoEscolhaVencedor o tipo da escolha a ser definido
     */
    public void setTipoEscolhaVencedor(int tipoEscolhaVencedor) {
        this.tipoEscolhaVencedor = tipoEscolhaVencedor;
    }

    /**
     * Obtém a data de encerramento da fase da licitação.
     * 
     * @return a data de encerramento da fase
     */
    public int getDataEncerramentoFase() {
        return dataEncerramentoFase;
    }

    /**
     * Define a data de encerramento da fase da licitação.
     * 
     * @param dataEncerramentoFase a data a ser definida
     */
    public void setDataEncerramentoFase(int dataEncerramentoFase) {
        this.dataEncerramentoFase = dataEncerramentoFase;
    }

    /**
     * Obtém a data de abertura da fase da licitação.
     * 
     * @return a data de abertura da fase
     */
    public int getDataAberturaFase() {
        return dataAberturaFase;
    }

    /**
     * Define a data de abertura da fase da licitação.
     * 
     * @param dataAberturaFase a data a ser definida
     */
    public void setDataAberturaFase(int dataAberturaFase) {
        this.dataAberturaFase = dataAberturaFase;
    }

    /**
     * Obtém a fase atual da licitação.
     * 
     * @return a fase da licitação
     */
    public Fase getFase() {
        return this.fase;
    }

    /**
     * Define a fase atual da licitação.
     * 
     * @param fase a fase a ser definida
     */
    public void setFase(Fase fase) {
        this.fase = fase;
    }

    /**
     * Obtém a modalidade da licitação.
     * 
     * @return a modalidade da licitação
     */
    public Modalidade getModalidade() {
        return modalidade;
    }

    /**
     * Define a modalidade da licitação.
     * 
     * @param modalidade a modalidade a ser definida
     */
    public void setModalidade(Modalidade modalidade) {
        this.modalidade = modalidade;
    }
}
