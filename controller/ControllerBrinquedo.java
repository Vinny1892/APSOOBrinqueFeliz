/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelBrinquedo;
import model.ModelCliente;

/**
 *
 * @author kaio
 */
public class ControllerBrinquedo {
    public static ArrayList<ModelCliente> todosBrinquedos() throws SQLException{
        return (ArrayList<ModelCliente>)(ArrayList<?>) new ModelBrinquedo().getAll();
    }
}
