package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelCliente;

/**
 *
 * @author kaio
 */
public class ControllerCliente {
    
    public static ArrayList<ModelCliente> todosClientes() throws SQLException{
        return (ArrayList<ModelCliente>)(ArrayList<?>) new ModelCliente().getAll();
    }
}
