package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelFabricante;

/**
 *
 * @author kaio
 */
public class ControllerFabricante {

    public static boolean salvar(String nome) throws SQLException{
        return true;
    }
    
    public static ArrayList<ModelFabricante> todosFabricantes() throws SQLException{
        new ModelFabricante().atualizarArrayFabricante();
        return new ModelFabricante().getAllArray();
    } 
    
}
