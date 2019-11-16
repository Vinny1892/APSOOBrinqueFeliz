/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.ModelFuncionario;

/**
 *
 * @author kaio
 */
public class ControllerFuncionario {
    public static ModelFuncionario buscaFuncionario(String user, String password){
        return new ModelFuncionario().logarFuncionario(user, password);
    }
}
