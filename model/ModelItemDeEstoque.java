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
    //Fim Getters e Setters

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
    private DAOItemDeEstoque dao = new DAOItemDeEstoque();

    
    
    @Override
    public int salvar(Object obj) throws SQLException {
        return dao.salvar(obj);
    }

    @Override
    public boolean atualizar(Object obj) throws SQLException {
        return dao.atualizar(obj);
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


    //
    public void atualizarArrayItensNoEstoque() throws SQLException{
        itensNoEstoque = (ArrayList<ModelItemDeEstoque>)(ArrayList<?>) dao.getAll();
    }
    
    // public ArrayList<ModelItemDeEstoque> getItensNoEstoque() {
    //     return itensNoEstoque;
    // }
    
    public ModelItemDeEstoque getByIdArray(int id)  {
        atualizarArrayItensNoEstoque();

        //return itensNoEstoque.get(itensNoEstoque.indexOf(Object.getId() == id));
        // itensNoEstoque.forEach(f -> {
        //     if(f.getId() == id)
        //         return f;
        // });
        for(ModelItemDeEstoque f : itensNoEstoque){
            if(f.getId() == id)
                return f;
        }
    }
    public ArrayList<ModelItemDeEstoque> getAllArray()  {
        return itensNoEstoque;
    } 

}