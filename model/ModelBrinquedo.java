package model;

import java.sql.SQLException;
import dao.DAOBrinquedo;
import java.util.ArrayList;

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

    



    //acesso DAO
    private DAOBrinquedo dao = new DAOBrinquedo();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(long codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ModelFabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(ModelFabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ModelFornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(ModelFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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