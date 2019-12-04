package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelBrinquedo;
import model.ModelComprovante;

/**
 *
 * @author kaio
 */
public class ControllerComprovante {
    
    public static boolean salvar(ModelComprovante comprovante) throws SQLException{
        new ModelComprovante().salvar(comprovante);
        return false;
    }
    
    public static ModelComprovante getById(int id){
        return null;
    }
    
    public static ModelComprovante getByIdVenda(int idVenda){
        return null;
    }
    
    
    public static boolean remover(ModelComprovante comprovante) throws SQLException{
        return new ModelComprovante().deletar(comprovante.getId());
    }
    
    public static ArrayList<ModelComprovante> todosComprovantes(){
        return new ModelComprovante().getcomprovantes();
    }
}
