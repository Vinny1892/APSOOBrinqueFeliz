package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelBrinquedo;
import model.ModelCategoria;
import model.ModelFabricante;
import model.ModelFornecedor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAOBrinquedo extends GenericDAO_CRUD {

	
	protected int createId() throws SQLException { 
	        
	        System.out.println("SELECT id_brinquedo FROM brinquedos order by ? desc limit 1"); 
	        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_brinquedo FROM brinquedos order by ? desc limit 1"); 
	        stmt.setString(1, "id_brinquedo"); 
	        stmt.execute(); 
	        ResultSet rs = stmt.executeQuery(); 
	        while (rs.next()) {
	            
	            int ultimoId = rs.getInt("id_brinquedo"); 
	            
	            return ultimoId + 1; 
	            
	           
	        } 
	        
	        
	        rs.close();
	        stmt.close();
	        return 0;
	        
	        
	   } 
    @Override
    public int salvar(Object object) throws SQLException {
        try {
            ModelBrinquedo brinquedo = (ModelBrinquedo) object;
            
            if(brinquedo.getId() > -1 )
            	throw new RuntimeException("Valor ja inserido, para alterar o valor use o update");
            
            
            int id = createId();
            
            String insert = "INSERT INTO brinquedos (id_brinquedo, id_categoria, codigo_de_barras, preco, id_fabricante, descricao, id_fornecedor) VALUES(?,?,?,?,?,?,?) ";
            save(insert, id, brinquedo.getCategoria().getId(), brinquedo.getId(), brinquedo.getPreco(), brinquedo.getFabricante().getId(), brinquedo.getDescricao(), brinquedo.getFornecedor().getId());
            System.out.println("Metodo salvar DaoBrinquedo realizado");
            return id;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Brinquedo Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir Brinquedo");
        }
        return -1;
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {
    	  try {
              ModelBrinquedo brinquedo = (ModelBrinquedo) object;
              String update = "UPDATE brinquedos SET id_categoria=?, codigo_de_barras=?, preco=?, id_fabricante=?, descricao=?, id_fornecedor=? WHERE ID=?";
              
             update(update, brinquedo.getId(),  brinquedo.getCategoria().getId(), brinquedo.getId(), brinquedo.getPreco(), brinquedo.getFabricante().getId(), brinquedo.getDescricao(), brinquedo.getFornecedor().getId());
              
              
              System.out.println("Metodo atualizar DaoBrinquedo realizado");
              return true;
    	  } catch (MySQLIntegrityConstraintViolationException e) {
              JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
          } catch (SQLException ex) {
              System.out.println(ex);
              JOptionPane.showMessageDialog(null, "Erro ao atualizar Brinquedo");
          }
		return false;
      }

    	
    

    @Override
    public boolean deletar(int id) throws SQLException {
    	 try {
             String delete = "DELETE FROM brinquedos WHERE ID=?";
             
             delete(delete, id);
             System.out.println("Metodo deletar DaoBrinquedo realizado");
             return true;
         } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "Erro ao deletar Brinquedo");
         }
         return false;
     }
    
    
    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<Object> getAll() throws SQLException {
        ArrayList<Object> brinquedos = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM brinquedos");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelBrinquedo brinquedo = new ModelBrinquedo(new ModelCategoria().getByIdArray(rs.getInt("id_categoria")), rs.getString("nome"), rs.getDouble("preco"), new ModelFabricante().getByIdArray(rs.getInt("id_fabricante")), rs.getString("descricao"), new ModelFornecedor().getByIdArray(rs.getInt("id_fornecedor")),  rs.getInt("codigo_de_barras"));
            brinquedos.add(brinquedo);
        }
        rs.close();
        stmt.close();
        return brinquedos;
    }

}
