package model;

import java.sql.SQLException;
import dao.DAOBrinquedo;
import java.util.ArrayList;
import java.util.List;

public class ModelBrinquedo implements CRUD{
    
    //atributos
    private ModelCategoria categoria;
    private String nome;
    private long codigoDeBarras;
    private Double preco;
    private ModelFabricante fabricante;
    private String descricao;
    private ModelFornecedor fornecedor;
    private int id;
    //construtor

    public ModelBrinquedo() {
    }

    public ModelBrinquedo(ModelCategoria categoria, String nome, long codigoDeBarras, Double preco, ModelFabricante fabricante, String descricao, ModelFornecedor fornecedor, int id) {
        this.categoria = categoria;
        this.nome = nome;
        this.codigoDeBarras = codigoDeBarras;
        this.preco = preco;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.id = id;
    }

    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelCategoria getCategoria() {
        return this.categoria;
    }

    public void setCategoria(ModelCategoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigoDeBarras() {
        return this.codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Double getPreco() {
        return this.preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ModelFabricante getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(ModelFabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ModelFornecedor getFornecedor() {
        return this.fornecedor;
    }

    public void setFornecedor(ModelFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }


    

    // public void excluirCategoria(){
    //     //this.categoria = null;
    // }

    // public void atualizarCategoria(){
    //     //n seria a mesma coisa que setCategoria?
    // }

    // public void criar(Object obj){
        
    // }



    //acesso DAO
    private DAOBrinquedo dao = new DAOBrinquedo();
    @Override
    public void salvar() throws SQLException {
        dao.salvar(this);
    }

    @Override
    public void atualizar() throws SQLException {
        dao.atualizar(this);
    }

    @Override
    public void deletar() throws SQLException {
        dao.deletar(this.id);
    }

    @Override
    public Object getById(int id) throws SQLException {
        dao.getById(id);
    }//retorna ArrayList<Object>  

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    @Override
    public ArrayList<Object> getAll() throws SQLException {
        dao.getAll();
    }// pega tudo de uma tabela

}