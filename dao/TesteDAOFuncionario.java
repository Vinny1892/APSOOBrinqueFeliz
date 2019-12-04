/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import controller.ControllerFuncionario;
import helpers.DateHelper;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.ModelCategoria;
import model.ModelFuncionario;

/**
 *
 * @author Wenderson Souza
 */
public class TesteDAOFuncionario { 
    
    public static void main(String args[]) { 
        
        DAOCategoria daoCategoria = new DAOCategoria(); 
        // DAOFabricante daoFabricante = new DAOFabricante(); 
        // DAOFornecedor daoFornecedor = new DAOFornecedor(); 
        // DAOBrinquedo daoBrinquedo = new DAOBrinquedo(); 
        // DAOItemDeEstoque daoItemDeEstoque = new DAOItemDeEstoque(); 
        // DAOItemDeVenda daoItemDeVenda = new DAOItemDeVenda(); 
        DAOFuncionario daoFuncionario = new DAOFuncionario(); 
        // DAOCliente daoCliente = new DAOCliente(); 
        // DAOVenda daoVenda = new DAOVenda(); 
        
  
            // daoCategoria.salvar(new ModelCategoria("eletronico")); 
            
          //  daoFuncionario.salvar(new ModelFuncionario("31243549541", "354346", "fudedfdfdggdssg@gmail.com", DateHelper.toDate("27/2806"), false, "354346", "funcionario ", "3543535435450", DateHelper.toDate("23/12/2019"), "dgg", "fhfghj", "fhfgh", "fghghj")); 
            
            System.out.println(daoFuncionario.getByEmail("fudedfdfdggdssg@gmail.com", "354346").getEmail()); 
            
//            ControllerFuncionario.buscaFuncionario("fudedfdfdggdssg@gmail.com", "354346"); 
            
            System.out.println("Funcionario cadastrado com sucseds"); 
            
            
      
      
        
    }
    
}
