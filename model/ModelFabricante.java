package model;

import java.sql.SQLException;
import java.util.List;
import dao.DAOFabricante;

/**
 *
 * @author kaio
 */
public class ModelFabricante implements CRUD{
    
    //atributos
    DAOFabricante daoFabricante = new DAOFabricante();
    private String nome;
    
    //construtor
    public ModelFabricante(String nome) {
        this.nome = nome;
    }

    public ModelFabricante() {
    }

    //getters setters
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    //acesso DAO
    @Override
    public void salvar() throws SQLException {
        daoFabricante.salvar(this);
    }


    @Override
    public List<Object> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
