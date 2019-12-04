package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelFornecedor;

/**
 *
 * @author kaio
 */
public class ControllerCliente {
    
    public static ArrayList<ModelCliente> todosClientes() throws SQLException{
        return (ArrayList<ModelCliente>)(ArrayList<?>) new ModelCliente().getAll();
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
