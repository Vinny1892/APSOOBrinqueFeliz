package model;

import java.sql.SQLException;
import java.util.List;
import dao.DAOFabricante;

/**
 *
 * @author kaio
 */
public interface CRUD{
    public abstract void salvar(Object object) throws SQLException;

    public abstract void atualizar(Object object) throws SQLException;

    public abstract void deletar(String algumaCoisa) throws SQLException;

    public abstract Object getById(int id) throws SQLException;//retorna ArrayList<Object>  

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    public abstract List<Object> getAll() throws SQLException;// pega tudo de uma tabela
}
