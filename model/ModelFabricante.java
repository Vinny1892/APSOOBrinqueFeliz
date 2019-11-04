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
    
    //construtor
    
    //getters setters

    //acesso DAO
    @Override
    public void salvar(Object object) throws SQLException {
        daoFabricante.salvar(object);
    }

    @Override
    public void atualizar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(String algumaCoisa) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
