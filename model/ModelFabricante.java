
package model;
//package dao;

import java.sql.SQLException;
//import dao.DAOFabricante;
import java.util.ArrayList;

public class ModelFabricante implements CRUD{
    private String nome;
    //private ArrayList<ModelBrinquedo> brinquedo = new ArrayList<>(); //Consta como produto de acordo com o diagrama
    private int id;
    private ArrayList<ModelFabricante> fabricante;

    //Com ID
    public ModelFabricante(String nome, /*ModelBrinquedo brinquedo,*/ int id) {
        this.nome = nome;
       // this.brinquedo = brinquedo;
        this.id = id;
    }

    //Sem ID
    public ModelFabricante(String nome/*, DAOFabricante dao*/) {
        this.nome = nome;
        this.id = -1;
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


    //
    public void atualizarArrayFabricante() throws SQLException{
        fabricante = (ArrayList<ModelFabricante>)(ArrayList<?>) dao.getAll();
    }
    
    public ArrayList<ModelFabricante> getFabricante() {
        return fabricante;
    }
    
    public ModelFabricante getByIdArray(int id)  {
        atualizarArrayFabricante();

        //return fabricante.get(fabricante.indexOf(Object.getId() == id));
        // fabricante.forEach(f -> {
        //     if(f.getId() == id)
        //         return f;
        // });
        for(ModelFabricante f : fabricante){
            if(f.getId() == id)
                return f;
        }
    }
    public ArrayList<ModelFabricante> getAllArray()  {
        return fabricante;
    } 

}