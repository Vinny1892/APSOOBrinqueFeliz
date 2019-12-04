/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelFuncionario;

/**
 *
 * @author kaio
 */
public class ControllerFuncionario {
    public static ModelFuncionario buscaFuncionario(String user, String password) throws SQLException{
        return new ModelFuncionario().loginFuncionario(user, password);
    }
    
    
    public static ArrayList<ModelFuncionario> todosFuncionarios() throws SQLException{
        ModelFuncionario f = new ModelFuncionario();
        f.atualizarArrayFuncionario();
        return f.getAllArray(); 
    }
    
    public static boolean excluirFuncionario(ModelFuncionario funcionario) throws SQLException{
        new ModelFuncionario().getAllArray().remove(funcionario);
        return new ModelFuncionario().deletar(funcionario.getId()); 
    }
    
     public static int salvarFuncionario(ModelFuncionario funcionario) throws SQLException{
      return new ModelFuncionario().salvar(funcionario);
     
    }
    
}
