package model;

import dao.DAOItemDeEstoque;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModelItemDeEstoque implements CRUD{
    private static ArrayList<ModelItemDeEstoque> itensNoEstoque;
    private ModelBrinquedo brinquedo;//tirar?
    private int quantidade;
    private int id;

    public ModelItemDeEstoque() throws SQLException {
        itensNoEstoque = (ArrayList<ModelItemDeEstoque>) (ArrayList<?>) new DAOItemDeEstoque().getAll();
    }

    //Com ID
    public ModelItemDeEstoque(ModelBrinquedo brinquedo, int quantidade, int id) throws SQLException {
        itensNoEstoque = (ArrayList<ModelItemDeEstoque>) (ArrayList<?>) new DAOItemDeEstoque().getAll();
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
        this.id = id;
    }

    //Sem ID
    public ModelItemDeEstoque(ModelBrinquedo brinquedo, int quantidade) throws SQLException {
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
        itensNoEstoque = (ArrayList<ModelItemDeEstoque>) (ArrayList<?>) new DAOItemDeEstoque().getAll();
    }

    public static ArrayList<ModelItemDeEstoque> getItensNoEstoque() {
        return itensNoEstoque;
    }

    public static void atualizarArrayListItensNoEstoque() throws SQLException {
        itensNoEstoque = (ArrayList<ModelItemDeEstoque>) (ArrayList<?>) new DAOItemDeEstoque().getAll();
    }

    public ModelBrinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(ModelBrinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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
        return new DAOItemDeEstoque().getAll();
    }

}