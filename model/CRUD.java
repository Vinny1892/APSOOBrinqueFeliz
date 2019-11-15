package model;

import java.sql.SQLException;
import java.util.List;
import dao.DAOFabricante;

/**
 *
 * @author kaio
 */
public interface CRUD{
    public void salvar() throws SQLException;

    public void atualizar() throws SQLException;

    public void deletar() throws SQLException;

    public Object getById(int id) throws SQLException;//retorna ArrayList<Object>  

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    public List<Object> getAll() throws SQLException;// pega tudo de uma tabela
}
