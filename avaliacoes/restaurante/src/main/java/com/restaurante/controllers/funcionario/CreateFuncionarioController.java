package com.restaurante.controllers.funcionario;

import com.restaurante.dao.FuncionarioDAO;
import com.restaurante.model.Funcionario;
import com.restaurante.view.FuncionarioView;

public class CreateFuncionarioController {
    private FuncionarioView view = new FuncionarioView();
    private FuncionarioDAO dao = new FuncionarioDAO();

    public void executar() {
        Funcionario f = view.capturarFuncionario();
        dao.salvar(f);
        view.mostrarMensagem("Funcionário cadastrado com sucesso!");
    }
}
