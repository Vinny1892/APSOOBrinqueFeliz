package model;

import java.sql.SQLException;
import dao.DAOCategoria;

public class ModelCategoria{
    private String nome;


    public ModelCategoria(String nome) {
        this.nome = nome;
    }


    public ModelCategoria() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void gerarRelatioDeProdutos(){

    }


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