package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelCategoria;


public class DAOCategoria extends GenericDAO_CRUD {

	protected int createId() throws SQLException { 
        
        System.out.println("SELECT id_categoria FROM categorias "); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_categoria FROM categorias order by id_categoria desc limit 1"); 
        // stmt.setString(1, "id_categoria"); 
        stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            
            int ultimoId = rs.getInt("id_categoria"); 
            
            System.out.println("Ultimo Id: " + ultimoId); 
            
            return ultimoId + 1; 
            
           
        } 
        
        
        rs.close();
        stmt.close();
        return 0;
        
        
   } 
        
        
    @Override
    public int salvar(Object object) throws SQLException { 
            ModelCategoria categoria = (ModelCategoria) object;
            
            
            String insert = "INSERT INTO categorias (id_categoria, nome) VALUES(?,?) ";
            
            if(categoria.getId() > -1 )
            	throw new RuntimeException("Valor ja inserido, para alterar o valor use o update");
            
            int id = createId();
            
            save(insert, id, categoria.getNome());
            System.out.println("Metodo salvar Daocategoria realizado");
            return id; 
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {

    	  try {
              ModelCategoria categoria = (ModelCategoria) object;
              String update = "UPDATE categorias SET nome=? WHERE ID=?";
              
              update(update, categoria.getId(),  categoria.getNome());
              
              
              System.out.println("Metodo atualizar Daocategoria realizado");
              return true;
    	  } catch (MySQLIntegrityConstraintViolationException e) {
              JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
          } catch (SQLException ex) {
              System.out.println(ex);
              JOptionPane.showMessageDialog(null, "Erro ao atualizar categoria");
          }
		return false;

      }

    	
    

    @Override
    public boolean deletar(int id) throws SQLException {
    	 try {

             String delete = "DELETE FROM categorias WHERE ID=?";
             
             delete(delete, id);
             System.out.println("Metodo deletar Daocategoria realizado");
             return true;
         } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "Erro ao deletar categoria");
         }
         return false;
     }

    
    
    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

  
    @Override
    public ArrayList<Object> getAll() throws SQLException {
        ArrayList<Object> categorias = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM categorias");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelCategoria categoria = new ModelCategoria(rs.getString("nome"), rs.getInt("id_categoria"));
            categorias.add(categoria);
        }
        rs.close();
        stmt.close();
        return categorias;
    }

}
