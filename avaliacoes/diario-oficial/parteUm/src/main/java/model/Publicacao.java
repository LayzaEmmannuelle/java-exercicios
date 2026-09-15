package model;

import java.util.ArrayList;

/**
 * Representa uma publicação oficial, composta por um título, órgão responsável e uma lista de blocos de conteúdo.
 */
public class Publicacao {

    private String tituloPrincipal;
    private String tituloAuxiliar;
    private String conteudo;
    private Orgao orgao;
    private ArrayList<Bloco> blocos;

    /**
     * Construtor padrão, inicializa a lista de blocos vazia.
     */
    public Publicacao() {
        this.blocos = new ArrayList<Bloco>();
    }

    /**
     * Construtor que inicializa a publicação com uma lista de blocos.
     * 
     * @param blocos lista de blocos que compõem o conteúdo da publicação
     */
    public Publicacao(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    /**
     * Construtor completo da publicação.
     * 
     * @param tituloPrincipal título principal da publicação
     * @param tituloAuxiliar título auxiliar da publicação (opcional)
     * @param conteudo conteúdo textual geral da publicação (pode ser nulo se usar blocos)
     * @param orgao órgão responsável pela publicação
     * @param blocos lista de blocos que compõem o conteúdo da publicação
     */
    public Publicacao(String tituloPrincipal, String tituloAuxiliar, String conteudo, Orgao orgao,
            ArrayList<Bloco> blocos) {
        this.tituloPrincipal = tituloPrincipal;
        this.tituloAuxiliar = tituloAuxiliar;
        this.conteudo = conteudo;
        this.orgao = orgao;
        this.blocos = blocos;
    }

    public String getTituloPrincipal() {
        return tituloPrincipal;
    }

    public void setTituloPrincipal(String tituloPrincipal) {
        this.tituloPrincipal = tituloPrincipal;
    }

    public String getTituloAuxiliar() {
        return tituloAuxiliar;
    }

    public void setTituloAuxiliar(String tituloAuxiliar) {
        this.tituloAuxiliar = tituloAuxiliar;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Orgao getOrgao() {
        return orgao;
    }

    public void setOrgao(Orgao orgao) {
        this.orgao = orgao;
    }

    public ArrayList<Bloco> getBlocos() {
        return blocos;
    }

    public void setBlocos(ArrayList<Bloco> blocos) {
        this.blocos = blocos;
    }

    /**
     * Imprime o conteúdo da publicação no console.
     * Atualmente, apenas blocos do tipo Texto são exibidos.
     * Para blocos do tipo Imagem e Tabela, será necessário implementar a exibição adequada.
     */
    public void imprimirPublicação() {
        for (Bloco b : this.getBlocos()) {
            switch (b.getTipo()) {
                case Texto:
                    System.out.println(b.getTexto());
                    break;
                case Imagem:
                    // TODO: Implementar exibição de imagens
                    break;
                case Tabela:
                    // TODO: Implementar exibição de tabelas
                    break;
            }
        }
    }

}
