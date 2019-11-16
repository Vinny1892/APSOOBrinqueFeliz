package controller;

import model.ModelFuncionario;
/**
 *
 * @author kaio
 */
public class ControllerLogin {
    
    public static ModelFuncionario buscaFuncionario(String user, String password){
        return new ModelFuncionario().logarFuncionario();
    }
}
