package model;

import java.sql.SQLException;
//import dao.DAOEstoque;
import java.util.ArrayList;

public class ModelEstoque implements CRUD{
    //private ArrayList<ModelBrinquedo> itensNoEstoque = new ArrayList<>();
    private String local;
    private int id;
    
    public ModelEstoque() {
    }

    //Com ID
    public ModelEstoque(String local, int id) {
        this.local = local;
        this.id = id;
    }


    //Sem ID
    public ModelEstoque(String local) {
        this.local = local;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<Brinquedo> exibeListaDeProdutos(){
        List<modelBrinquedo> listaDeProdutos = new ArrayList<modelBrinquedo>();
        return listaDeProdutos;
    }

    public void addItemDeEstoque(modelItemDeEstoque itemDeEstoque){

    }   

    public ArrayList<modelBrinquedo> buscarBrinquedo(modelCategoria categoria){
        List<modelBrinquedo> lista = new ArrayList<modelBrinquedo>();
        return lista;
    }

    // @Override
    // public String toString() {
    //     return "{" +
    //         " local='" + getItensNoEstoque() + "'" +
    //         "}";
    // }

   
    //acesso DAO

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