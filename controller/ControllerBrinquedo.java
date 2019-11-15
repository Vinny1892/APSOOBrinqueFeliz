/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.ArrayList;
import java.util.List;
import model.ModelBrinquedo;

/**
 *
 * @author kaio
 */
public class ControllerBrinquedo {
    
    public static ArrayList<ModelBrinquedo> todosBrinquedos(){
        ArrayList<ModelBrinquedo> brinquedos = new ModelBrinquedo().getAll();
    
    
        return brinquedos;
    }
}
