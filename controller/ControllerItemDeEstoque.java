/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelItemDeEstoque;

/**
 *
 * @author kaio
 */
public class ControllerItemDeEstoque {

    public static boolean atualizarItensNoEstoque(ArrayList<ModelItemDeEstoque> itensComprado) throws SQLException {
        for (ModelItemDeEstoque itemComprado : itensComprado) {
            new ModelItemDeEstoque().atualizar(itemComprado);
        }
        new ModelItemDeEstoque().atualizarArrayListItensNoEstoque();
        return true;
    }

    public static ArrayList<ModelItemDeEstoque> todosItensDeEstoque() throws SQLException {
        return new ModelItemDeEstoque().getAllArray();
    }

    public static boolean excluirItemNoEstoque(ModelItemDeEstoque estoque) throws SQLException {
        new ModelItemDeEstoque().getAllArray().remove(estoque);
        return new ModelItemDeEstoque().deletar(estoque.getId());
    }

    public static boolean atualizarItemNoEstoque(ModelItemDeEstoque item, int qtd) throws SQLException {
        item.setQuantidade(qtd);
        return new ModelItemDeEstoque().atualizar(item);
    }

}
