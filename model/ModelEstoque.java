package model;

import java.sql.SQLException;
//import dao.DAOEstoque;
import java.util.ArrayList;

public class ModelEstoque implements CRUD{
    private ArrayList<ModelBrinquedo> itensNoEstoque = new ArrayList<>();
    private int id;
    
    public ModelEstoque() {
    }

    //Com ID
    public ModelEstoque(ArrayList<ModelBrinquedo> itensNoEstoque, int id/*, DAOEstoque dao*/) {
        this.itensNoEstoque = itensNoEstoque;
        this.id = id;
        //this.dao = dao;
    }

    //Sem ID
    public ModelEstoque(ArrayList<ModelBrinquedo> itensNoEstoque) {
        this.itensNoEstoque = itensNoEstoque;
    }

    public ArrayList<ModelBrinquedo> getItensNoEstoque() {
        return this.itensNoEstoque;
    }

    public void setItensNoEstoque(ArrayList<ModelBrinquedo> itensNoEstoque) {
        this.itensNoEstoque = itensNoEstoque;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void exibeListaDeProdutos(){
        //toString logo abaixo
    }

    @Override
    public String toString() {
        return "{" +
            " itensNoEstoque='" + getItensNoEstoque() + "'" +
            "}";
    }

   
    //acesso DAO

    @Override
    public boolean salvar(Object obj) throws SQLException {
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