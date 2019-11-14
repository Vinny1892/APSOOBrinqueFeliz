package model;

import java.sql.SQLException;
import dao.DAOItemDeEstoque;

public class ModelItemDeEstoque{
    private ModelBrinquedo brinquedo;
    private Date dataDeAquisicao;
    private int quantidade;


    public ModelItemDeEstoque(ModelBrinquedo brinquedo, Date dataDeAquisicao, int quantidade) {
        this.brinquedo = brinquedo;
        this.dataDeAquisicao = dataDeAquisicao;
        this.quantidade = quantidade;
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