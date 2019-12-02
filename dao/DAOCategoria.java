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

    @Override
    public int salvar(Object object) throws SQLException {
        try {
            ModelCategoria categoria = (ModelCategoria) object;
            String insert = "INSERT INTO categorias (nome) VALUES(?) ";
            save(insert, categoria.getNome());
            System.out.println("Metodo salvar Daocategoria realizado");
            return 1;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "categoria Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir categoria");
        }
        return -1;
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
