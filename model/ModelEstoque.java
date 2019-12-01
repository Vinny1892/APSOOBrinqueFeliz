package model;

import java.sql.SQLException;
import dao.DAOItemDeEstoque;
import java.util.ArrayList;

public class ModelEstoque implements CRUD {

/*
    Kaio: acho que nao precisamos dessa classe ModelEstoque, 
    precisamos só da ModelItemDeEstoque
    
    */
    private String local;

    public ModelEstoque() throws SQLException {
    }

    public ModelEstoque(String local) throws SQLException {
        this.local = local;
    }

    
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    // @Override
    // public String toString() {
    //     return "{" +
    //         " local='" + getItensNoEstoque() + "'" +
    //         "}";
    // }
    //acesso DAO
    @Override
    public int salvar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
