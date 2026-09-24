package model;

import java.util.ArrayList;

/**
 * Classe que representa um contrato, que é um tipo específico de publicação.
 * 
 * <p>Esta classe estende {@link Publicacao} e adiciona a funcionalidade de gerenciar uma lista de aditivos contratuais.</p>
 * 
 * <p>Um contrato pode conter:</p>
 * <ul>
 *   <li>Um título principal e um título auxiliar.</li>
 *   <li>Conteúdo textual.</li>
 *   <li>Informações sobre o órgão responsável.</li>
 *   <li>Uma lista de blocos de conteúdo, como textos, imagens e tabelas.</li>
 *   <li>Uma lista de aditivos associados.</li>
 * </ul>
 * 
 * <p>O método {@code imprimirPublicação} está sobrescrito para imprimir o conteúdo dos blocos do contrato.</p>
 * 
 * @author Roma
 */
public class Contrato extends Publicacao {

    /**
     * Lista de aditivos associados ao contrato.
     */
    private ArrayList<Aditivo> aditivos;
    
    /**
     * Construtor padrão que inicializa a lista de aditivos vazia.
     */
    public Contrato() {
        aditivos = new ArrayList<Aditivo>();
    }

    /**
     * Construtor que inicializa o contrato com os dados informados, incluindo a lista de aditivos.
     * 
     * @param tituloPrincipal título principal da publicação
     * @param tituloAuxiliar título auxiliar da publicação
     * @param conteudo conteúdo textual da publicação
     * @param orgao órgão responsável pela publicação
     * @param blocos lista de blocos de conteúdo do contrato
     * @param aditivos lista de aditivos associados ao contrato
     */
    public Contrato(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos, ArrayList<Aditivo> aditivos) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
        this.aditivos = aditivos;
    }

    /**
     * Obtém a lista de aditivos associados ao contrato.
     * 
     * @return a lista de aditivos
     */
    public ArrayList<Aditivo> getAditivos() {
        return aditivos;
    }

    /**
     * Define a lista de aditivos associados ao contrato.
     * 
     * @param aditivos a lista de aditivos a ser definida
     */
    public void setAditivos(ArrayList<Aditivo> aditivos) {
        this.aditivos = aditivos;
    }

    /**
     * Imprime a publicação, exibindo o conteúdo dos blocos do contrato.
     * 
     * <p>Atualmente, apenas blocos do tipo texto são exibidos no console. Os blocos do tipo imagem e tabela
     * possuem comentários indicando onde implementar a exibição apropriada.</p>
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

