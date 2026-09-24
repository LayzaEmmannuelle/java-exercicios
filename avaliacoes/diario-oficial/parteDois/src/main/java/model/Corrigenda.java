package model;

import java.util.ArrayList;

/**
 * Classe que representa uma corrigenda, um tipo de publicação utilizada para corrigir informações anteriores.
 * 
 * <p>Esta classe estende {@link Publicacao} e adiciona um campo específico chamado {@code content} para conteúdo adicional.</p>
 * 
 * <p>O método {@code imprimirPublicação} está sobrescrito para exibir o título principal, título auxiliar e os blocos de conteúdo.</p>
 * 
 * @author Roma
 */
public class Corrigenda extends Publicacao {
    
    /**
     * Conteúdo adicional específico da corrigenda.
     */
    private String content;

    /**
     * Construtor que inicializa a corrigenda com os dados informados.
     * 
     * @param tituloPrincipal título principal da publicação
     * @param tituloAuxiliar título auxiliar da publicação
     * @param conteudo conteúdo textual da publicação
     * @param orgao órgão responsável pela publicação
     * @param blocos lista de blocos de conteúdo da corrigenda
     */
    public Corrigenda(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos) {
        super(tituloPrincipal, tituloAuxiliar, conteudo, orgao, blocos);
    }

    /**
     * Imprime a publicação, exibindo título principal, título auxiliar e conteúdo dos blocos.
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
     * Obtém o conteúdo adicional da corrigenda.
     * 
     * @return o conteúdo adicional
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Define o conteúdo adicional da corrigenda.
     * 
     * @param content o conteúdo a ser definido
     */
    public void setContent(String content) {
        this.content = content;
    }
}
