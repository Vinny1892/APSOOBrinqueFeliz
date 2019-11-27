package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOItemDeVenda;

public class ModelItemDeVenda implements CRUD{
    
    //atributos
    private ModelBrinquedo produto;
    private int quantidade;
    private int id;
    
    //construtor

    public ModelItemDeVenda() {
    }

    //Com ID
    public ModelItemDeVenda(ModelBrinquedo produto, int quantidade, int id) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.id = id;
    }

    //Sem ID
    public ModelItemDeVenda(ModelBrinquedo produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public ModelBrinquedo getProduto() {
        return this.produto;
    }

    public void setProduto(ModelBrinquedo produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSubValor(){
        return 0.0;
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