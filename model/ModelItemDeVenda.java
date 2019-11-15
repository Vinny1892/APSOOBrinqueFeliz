package model;

import java.sql.SQLException;
import dao.DAOItemDeVenda;

public class ModelItemDeVenda implements CRUD{
    
    //atributos
    private ModelBrinquedo produto;
    private int quantidade;
    private int id;
    
    //construtor

    public ModelItemDeVenda() {
    }


    public ModelItemDeVenda(ModelBrinquedo produto, int quantidade, int id) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.id = id;
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



    public double getValor(){
        //produto.getPreco() ???
    }

    //acesso DAO
    private DAOItemDeVenda dao = new DAOItemDeVenda();
    @Override
    public void salvar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
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