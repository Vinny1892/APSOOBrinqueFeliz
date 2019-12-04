
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import model.ModelComprovante;

public class DAOComprovante extends GenericDAO_CRUD{

	@Override
	public int salvar(Object object) throws SQLException {
		try {
			ModelComprovante comprovante = (ModelComprovante) object;
			String insert = "INSERT INTO comprovantes (nome_cliente, rg_cliente, nome_funcionario, cpf_funcionario, forma_pagamento, id_venda) VALUES(?,?,?,?,?,?) ";
			save(insert, comprovante.getCliente().getNome(), comprovante.getCliente().getRg(), comprovante.getFuncionario().getNome(), comprovante.getFuncionario().getCpf(), comprovante.getForma(), comprovante.getIdVenda());
				System.out.println("Metodo salvar DaoComprovante realizado");
				return 1;
		} catch (MySQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(null, "j� tem esse comprovante no BD");
			return -1;
		}catch (SQLException ex) {
			System.out.println(ex);
			JOptionPane.showMessageDialog(null, "Erro ao inserir Comprovante");
		}
		return -1;
	}

	@Override
	public boolean atualizar(Object object) throws SQLException {
		try {
			ModelComprovante comprovante = (ModelComprovante) object;
			String update= "UPDATE comprovantes SET nome_cliente =?, rg_cliente=?, nome_funcionario=?, "
					+ "cpf_funcionario=?, forma_pagamento=?, id_venda=? WHERE ID=?";
			update(update,comprovante.getCliente().getNome(), comprovante.getCliente().getRg(), 
					comprovante.getFuncionario().getNome(), comprovante.getFuncionario().getCpf(), 
					comprovante.getForma(), comprovante.getIdVenda());
			System.out.println("atualizado com sucesso");
			return true;
		} catch (MySQLIntegrityConstraintViolationException e) {
          JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
          
		} catch (SQLException ex) {
          System.out.println(ex);
          JOptionPane.showMessageDialog(null, "Erro ao atualizar Comprovante");
		}
			return false;
	}

	@Override
	public boolean deletar(int id) throws SQLException {
		try {
            //ModelComprovante comprovante = new ModelComprovante();
            String delete = "DELETE FROM comprovantes WHERE ID=?";
            
           delete(delete, id);
            System.out.println("Metodo deletar DaoComprovante realizado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar Comprovante");
        }
        return false;
	}

	@Override
	public Object getById(int id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object> getAll() throws SQLException {
		ArrayList<Object> comprovantes = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM comprovantes");
        
        
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	ModelComprovante brinquedo = new ModelComprovante ();
        	// v� como vai ficar isso 
        	//brinquedo.getCliente().setNome(rs.getString("nome_cliente"));
        	brinquedo.setForma(rs.getString("forma_pagamento"));
            comprovantes.add(brinquedo);
        }
        rs.close();
        stmt.close();
        return comprovantes;

	}
}
