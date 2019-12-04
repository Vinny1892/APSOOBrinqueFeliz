/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelCategoria;
import model.ModelCliente;

/**
 *
 * @author kaio
 */
public class ControllerCategoria {
    
    public static ArrayList<ModelCategoria> todasCategorias() throws SQLException{
        new ModelCategoria().atualizarArrayCategorias();
        return new ModelCategoria().getAllArray();
    }
    
    public static int salvar(ModelCategoria categoria) throws SQLException{
        new ModelCategoria().getCategorias().add(categoria);
        return new ModelCategoria().salvar(categoria); 
    }

    public static int editar(ModelCategoria categoria) throws SQLException{
        int index = new ModelCategoria().getCategorias().indexOf(categoria);
        new ModelCategoria().getCategorias().add(0, categoria);
        return new ModelCategoria().salvar(categoria);
    }
    
    
    public static boolean remover(ModelCategoria categoria) throws SQLException{
        new ModelCategoria().getCategorias().remove(categoria);
        return new ModelCategoria().deletar(categoria.getId());
    }
 
            
}
