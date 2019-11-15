package model;

import java.sql.SQLException;
import dao.DAOEstoque;
import java.util.List;
import java.util.ArrayList;

public class ModelEstoque implements CRUD{
    
    //atributos
    private List<ModelBrinquedo> itensNoEstoque = new ArrayList<>();
    private int id;
    
    //construtor

    public ModelEstoque() {
    }

    public ModelEstoque(List<ModelBrinquedo> itensNoEstoque, int id, DAOEstoque dao) {
        this.itensNoEstoque = itensNoEstoque;
        this.id = id;
        this.dao = dao;
    }


    public List<ModelBrinquedo> getItensNoEstoque() {
        return this.itensNoEstoque;
    }

    public void setItensNoEstoque(List<ModelBrinquedo> itensNoEstoque) {
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

    public void criar(Object obj){
        //????
    }

    public List buscarBrinquedo(Categoria categoria){
        //buscar todos os brinquedos da categoria X?
    }
    
    //acesso DAO
    private DAOEstoque dao = new DAOEstoque();
    @Override
    public void salvar() throws SQLException {
        dao.salvar(this);
    }

    @Override
    public List<Object> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}