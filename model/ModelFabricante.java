
package model;
//package dao;

import java.sql.SQLException;
//import dao.DAOFabricante;
import java.util.ArrayList;

public class ModelFabricante implements CRUD{
    private String nome;
    //private ArrayList<ModelBrinquedo> brinquedo = new ArrayList<>(); //Consta como produto de acordo com o diagrama
    private int id;
    private String cnpj;
    private static ArrayList<ModelFabricante> fabricantes; 

    //Com ID
    public ModelFabricante(String nome, /*ModelBrinquedo brinquedo,*/  String cnpj, int id) {


        this.nome = nome;
        this.cnpj = cnpj;
       // this.brinquedo = brinquedo;
        this.id = id;
    }

    //Sem ID
    public ModelFabricante(String nome/*, DAOFabricante dao*/) {
        this.nome = nome;
        this.id = -1;
        this.cnpj = cnpj;
        //this.dao = dao;
    }

    public ModelFabricante() {
    }



    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
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
    //Fim Getters e Setters

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

    public void atualizarArrayFabricante() throws SQLException{
        fabricantes = (ArrayList<ModelFabricante>)(ArrayList<?>) new dao.DAOFabricante().getAll(); 

    } 
    
    public ArrayList<ModelFabricante> getFabricante() {
        return fabricantes;
    } 

    public ModelFabricante getByIdArray(int id) throws SQLException  {
        atualizarArrayFabricante();
        //return fabricante.get(fabricante.indexOf(Object.getId() == id));
        // fabricante.forEach(f -> {
        //     if(f.getId() == id)
        //         return f;
        // });
        for(ModelFabricante f : fabricantes){
            if(f.getId() == id)
                return f;
        }     
        return null; 
    } 
    
    public ArrayList<ModelFabricante> getAllArray()  {
        return fabricantes; 
    } 
    

} 

