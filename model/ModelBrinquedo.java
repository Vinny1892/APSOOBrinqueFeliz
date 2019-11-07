package model;

import java.sql.SQLException;
import dao.DAOBrinquedo;
import java.util.List;

public class ModelBrinquedo implements CRUD{
    
    //atributos
    private Categoria categoria;
    private String nome;
    private long codigoDeBarras;
    private Double preco;
    private Fabricante fabricante;
    private String descricao;
    private Fornecedor fornecedor;
    //construtor

    public ModelBrinquedo() {
    }

    //getter
    public Categoria getCategoria(){
        return this.categoria;
    }

    public String nome getNome(){
        return this.nome;
    }

    public long getCodigoDeBarras(){
        return this.codigoDeBarras;
    }

    public Double getPreco(){
        return this.preco;
    }

    public Fabricante getFabricante(){
        return this.fabricante;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public Fornecedor getFornecedor(){
        return this.fornecedor;
    }

    //setter
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCodigoDeBarras(long codBar){
        this.codigoDeBarras = codBar;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setFornecedor(Fornecedor fornecedor){
        this.fornecedor = fornecedor;
    }


    

    public void excluirCategoria(){
        //this.categoria = null;
    }

    public void atualizarCategoria(){
        //n seria a mesma coisa que setCategoria?
    }

    public void criar(Object obj){
        
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