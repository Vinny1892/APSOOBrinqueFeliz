package controller;

import java.sql.SQLException;
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
}
