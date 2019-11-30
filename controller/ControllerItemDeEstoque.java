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
    
    
    public static boolean atualizarItensNoEstoque(ArrayList<ModelItemDeVenda> carrinho) throws SQLException{
        boolean deuCerto = false;
        for (ModelItemDeVenda itemComprado : carrinho) {
            ModelItemDeEstoque produto = new ModelItemDeEstoque(itemComprado.getBrinquedo(), itemComprado.getQuantidade(), itemComprado.getId());
            deuCerto = new ModelItemDeEstoque().atualizar(produto);
        }
        new ModelItemDeEstoque().atualizarArrayListItensNoEstoque();
        return deuCerto;
    }
    
    public static ArrayList<ModelItemDeEstoque> todosItensDeEstoque() throws SQLException{
        return (ArrayList<ModelItemDeEstoque>) (ArrayList<?>) new ModelItemDeEstoque().getAll();
    }
    
}
