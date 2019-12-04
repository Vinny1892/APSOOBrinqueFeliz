/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Wenderson Souza
 */
public class TestaModelFuncionario { 
    
    public static void main(String args[]) throws SQLException { 
        
        System.out.println("Teste Model Funcionario \n\n "); 
        
        ModelFuncionario funcionario = new ModelFuncionario(); 
        
        funcionario.atualizarArrayFuncionario(); 
        
        for(ModelFuncionario funcionarioAux : funcionario.getAllArray()) 
            System.out.println(funcionarioAux.getEmail()); 
        
        //*******************************************************************
        
        System.out.println("Teste Model Categoria"); 
        
        ModelCategoria categoria = new ModelCategoria("elegdgdfgdgf"); 
        
        // categoria.salvar(categoria); 
        
        categoria.atualizarArrayCategorias(); 
        
        // for(ModelCategoria categoriaAux : new ModelCategoria().getAllArray()) 
           //  System.out.println(categoriaAux.getNome("d"))); 
        
        System.out.println("Teste Model Brinquedo \n\n "); 
        
        ModelBrinquedo brinquedo = new ModelBrinquedo(new ModelCategoria("fkhkhkg", 2), "dfgh", new Double(20.0), new ModelFabricante("dddfddffg", "dgddgfhhg", 1), "fgjhgkk", new ModelFornecedor("dgdfdggfgfhhg", "fdhffhfhfh", "gfhhh", "rdfgju", "dfsdgfdggj", "gdfgj", "ffdgggj", "gjfdhhhk", 1)); 
        
        brinquedo.salvar(brinquedo); 
        
        brinquedo.atualizarArrayBrinquedos(); 
        
        for(ModelBrinquedo brinquedoAux : brinquedo.getAllArray()) 
            System.out.println(brinquedo.getCategoria().getNome()); 
        
        
        System.out.println("Teste Model Cliente \n\n "); 
        
        ModelCliente cliente = new ModelCliente("dgffgdg", "sddgfdgdf", "dgdfggfggf", "fdffdgdh", "dffdgggdhf", "fdfgdgfh", new Date(2000/10/30), "hgffdgghj"); 
        
        // cliente.salvar(cliente); 
        
        cliente.atualizarArrayCliente(); 
        
        for(ModelCliente clienteAux : cliente.getAllArray()) 
            System.out.println(clienteAux.getCpf()); 
        
        System.out.println("Teste Model Fabricante \n\n "); 
        
        ModelFabricante fabricante = new ModelFabricante("dddfddffg", "dgddgfhhg"); 
        
        // fabricante.salvar(fabricante); 
        
        
        
        System.out.println("Teste Model Fornecedor"); 
        
        ModelFornecedor fornecedor = new ModelFornecedor("dgdfdggfgfhhg", "fdhffhfhfh", "gfhhh", "rdfgju", "dfsdgfdggj", "gdfgj", "ffdgggj", "gjfdhhhk"); 
        
        // fornecedor.salvar(fornecedor); 
        
        System.out.println("Teste Model Funcionario"); 
        
        ModelFuncionario funcionarioAux = new ModelFuncionario("ddffh", "dfdfffh", "dfdssddfffh", new Date(2000/02/30), true, "fdsffj", "fhdfj", "gkhsdfdkjl", new Date(2000/02/30), "gfdgk", "fgdsfhk", "fgdsdfsdfjk", "fjfjsdfsjk"); 
        
        // funcionarioAux.salvar(funcionarioAux); 
        
        System.out.println("Teste Model Item De Estoque"); 
        
        ModelItemDeEstoque itemDeEstoque = new ModelItemDeEstoque(brinquedo, 2); 
        
        itemDeEstoque.salvar(itemDeEstoque); 
        
        
        
        
    } 
    
    
    
}
