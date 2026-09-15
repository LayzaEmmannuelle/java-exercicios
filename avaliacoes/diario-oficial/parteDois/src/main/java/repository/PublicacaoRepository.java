package repository;

import java.util.ArrayList;
import model.Publicacao;

/**
 * Implementação do repositório para gerenciamento de objetos {@link Publicacao}.
 * 
 * <p>Esta classe implementa a interface {@link Repository} e provê métodos para salvar, criar,
 * apagar e buscar publicações.</p>
 * 
 * <p>Os métodos atualmente apenas imprimem mensagens simulando as operações.</p>
 * 
 * @author Roma
 */
public class PublicacaoRepository implements Repository<Publicacao> {

    /**
     * Salva a publicação.
     * 
     * @param obj objeto publicação a ser salvo
     */
    @Override
    public void salvar(Publicacao obj) {
        System.out.println("O Diário Oficial foi Registrado com Sucesso.");
    }

    /**
     * Cria uma nova publicação.
     * 
     * @param obj objeto publicação a ser criado
     */
    @Override
    public void novo(Publicacao obj) {
        System.out.println("O Diário Oficial foi Criado com Sucesso.");
    }

    /**
     * Apaga uma publicação.
     * 
     * @param obj objeto publicação a ser apagado
     */
    @Override
    public void apagar(Publicacao obj) {
        System.out.println("O Diário Oficial foi Apagado com Sucesso.");
    }

    /**
     * Busca e retorna uma lista de publicações.
     * 
     * @return uma lista de publicações (atualmente vazia)
     */
    @Override
    public ArrayList<Publicacao> buscar() {
        return new ArrayList<Publicacao>();
    }
}
