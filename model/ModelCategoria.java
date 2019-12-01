
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOCategoria;

public class ModelCategoria implements CRUD{
    private String nome;
    private int id;

    public ModelCategoria() {
    }

    //Com ID
    public ModelCategoria(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    //Sem ID
    public ModelCategoria(String nome) {
        this.nome = nome;
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


    public void gerarRelatioDeProdutos(){

    }
    //acesso DAO
    //private DAOCategoria dao = new DAOCategoria();

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