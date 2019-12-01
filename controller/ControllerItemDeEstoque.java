/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelItemDeEstoque;
import model.ModelItemDeVenda;

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
        return (ArrayList<ModelItemDeEstoque>) (ArrayList<?>) new ModelItemDeEstoque().getAll();
    }

}
