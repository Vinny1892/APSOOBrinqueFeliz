/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelFornecedor;

/**
 *
 * @author kaio
 */
public class ControllerFornecedor {
    public static ArrayList<ModelFornecedor> todosFornecedores(){
        return /*new ModelFornecedor().getAllArray()*/ null;
    }
    
    public static int salvar(ModelFornecedor forncedor) throws SQLException{
        new ModelFornecedor().salvarNoArrayList(forncedor);
        return new ModelFornecedor().salvar(forncedor);
    }
    
    public static boolean editar(ModelFornecedor forncedor) throws SQLException{
        return new ModelFornecedor().atualizar(forncedor);
    }
    
}
