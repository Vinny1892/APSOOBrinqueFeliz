
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOVenda;
import java.util.Date;

public class ModelVenda implements CRUD{
    
    //atributos
    private Double valorTotal;
    private ModelCliente cliente;
    private ModelFuncionario funcionario;
    private Date data_venda;
    private ModelFormaDePagamento FORMA_PAGAMENTO;
    private int id;
    private ArrayList<ModelItemDeVenda> carrinho;
    
    //construtor

    public ModelVenda() {
    }

    public ModelVenda(Double valor, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, ModelFormaDePagamento FORMA_PAGAMENTO, int id, ArrayList<ModelItemDeVenda> carrinho) {
        this.valorTotal = valor;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.FORMA_PAGAMENTO = FORMA_PAGAMENTO;
        this.id = id;
        this.carrinho = carrinho;
    }

    public ModelVenda(Double valor, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, ModelFormaDePagamento FORMA_PAGAMENTO, ArrayList<ModelItemDeVenda> carrinho) {
        this.valorTotal = valor;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.FORMA_PAGAMENTO = FORMA_PAGAMENTO;
        this.carrinho = carrinho;
    }




    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valor) {
        this.valorTotal = valor;
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

    public Date getData_venda() {
        return this.data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public ModelFormaDePagamento getFORMA_PAGAMENTO() {
        return this.FORMA_PAGAMENTO;
    }

    public void setFORMA_PAGAMENTO(ModelFormaDePagamento FORMA_PAGAMENTO) {
        this.FORMA_PAGAMENTO = FORMA_PAGAMENTO;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
    

}