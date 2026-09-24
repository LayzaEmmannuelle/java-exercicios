package model;

import java.util.ArrayList;
import model.enums.Esfera;

/**
 * Representa um Diário Oficial contendo várias publicações,
 * com informações sobre data, número, título e esfera.
 */
public class DiarioOficial {

    private String titulo;
    private int numero;
    private Esfera esfera;
    private String data;
    private ArrayList<Publicacao> publicações;

    /**
     * Construtor padrão, inicializa título vazio e lista vazia de publicações.
     */
    public DiarioOficial() {
        this.titulo = "";
        this.publicações = new ArrayList<Publicacao>();
    }

    /**
     * Construtor que define apenas o título.
     * 
     * @param titulo título do Diário Oficial
     */
    public DiarioOficial(String titulo) {
        this.titulo = titulo;
        this.publicações = new ArrayList<Publicacao>();
    }

    /**
     * Construtor que inicializa com lista de publicações.
     * 
     * @param publicações lista de publicações do Diário Oficial
     */
    public DiarioOficial(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    /**
     * Construtor completo com todos os atributos principais.
     * 
     * @param data data do Diário Oficial
     * @param numero número do Diário Oficial
     * @param titulo título do Diário Oficial
     * @param esfera esfera do Diário Oficial (Municipal, Estadual, Federal)
     * @param publicações lista de publicações contidas no Diário Oficial
     */
    public DiarioOficial(String data, int numero, String titulo, Esfera esfera, ArrayList<Publicacao> publicações) {
        this.data = data;
        this.numero = numero;
        this.titulo = titulo;
        this.esfera = esfera;
        this.publicações = publicações;
    }

    // Getters e Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Esfera getEsfera() {
        return esfera;
    }

    public void setEsfera(Esfera esfera) {
        this.esfera = esfera;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public ArrayList<Publicacao> getPublicações() {
        return publicações;
    }

    public void setPublicações(ArrayList<Publicacao> publicações) {
        this.publicações = publicações;
    }

    /**
     * Adiciona uma publicação ao Diário Oficial.
     * 
     * @param publicação publicação a ser adicionada
     */
    public void addPublicação(Publicacao publicação) {
        this.publicações.add(publicação);
    }

    /**
     * Remove uma publicação do Diário Oficial.
     * Se a lista estiver vazia, avisa que não é possível remover.
     * 
     * @param publicação publicação a ser removida
     */
    public void deletePublicação(Publicacao publicação) {
        if (this.publicações.isEmpty()) {
            System.out.println("Lista vazia, não foi possível deletar.");
        } else {
            this.publicações.remove(publicação);
        }
    }

    /**
     * Imprime o conteúdo do Diário Oficial, incluindo título, data e todas as publicações.
     */
    public void imprimirDiario() {
        System.out.println(this.titulo);
        System.out.println(this.data);
        for (Publicacao p : this.getPublicações()) {
            System.out.println();
            p.imprimirPublicação();
        }
    }
}
