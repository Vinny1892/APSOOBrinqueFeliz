package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOVenda;
import java.util.List;

public class ModelVenda implements CRUD{
    
    //atributos
    private List<ModelItemDeVenda> itensDeVenda;
    private Double valor;
    private String relatorioDeProdutosVendidos;
    private ModelFormaDePagamento formaDePagamento;
    private ModelComprovante comprovante;
    private int id;
    //construtor

    public ModelVenda() {
    }

    //Com ID
    public ModelVenda(List<ModelItemDeVenda> itensDeVenda, Double valor, String relatorioDeProdutosVendidos, ModelFormaDePagamento formaDePagamento, ModelComprovante comprovante, int id/*, DAOBrinquedo dao*/) {
        this.itensDeVenda = itensDeVenda;
        this.valor = valor;
        this.relatorioDeProdutosVendidos = relatorioDeProdutosVendidos;
        this.formaDePagamento = formaDePagamento;
        this.comprovante = comprovante;
        this.id = id;
        //this.dao = dao;
    }

    //Sem ID
    public ModelVenda(List<ModelItemDeVenda> itensDeVenda, Double valor, String relatorioDeProdutosVendidos, ModelFormaDePagamento formaDePagamento, ModelComprovante comprovante) {
        this.itensDeVenda = itensDeVenda;
        this.valor = valor;
        this.relatorioDeProdutosVendidos = relatorioDeProdutosVendidos;
        this.formaDePagamento = formaDePagamento;
        this.comprovante = comprovante;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<ModelItemDeVenda> getItensDeVenda() {
        return this.itensDeVenda;
    }

    public void setItensDeVenda(List<ModelItemDeVenda> itensDeVenda) {
        this.itensDeVenda = itensDeVenda;
    }

    public Double getValor() {
        return this.valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getRelatorioDeProdutosVendidos() {
        return this.relatorioDeProdutosVendidos;
    }

    public void setRelatorioDeProdutosVendidos(String relatorioDeProdutosVendidos) {
        this.relatorioDeProdutosVendidos = relatorioDeProdutosVendidos;
    }

    public ModelFormaDePagamento getFormaDePagamento() {
        return this.formaDePagamento;
    }

    public void setFormaDePagamento(ModelFormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public ModelComprovante getComprovante() {
        return this.comprovante;
    }

    public void setComprovante(ModelComprovante comprovante) {
        this.comprovante = comprovante;
    }
    


    public void gerarRelatorioDeVendaPorDia(){

    }

    public void gerarComprovanteVenda(){

    }

    public void venderBrinquedo(){

    }

    public void inserir(ModelItemDeVenda item){
        //Isso aqui n seria a mesma coisa que setItemDeVEnda?
        this.itensDeVenda.add(item);
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