package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelItemDeEstoque;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAOItemDeEstoque extends GenericDAO_CRUD {

    @Override
    public int salvar(Object object) throws SQLException {
        try {
            ModelItemDeEstoque ItemDeEstoque = (ModelItemDeEstoque) object;
            String insert = "INSERT INTO itens_estoque (id_brinquedo, quantidade) VALUES(?,?) ";
            save(insert, ItemDeEstoque.getBrinquedo().getId(), ItemDeEstoque.getQuantidade());
            System.out.println("Metodo salvar DAOItemDeEstoque realizado");
            return 1;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "ItemDeEstoque Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir ItemDeEstoque");
        }
        return -1;
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {
    	  try {
              ModelItemDeEstoque ItemDeEstoque = (ModelItemDeEstoque) object;
              String update = "UPDATE itens_estoque SET id_brinquedo=?, quantidade=? WHERE ID=?";
              
             update(update, ItemDeEstoque.getId(),  ItemDeEstoque.getBrinquedo().getId(), ItemDeEstoque.getQuantidade());
              
              
              System.out.println("Metodo atualizar DAOItemDeEstoque realizado");
              return true;
    	  } catch (MySQLIntegrityConstraintViolationException e) {
              JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
          } catch (SQLException ex) {
              System.out.println(ex);
              JOptionPane.showMessageDialog(null, "Erro ao atualizar ItemDeEstoque");
          }
		return false;
      }

    	
    

    @Override
    public boolean deletar(int id) throws SQLException {
    	 try {
             String delete = "DELETE FROM itens_estoque WHERE ID=?";
             
             delete(delete, id);
             System.out.println("Metodo deletar DAOItemDeEstoque realizado");
             return true;
         } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "Erro ao deletar ItemDeEstoque");
         }
         return false;
     }
    
    
    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<Object> getAll() throws SQLException {
        ArrayList<Object> itens_estoque = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM itens_estoque");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelItemDeEstoque ItemDeEstoque = new ModelItemDeEstoque(rs.getInt("id_brinquedo"), rs.getInt("quantidade"), rs.getInt("id_item_estoque"));
            itens_estoque.add(ItemDeEstoque);
        }
        rs.close();
        stmt.close();
        return itens_estoque;
    }

}
