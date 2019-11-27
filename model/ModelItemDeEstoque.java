package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOItemDeEstoque;
import java.util.Date;

public class ModelItemDeEstoque implements CRUD{
    private ModelBrinquedo brinquedo;
    private Date dataDeAquisicao;
    private int quantidade;
    private int id;


    public ModelItemDeEstoque() {
    }

    //Com ID
    public ModelItemDeEstoque(ModelBrinquedo brinquedo, Date dataDeAquisicao, int quantidade, int id) {
        this.brinquedo = brinquedo;
        this.dataDeAquisicao = dataDeAquisicao;
        this.quantidade = quantidade;
        this.id = id;
    }

    //Sem ID
    public ModelItemDeEstoque(ModelBrinquedo brinquedo, Date dataDeAquisicao, int quantidade) {
        this.brinquedo = brinquedo;
        this.dataDeAquisicao = dataDeAquisicao;
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelBrinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(ModelBrinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public Date getDataDeAquisicao() {
        return this.dataDeAquisicao;
    }

    public void setDataDeAquisicao(Date dataDeAquisicao) {
        this.dataDeAquisicao = dataDeAquisicao;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }


    //acesso DAO
    //private DAOItemDeEstoque dao = new DAOItemDeEstoque();

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