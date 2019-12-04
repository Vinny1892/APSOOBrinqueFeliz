/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelBrinquedo;

/**
 *
 * @author kaio
 */
public class ControllerBrinquedo {
    public static ArrayList<ModelBrinquedo> todosBrinquedos() throws SQLException{
        new ModelBrinquedo().atualizarArrayBrinquedos();
        return new ModelBrinquedo().getAllArray();
    }
    
    public static boolean excluirBrinquedo(ModelBrinquedo brinquedo) throws SQLException{
        return new ModelBrinquedo().deletar(brinquedo.getId());
    }
}
