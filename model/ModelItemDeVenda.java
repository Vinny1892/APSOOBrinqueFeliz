
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOItemDeVenda;

public class ModelItemDeVenda implements CRUD{
    
    //Kaio: Acho que nao faz sentido essa classe ter o atributo static ArrayList<ModelItemDeVenda>, se tiver outra opinião, avise pf, vai que estou errado.
    private ModelBrinquedo brinquedo;
    private int quantidade;
    private int idBrinquedo;

    public ModelItemDeVenda() {
    }

    public ModelItemDeVenda(ModelBrinquedo brinquedo, int quantidade) {
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
    }

    public ModelBrinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(ModelBrinquedo produto) {
        this.brinquedo = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.idBrinquedo;
    }

    public void setId(int id) {
        this.idBrinquedo = id;
    }

    public double getValor(){
        return getQuantidade() * getBrinquedo().getPreco();
    }

    //acesso DAO
    //private DAOItemDeVenda dao = new DAOItemDeVenda();

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