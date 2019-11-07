package model;

import java.sql.SQLException;
import dao.DAOVenda;
import java.util.List;

public class ModelVenda implements CRUD{
    
    //atributos
    private List<ModelItemDeVenda> itensDeVenda;
    private Double valor;
    private String relatorioDeProdutosVendidos;
    private FormaDePagamento formaDePagamento;
    private Comprovante comprovante;
    //construtor

    public ModelVenda() {
    }

    // public ModelVenda(List<ModelItemDeVenda> itemDeVenda, Double valor, String relatorioDeProdutosVendidos, FormaDePagamento formaDePagamento, Comprovante comprovante) {
    //     this.itensDeVenda.add(itemDeVenda);
    //     //this.valor = valor; o valor no caso teria que ser calculado iterando a lista de itens de venda certo?
           //talves reconsiderar esse construtor
    // }

    //getter
    public List getItensDeVenda(){
        return this.itensDeVenda;
    }

    public Double getValor(){
        return this.valor;
    }

    public String getRelatorioDeProdutosVendidos(){
        return this.relatorioDeProdutosVendidos;
    }

    public FormaDePagamento getFormaDePagamento(){
        return this.formaDePagamento;
    }

    public Comprovante getComprovante(){
        return this.comprovante;
    }

    //setter
    public void setItensDeVenda(ModelItemDeVenda item){
        this.itensDeVenda.add(item);
    }

    public void setValor(Double valor){
        this.valor = valor;
    }

    public void setRelatorioDeProdutosVendidos(String report){
        this.relatorioDeProdutosVendidos = report;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento){
        this.formaDePagamento = formaDePagamento;
    }

    public void setComprovante(Comprovante comprovante){
        this.comprovante = comprovante;
    }



    public void gerarRelatorioDeVendaPorDia(){

    }

    public void gerarComprovanteVenda(){

    }

    public void venderBrinquedo(){

    }

    /*public void inserir(ItemDeVenda item){
        //Isso aqui n seria a mesma coisa que setItemDeVEnda?
    }*/
    

    @Override
    public void atualizar(ItemDeVenda item){

    }

    public Object buscar(Object obj){

    }

    public void excluir(Object obj){
        
    }





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