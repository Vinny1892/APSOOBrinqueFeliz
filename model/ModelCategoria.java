package model;

import java.sql.SQLException;
import java.util.ArrayList;

import dao.DAOCategoria;
//import dao.DAOCategoria;

public class ModelCategoria implements CRUD{
    private ArrayList<ModelCategoria> categorias;
    private String nome;
    private int id;

    public ModelCategoria() throws SQLException {
        atualizarArrayCategorias();
    }

    //Com ID
    public ModelCategoria(String nome, int id) throws SQLException {
        atualizarArrayCategorias();
        this.nome = nome;
        this.id = id;
    }

    //Sem ID
    public ModelCategoria(String nome) throws SQLException {
        atualizarArrayCategorias();
        this.nome = nome;
    }
    //Fim construtores


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



    //
    public void atualizarArrayCategorias() throws SQLException{
        categorias = (ArrayList<ModelCategoria>)(ArrayList<?>) dao.getAll();
    }
    
    public ArrayList<ModelCategoria> getCategorias() {
        return categorias;
    }
    
    public ModelCategoria getByIdArray(int id)  {
        atualizarArrayCategorias();
        
        //return categorias.get(categorias.indexOf(Object.getId() == id));
        categorias.forEach(c -> {
            if(c.getId() == id)
                return c;
        });
    }
    
    public ArrayList<ModelCategoria> getAllArray()  {
        return categorias;
    }
  

    //acesso DAO
    private DAOCategoria dao = new DAOCategoria();

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
