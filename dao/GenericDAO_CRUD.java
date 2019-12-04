package dao;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conectionBD.ConexaoBDMySQL;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.ModelFuncionario;
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
    public abstract int salvar(Object object) throws SQLException;

    public abstract boolean atualizar(Object object) throws SQLException;

    public abstract boolean deletar(int id) throws SQLException;

    public abstract Object getById(int id) throws SQLException; 

    public abstract ArrayList<Object> getAll() throws SQLException;





    
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
    
    protected void select(String selectSql) throws SQLException { 
        PreparedStatement pstmt = getConnection().prepareStatement(selectSql); 
        pstmt.close();
    } 
    
    protected int createId(String table, String id) throws SQLException { 
        
        System.out.println("SELECT ? FROM ? order by ? desc limit 1"); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT ? FROM ? order by ? desc limit 1"); 
        stmt.setString(1, id); 
        stmt.setString(2, table); 
        stmt.setString(3, id); 
        // stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            
            int ultimoId = rs.getInt(id); 
            
            return ultimoId + 1; 
            
            //fabricantes.add(fabricante);
        } 
        
        
        rs.close();
        stmt.close();
        return 0;//fabricantes; 
        
        
    }
    
    
    
    

}