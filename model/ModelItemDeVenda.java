package model;

import java.sql.SQLException;
import dao.DAOItemDeVenda;
import java.util.List;

public class ModelItemDeVenda implements CRUD{
    
    //atributos
    private Brinquedo produto;
    private int quantidade;
    
    //construtor

    public ModelItemDeVenda() {
    }

    public ModelItemDeVenda(Brinquedo produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    //getter
    public Brinquedo getProduto(){
        return this.produto;
    }

    public int getQuantidade(){
        return this.quantidade;
    }

    //setter
    public void setProduto(Brinquedo produto){
        this.produto = produto;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public double getValor(){
        //aqui seria o valor de um brinquedo só? de vários?
    }

    //acesso DAO
    @Override
    public void salvar() throws SQLException {
        DAOItemDeVenda.salvar(this);
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