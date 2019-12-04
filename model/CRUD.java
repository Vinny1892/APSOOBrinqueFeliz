package model;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author kaio
 */
public interface CRUD{
    public int salvar(Object obj) throws SQLException;

    public boolean atualizar(Object obj) throws SQLException;

    public boolean deletar(int id) throws SQLException;

    public Object getById(int id) throws SQLException;

    public ArrayList<Object> getAll() throws SQLException;// pega tudo de uma tabela

}
