package repository;

import java.util.ArrayList;
import model.DiarioOficial;

/**
 * Implementação do repositório para gerenciamento de objetos {@link DiarioOficial}.
 * 
 * <p>Esta classe implementa a interface {@link Repository} e provê métodos para salvar, criar,
 * apagar e buscar Diários Oficiais.</p>
 * 
 * <p>Os métodos atuais apenas imprimem mensagens simulando as operações.</p>
 * 
 * @author Roma
 */
public class DiarioOficialRepository implements Repository<DiarioOficial> {

    /**
     * Salva o Diário Oficial.
     * 
     * @param obj objeto Diário Oficial a ser salvo
     */
    @Override
    public void salvar(DiarioOficial obj) {
        System.out.println("O Diário Oficial foi salvo com sucesso!");
    }

    /**
     * Cria um novo Diário Oficial.
     * 
     * @param obj objeto Diário Oficial a ser criado
     */
    @Override
    public void novo(DiarioOficial obj) {
        System.out.println("O Diário Oficial foi criado com sucesso!");
    }

    /**
     * Apaga um Diário Oficial.
     * 
     * @param obj objeto Diário Oficial a ser apagado
     */
    @Override
    public void apagar(DiarioOficial obj) {
        System.out.println("O Diário Oficial foi apagado com sucesso!");
    }

    /**
     * Busca e retorna uma lista de Diários Oficiais.
     * 
     * @return uma lista de Diários Oficiais (atualmente vazia)
     */
    @Override
    public ArrayList<DiarioOficial> buscar() {
        return new ArrayList<DiarioOficial>();
    }
}

