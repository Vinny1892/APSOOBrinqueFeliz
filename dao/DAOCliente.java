package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelCliente;

public class DAOCliente extends GenericDAO_CRUD{


	@Override
	public int salvar(Object object) throws SQLException {
		try {
            ModelCliente cliente = (ModelCliente) object;
            if(cliente.getId() > -1) {
                throw new RuntimeException("Essa venda já foi inserido, para modifica-lo basta o atualizar");}
			int id = createId();
            String insert = "INSERT INTO clientes (id_cliente, rg, nome, data_nascimento, endereco, cep, cidade, estado) VALUES(?, ?, ?, ?, ?, ?, ?, ?) ";
            save(insert, id, cliente.getRg(), cliente.getNome(), cliente.getDataDeNascimento(), cliente.getEndereco(), cliente.getCep(),cliente.getCidade(), cliente.getEstado());
            System.out.println("Metodo salvar DAOCliente realizado");
            return 1;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "DAOCliente Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir DAOCliente");
        }
        return -1;
	}

	@Override
	public boolean atualizar(Object object) throws SQLException {
		try {
			ModelCliente cliente = (ModelCliente) object;
			String update = "UPDATE clientes SET rg=?, nome=?, data_nascimento=?, "
					+ "endereco=?, cep=?, cidade=?, estado=? WHERE clientes.id_cliente=?";
			update(update, cliente.getRg(), cliente.getNome(), cliente.getDataDeNascimento(), 
					cliente.getEndereco(), cliente.getCep(), cliente.getCidade(), cliente.getEstado() );
			return true;
		} catch (MySQLIntegrityConstraintViolationException e) {
	          JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
	          return true;
		} catch (SQLException ex) {
	          System.out.println(ex);
	          JOptionPane.showMessageDialog(null, "Erro ao atualizar Cliente");
		}
		return false;
	}

	@Override
	public boolean deletar(int id) throws SQLException {
		try {
            String delete = "DELETE FROM clientes WHERE clientes.id_cliente=?";
            
            delete(delete, id);
            System.out.println("Metodo deletar DAOCliente realizado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar DAOCliente");
        } 
        return false;
	}

	public Object getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getAll() throws SQLException {
		ArrayList<Object> clientes = new ArrayList<Object>();
		PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement("SELECT * FROM clientes");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	ModelCliente cliente = new ModelCliente(rs.getString("nome"), rs.getString("cpf"), rs.getString("endereco"), rs.getString("cep"), 
        											rs.getString("cidade"), rs.getString("estado"), rs.getDate("data_nascimento"), 
        											rs.getString("rg"), rs.getInt("id_cliente"));
        	
        	clientes.add(cliente);
				
		}
        rs.close();
        stmt.close();
		return clientes;
	}
protected int createId() throws SQLException { 
        
        System.out.println("SELECT clientes.id_cliente FROM clientes order by ? desc limit 1"); 
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement("SELECT id_cliente FROM clientes order by ? desc limit 1"); 
        stmt.setString(1, "id_cliente"); 
        stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            int ultimoId = rs.getInt("id_cliente"); 
            return ultimoId + 1; 
        } 
     
        rs.close();
        stmt.close();
        return 0; 
    }

}
