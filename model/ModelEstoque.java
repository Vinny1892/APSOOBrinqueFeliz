package model;

import java.sql.SQLException;
import dao.DAOEstoque;
import java.util.List;

public class ModelEstoque implements CRUD{
    
    //atributos
    private List<Brinquedo> itensNoEstoque = new List<Brinquedo>();
    
    //construtor

    public ModelEstoque() {
    }

    //getter
    public List getItensNoEstoque(){
        return this.itensNoEstoque;
    }

    //setter
    public void setItensNoEstoque(Brinquedo brinquedo){
        this.itensNoEstoque.add(brinquedo);
    }

    public void exibeListaDeProdutos(){

    }

    public void criar(Object obj){

    }

    public List buscarBrinquedo(Categoria categoria){

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