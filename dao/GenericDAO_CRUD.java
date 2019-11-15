package dao;

import java.sql.SQLException;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conectionBD.ConexaoBDMySQL;
import java.util.ArrayList;
/**
 *
 * @author kaio
 */
public abstract class GenericDAO_CRUD {
    
    private Connection connection;
    protected GenericDAO_CRUD() {
        this.connection = ConexaoBDMySQL.getConnection();
    }
    
    // CRUD
    // Assinatura metodos para as Classes DAO
    public abstract boolean salvar(Object object) throws SQLException;

    public abstract boolean atualizar(Object object) throws SQLException;

    public abstract boolean deletar(String algumaCoisa) throws SQLException;

    public abstract Object getById(int id) throws SQLException;//retorna ArrayList<Object>  

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    public abstract ArrayList<Object> getAll() throws SQLException;// pega tudo de uma tabela


    
    //métodos para o BD
    protected Connection getConnection() {
        return connection;
    }

    protected void save(String insertSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(insertSql);
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.executeUpdate();
        pstmt.close();
    }

    protected void update(String updateSql, Object id, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(updateSql);
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        System.out.println("id: " + id);
        pstmt.setObject(parametros.length + 1, id);
        pstmt.execute();
        pstmt.close();
    }

    protected void delete(String deleteSql, Object... parametros) throws SQLException {
        PreparedStatement pstmt = getConnection().prepareStatement(deleteSql);
        for (int i = 0; i < parametros.length; i++) {
            pstmt.setObject(i + 1, parametros[i]);
        }
        pstmt.execute();
        pstmt.close();
    }
    
    
    
    

}