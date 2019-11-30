/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelFormaDePagamento;

/**
 *
 * @author kaio
 */
public class ControllerVenda {
//    public static  (){
//    
//    }
    
    
    public static ArrayList<ModelFormaDePagamento> formasDePagamento() throws SQLException{
        ArrayList<ModelFormaDePagamento> formas = new ArrayList<>();
        return (ArrayList<ModelFormaDePagamento>) (ArrayList<?>) new ModelFormaDePagamento().getAll();
    }
}
