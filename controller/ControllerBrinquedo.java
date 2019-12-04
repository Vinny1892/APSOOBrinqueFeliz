/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelBrinquedo;
import model.ModelFornecedor;

/**
 *
 * @author kaio
 */
public class ControllerBrinquedo {
    public static ArrayList<ModelBrinquedo> todosBrinquedos() throws SQLException{
        new ModelBrinquedo().atualizarArrayBrinquedos();
        return new ModelBrinquedo().getAllArray();
    }
    
    public static int salvar(ModelFornecedor forncedor) throws SQLException{
        new ModelFornecedor().salvarNoArrayList(forncedor);
        return new ModelFornecedor().salvar(forncedor);
    }
    
    public static boolean editar(ModelFornecedor forncedor) throws SQLException{
        return new ModelFornecedor().atualizar(forncedor);
    }
    
    public static boolean excluir(ModelFornecedor fornecedor) throws SQLException{
        return new ModelFornecedor().deletar(fornecedor.getId());
    } 
    
}
