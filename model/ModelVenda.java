
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOVenda;
import java.util.Date;

public class ModelVenda implements CRUD{
    
    private int id;
    private ModelCliente cliente;
    private ModelFuncionario funcionario;
    private Date data_venda;
    private String forma;
    private Double valorTotal;
    private ArrayList<ModelItemDeVenda> carrinho;
    
    public ModelVenda() {
    }

    public ModelVenda(ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, String forma, Double valorTotal, ArrayList<ModelItemDeVenda> carrinho) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.forma = forma;
        this.valorTotal = valorTotal;
        this.carrinho = carrinho;
    }

    public ModelVenda(int id, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, String forma, Double valorTotal, ArrayList<ModelItemDeVenda> carrinho) {
        this.id = id;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.forma = forma;
        this.valorTotal = valorTotal;
        this.carrinho = carrinho;
    }

    
    
    


    



    //acesso DAO
    //private DAOVenda dao = new DAOVenda();

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelCliente getCliente() {
        return cliente;
    }

    public void setCliente(ModelCliente cliente) {
        this.cliente = cliente;
    }

    public ModelFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ModelFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList<ModelItemDeVenda> getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(ArrayList<ModelItemDeVenda> carrinho) {
        this.carrinho = carrinho;
    }
    

}