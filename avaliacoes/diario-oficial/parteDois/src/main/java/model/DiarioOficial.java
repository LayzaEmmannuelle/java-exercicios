package model;

import java.util.ArrayList;
import model.enums.Esfera;

/**
 * Classe que representa um Diário Oficial, veículo oficial de publicação de atos, documentos e informações governamentais.
 * 
 * <p>O Diário Oficial possui os seguintes atributos:</p>
 * <ul>
 *   <li>Título do diário.</li>
 *   <li>Número de edição.</li>
 *   <li>Esfera governamental a que pertence ({@link Esfera}).</li>
 *   <li>Data da edição.</li>
 *   <li>Lista de publicações contidas no diário ({@link Publicacao}).</li>
 * </ul>
 * 
 * <p>Possui métodos para adicionar, remover e imprimir publicações, além dos getters e setters padrão.</p>
 * 
 * @author Roma
 */
public class DiarioOficial {

    /**
     * Título do Diário Oficial.
     */
    private String titulo;

    /**
     * Número da edição do Diário Oficial.
     */
    private int numero;

    /**
     * Esfera governamental a que o Diário Oficial pertence.
     */
    private Esfera esfera;

    /**
     * Data da edição do Diário Oficial.
     */
    private String data;

    /**
     * Lista de publicações contidas no Diário Oficial.
     */
    private ArrayList<Publicacao> publicações;

    /**
     * Construtor padrão que inicializa o título vazio e a lista de publicações vazia.
     */
    public DiarioOficial() {
        this.titulo = "";
        this.publicações = new ArrayList<Publicacao>();
    }

    /**
     * Construtor que inicializa o Diário Oficial com o título informado e lista de publicações vazia.
     * 
     * @param titulo título do Diário Oficial
     */
    public DiarioOficial(String titulo) {
        this.titulo = titulo;
        this.publicações = new ArrayList<Publicacao>();
    }

    /**
     * Construtor que inicializa o Diário Oficial com a lista de publicações informada.
     * 
     * @param publicações lista de publicações do Diário Oficial
     */
    public DiarioOficial(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    /**
     * Construtor que inicializa todos os atributos do Diário Oficial.
     * 
     * @param data data da edição
     * @param numero número da edição
     * @param titulo título do Diário Oficial
     * @param esfera esfera governamental
     * @param publicações lista de publicações
     */
    public DiarioOficial(String data, int numero, String titulo, Esfera esfera, ArrayList<Publicacao> publicações) {
        this.data = data;
        this.numero = numero;
        this.titulo = titulo;
        this.esfera = esfera;
        this.publicações = publicações;
    }

    /**
     * Obtém o título do Diário Oficial.
     * 
     * @return o título do Diário Oficial
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define o título do Diário Oficial.
     * 
     * @param titulo o título a ser definido
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Obtém o número da edição do Diário Oficial.
     * 
     * @return o número da edição
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Define o número da edição do Diário Oficial.
     * 
     * @param numero o número a ser definido
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Obtém a esfera governamental do Diário Oficial.
     * 
     * @return a esfera governamental
     */
    public Esfera getEsfera() {
        return esfera;
    }

    /**
     * Define a esfera governamental do Diário Oficial.
     * 
     * @param esfera a esfera a ser definida
     */
    public void setEsfera(Esfera esfera) {
        this.esfera = esfera;
    }

    /**
     * Obtém a data da edição do Diário Oficial.
     * 
     * @return a data da edição
     */
    public String getData() {
        return data;
    }

    /**
     * Define a data da edição do Diário Oficial.
     * 
     * @param data a data a ser definida
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Obtém a lista de publicações do Diário Oficial.
     * 
     * @return a lista de publicações
     */
    public ArrayList<Publicacao> getPublicações() {
        return publicações;
    }

    /**
     * Define a lista de publicações do Diário Oficial.
     * 
     * @param publicações a lista a ser definida
     */
    public void setPublicações(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    /**
     * Adiciona uma publicação à lista de publicações do Diário Oficial.
     * 
     * @param publicação publicação a ser adicionada
     */
    public void addPublicação(Publicacao publicação) {
        this.publicações.add(publicação);
    }

    /**
     * Remove uma publicação da lista de publicações do Diário Oficial.
     * 
     * <p>Se a lista estiver vazia, exibe uma mensagem informando que não foi possível deletar.</p>
     * 
     * @param publicação publicação a ser removida
     */
    public void deletePublicação(Publicacao publicação) {
        int arraysize = this.publicações.size();
        if (arraysize == 0) {
            System.out.println("Lista vazia, não foi possivel deletar.");
        } else {
            this.publicações.remove(publicação);
        }
    }

    /**
     * Imprime as informações do Diário Oficial e todas as suas publicações.
     */
    public void imprimirDiario() {
        System.out.println(this.titulo);
        System.out.println(this.data);
        for (Publicacao p : this.getPublicações()) {
            System.out.println("");
            p.imprimirPublicação();
        }
    }
}
