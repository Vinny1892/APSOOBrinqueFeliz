package model;

import java.sql.SQLException;
import dao.DAOComprovante;

public class ModelComprovante implements CRUD{
    
    //atributos
    private Cliente cliente;
    private Funcionario funcionario;
    private FormaDePagamento formaDePagamento;
    private Venda venda;
    //construtor

    public ModelComprovante() {
    }


    public ModelComprovante(Cliente cliente, Funcionario funcionario, FormaDePagamento formaDePagamento, Venda venda) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.formaDePagamento = formaDePagamento;
        this.venda = venda;
    }


    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return this.funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public FormaDePagamento getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Venda getVenda() {
        return this.venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }



    public void gerarComprovanteVendaCliente(){

    }

    /*public void inserir(ItemDeVenda item){
        //Isso aqui n seria a mesma coisa que setItemDeVEnda?
    }*/
    

    // @Override
    // public void atualizar(ItemDeVenda item){

    // }

    // public Object buscar(Object obj){

    // }

    // public void excluir(Object obj){
        
    // }





    //acesso DAO
    @Override
    public void salvar() throws SQLException {
        daoEstoque.salvar(this);
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