package model;

import dao.DAOItemDeEstoque;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Objects;

public class ModelItemDeEstoque implements CRUD{
    private static ArrayList<ModelItemDeEstoque> itensNoEstoque;
    private ModelBrinquedo brinquedo;//tirar?
    private int quantidade;
    private int id;

    public ModelItemDeEstoque() throws SQLException {
        atualizarArrayListItensNoEstoque();
    }

    //Com ID
    public ModelItemDeEstoque(ModelBrinquedo brinquedo, int quantidade, int id) throws SQLException {
        atualizarArrayListItensNoEstoque();
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
        this.id = id;
    }

    //Sem ID
    public ModelItemDeEstoque(ModelBrinquedo brinquedo, int quantidade) throws SQLException {
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
        atualizarArrayListItensNoEstoque();
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

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModelItemDeEstoque other = (ModelItemDeEstoque) obj;
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.brinquedo, other.brinquedo)) {
            return false;
        }
        return true;
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