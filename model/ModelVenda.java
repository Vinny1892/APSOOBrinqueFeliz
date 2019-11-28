package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOVenda;
import java.util.List;
import java.util.Date;

public class ModelVenda implements CRUD{
    
    //atributos
    private Double valor;
    private ModelCliente cliente;
    private ModelFuncionario funcionario;
    private Date data_venda;
    private ModelFormaDePagamento FORMA_PAGAMENTO;
    private ModelComprovante comprovante;
    private int id;
    //construtor

    public ModelVenda() {
    }

    //Com ID
    public ModelVenda(Double valor, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, ModelFormaDePagamento FORMA_PAGAMENTO, ModelComprovante comprovante, int id) {
        this.valor = valor;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.FORMA_PAGAMENTO = FORMA_PAGAMENTO;
        this.comprovante = comprovante;
        this.id = id;
    }


    //Sem ID
    public ModelVenda(Double valor, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, ModelFormaDePagamento FORMA_PAGAMENTO, ModelComprovante comprovante) {
        this.valor = valor;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.FORMA_PAGAMENTO = FORMA_PAGAMENTO;
        this.comprovante = comprovante;
    }



    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
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

    public ModelComprovante getComprovante() {
        return this.comprovante;
    }

    public void setComprovante(ModelComprovante comprovante) {
        this.comprovante = comprovante;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    


    public void gerarRelatorioDeVendaPorDia(){

    }

    public void gerarComprovanteVenda(){

    }

    public void concluir(){

    }

    public void inserir(ModelItemDeVenda itemDeVenda){
        //Isso aqui n seria a mesma coisa que setItemDeVEnda?
        //this.itensDeVenda.add(itemDeVenda);
    }
    
    public boolean atualizar(ModelItemDeVenda itemDeVenda){
        return true;
    }

    //acesso DAO
    //private DAOVenda dao = new DAOVenda();

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