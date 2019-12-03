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
        return new ModelCategoria().getAllArray();
    
    }
    
}
