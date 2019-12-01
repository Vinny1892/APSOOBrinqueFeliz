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

/**
 *
 * @author kaio
 */
public class DAOFabricante extends GenericDAO_CRUD {

    @Override
    public int salvar(Object object) throws SQLException {
        try {
            ModelFabricante fabricante = (ModelFabricante) object;
            String insert = "INSERT INTO fabricantes (nome) VALUES(?) ";
            save(insert, fabricante.getNome());
            System.out.println("Metodo salvar DaoFabricante realizado");
            return -1;
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

    	 // try {
        ModelFabricante fabricante = (ModelFabricante) object;
        String update = "UPDATE fabricantes SET nome=? WHERE ID=?";
        
       //update(update, fabricante.getId(),  fabricante.getNome());
        
        
        System.out.println("Metodo atualizar Daofabricante realizado");
        return true;
//	  } catch (MySQLIntegrityConstraintViolationException e) {
//        JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
//    } catch (SQLException ex) {
//        System.out.println(ex);
//        JOptionPane.showMessageDialog(null, "Erro ao atualizar fabricante");
//    }
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
            //ModelFabricante fabricante = new ModelFabricante(rs.getInt("id_fabricante"), rs.getString("nome"));
            //fabricantes.add(fabricante);
        }
        rs.close();
        stmt.close();
        return fabricantes;
    }

}
