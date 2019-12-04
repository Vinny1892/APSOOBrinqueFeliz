package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.ModelFabricante;



public class DAOFabricante extends GenericDAO_CRUD {

	protected int createId() throws SQLException { 
        
        System.out.println("SELECT id_fabricante FROM fabricantes order by ? desc limit 1"); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_fabricante FROM fabricantes order by ? desc limit 1"); 
        stmt.setString(1, "id_fabricante"); 
        stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            
            int ultimoId = rs.getInt("id_fabricante"); 
            
            return ultimoId + 1; 
            
           
        } 
        
        
        rs.close();
        stmt.close();
        return 0;
        
        
   } 
    @Override
    public int salvar(Object object) throws SQLException {
        try {

            ModelFabricante fabricante = (ModelFabricante) object;
            
            if(fabricante.getId() > -1 )
            	throw new RuntimeException("Valor ja inserido, para alterar o valor use o update");
            int id = createId();
                    
            String insert = "INSERT INTO fabricantes (id_fabricante, cnpj, nome) VALUES(?,?,?) ";
            save(insert, id, fabricante.getCnpj(), fabricante.getNome());

            System.out.println("Metodo salvar DaoFabricante realizado");
            return id;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Fabricante Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir Fabricante");
        }
        return -1;
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {

    	try {
        ModelFabricante fabricante = (ModelFabricante) object;
        String update = "UPDATE fabricantes SET nome=?, cnpj=? WHERE ID=?";
        
        update(update, fabricante.getId(),  fabricante.getNome(), fabricante.getCnpj());
        
        
        System.out.println("Metodo atualizar Daofabricante realizado");
        return true;
	  } catch (MySQLIntegrityConstraintViolationException e) {
        JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
	  } catch (SQLException ex) {
        System.out.println(ex);
    	JOptionPane.showMessageDialog(null, "Erro ao atualizar fabricante");
	  }
		return false;
    }


    @Override
    public boolean deletar(int id) throws SQLException {
	   	 try {
	         String delete = "DELETE FROM fabricantes WHERE ID=?";
	         
	         delete(delete, id);
	         System.out.println("Metodo deletar Daofabricante realizado");
	         return true;
	     } catch (SQLException ex) {
	         System.out.println(ex);
	         JOptionPane.showMessageDialog(null, "Erro ao deletar fabricante");
	     }
	     return false;
    }

    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    @Override
    public ArrayList<Object> getAll() throws SQLException {
        ArrayList<Object> fabricantes = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM fabricante");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelFabricante fabricante = new ModelFabricante(rs.getString("nome"), rs.getString("cnpj"),rs.getInt("id_fabricante"));
            fabricantes.add(fabricante);
        }
        rs.close();
        stmt.close();
        return fabricantes;
    }

}
