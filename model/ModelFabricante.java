package model;
//package dao;

import java.sql.SQLException;
//import dao.DAOFabricante;
import java.util.ArrayList;

public class ModelFabricante implements CRUD{
    private String nome;
    //private ArrayList<ModelBrinquedo> brinquedo = new ArrayList<>(); //Consta como produto de acordo com o diagrama
    private int id;

    //Com ID
    public ModelFabricante(String nome, /*ModelBrinquedo brinquedo,*/ int id) {
        this.nome = nome;
       // this.brinquedo = brinquedo;
        this.id = id;
    }

    //Sem ID
    public ModelFabricante(String nome/*, DAOFabricante dao*/) {
        this.nome = nome;
        //this.dao = dao;
    }

    public ModelFabricante() {
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public ModelBrinquedo getBrinquedo() {
//        return this.brinquedo;
//    }
//
//    public void setBrinquedo(ModelBrinquedo brinquedo) {
//        this.brinquedo = brinquedo;
//    }
    //acesso DAO
    //private DAOFabricante dao = new DAOFabricante();

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