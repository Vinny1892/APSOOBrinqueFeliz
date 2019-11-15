package model;

import java.sql.SQLException;
import java.util.List;
import dao.DAOFabricante;
import java.util.ArrayList;

/**
 *
 * @author kaio
 */
public interface CRUD{
    public boolean salvar() throws SQLException;

    public boolean atualizar() throws SQLException;

    public boolean deletar() throws SQLException;

    public Object getById(int id) throws SQLException;//retorna ArrayList<Object>  

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    public ArrayList<Object> getAll() throws SQLException;// pega tudo de uma tabela

}
