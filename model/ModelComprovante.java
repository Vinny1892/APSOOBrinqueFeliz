
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOComprovante;

public class ModelComprovante implements CRUD{
    
    //atributos
    private ModelCliente cliente;
    private ModelFuncionario funcionario;
    private ModelFormaDePagamento formaDePagamento;
    private int id;
    private int idVenda;
    private double valorTotal;

    //construtor

    public ModelComprovante() {
    }

    public ModelComprovante(ModelCliente cliente, ModelFuncionario funcionario, ModelFormaDePagamento formaDePagamento, int id, int idVenda, double valorTotal) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.formaDePagamento = formaDePagamento;
        this.id = id;
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
    }

    public ModelComprovante(ModelCliente cliente, ModelFuncionario funcionario, ModelFormaDePagamento formaDePagamento, int idVenda, double valorTotal) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.formaDePagamento = formaDePagamento;
        this.idVenda = idVenda;
        this.valorTotal = valorTotal;
    }



    
    
    public ModelCliente getCliente() {
        return this.cliente;
    }

    public void setCliente(ModelCliente cliente) {
        this.cliente = cliente;
    }

    public ModelFuncionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(ModelFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public ModelFormaDePagamento getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void setFormaDePagamento(ModelFormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void gerarComprovanteVendaCliente(){
        //como vão funcionar essas funções? não tem o tipo de retorno no diagrama...
    }
    
    //acesso DAO
    //private DAOComprovante dao = new DAOComprovante();

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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

}