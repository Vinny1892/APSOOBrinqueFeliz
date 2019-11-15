package model;

import java.sql.SQLException;
import dao.DAOFabricante;
import java.util.List;
import java.util.ArrayList;

public class ModelFabricante{
    private String nome;
    private List<ModelBrinquedo> brinquedo = new ArrayList<>(); //Consta como produto de acordo com o diagrama
    private int id;


    public ModelFabricante(String nome, ModelBrinquedo brinquedo, int id) {
        this.nome = nome;
        this.brinquedo = brinquedo;
        this.id = id;
    }

    public ModelFabricante() {
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ModelBrinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(ModelBrinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    


    //acesso DAO
    private DAOBrinquedo dao = new DAOBrinquedo();
    @Override
    public void salvar() throws SQLException {
        dao.salvar(this);
    }

    @Override
    public abstract void atualizar() throws SQLException {
        dao.atualizar(this);
    }

    @Override
    public abstract void deletar() throws SQLException {
        dao.deletar(this.id);
    }

    @Override
    public abstract Object getById(int id) throws SQLException {
        dao.getById(id);
    }//retorna ArrayList<Object>  

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    @Override
    public abstract List<Object> getAll() throws SQLException {
        dao.getAll();
    }// pega tudo de uma tabela
}