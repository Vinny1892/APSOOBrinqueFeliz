package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

import model.ModelCliente;
import model.ModelComprovante;
import model.ModelFuncionario;
import model.ModelItemDeVenda;

public class DAOComprovante extends GenericDAO_CRUD{

	@Override
	public int salvar(Object object) throws SQLException {
		// me falaram que a daocomprovante não terá mais os metodos salvar nem atualizar, vou deixar como comentario vai que muda de ideia
		//
		/*try {
			ModelComprovante comprovante = (ModelComprovante) object;
			
			if(comprovante.getId() > -1) 
			     throw new RuntimeException("Comprovante Já Inserido, use o update para altera-lo"); 
            
            int id = createId(); 
			String insert = "INSERT INTO comprovantes (id_comprovante, nome_cliente, rg_cliente, nome_funcionario, cpf_funcionario, forma_pagamento, id_venda) VALUES(?,?,?,?,?,?,?) ";
			save(insert, id, comprovante.getCliente().getNome(), comprovante.getCliente().getRg(), comprovante.getFuncionario().getNome(), comprovante.getFuncionario().getCpf(), comprovante.getForma(), comprovante.getIdVenda());
				System.out.println("Metodo salvar DaoComprovante realizado");
				return id;
		} catch (MySQLIntegrityConstraintViolationException e) {
			JOptionPane.showMessageDialog(null, "já tem esse comprovante no BD");
			return -1;
		}catch (SQLException ex) {
			System.out.println(ex);
			JOptionPane.showMessageDialog(null, "Erro ao inserir Comprovante");
		}*/
		return -1;
	}

	@Override
	public boolean atualizar(Object object) throws SQLException {
	
		/*try {
			ModelComprovante comprovante = (ModelComprovante) object;
			String update= "UPDATE comprovantes SET nome_cliente =?, rg_cliente=?, nome_funcionario=?, "
					+ "cpf_funcionario=?, forma_pagamento=?, id_venda=? WHERE comprovantes.id_comprovante=?";
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
		}*/
			return false;
	}

	@Override
	public boolean deletar(int id) throws SQLException {
		try {
            //ModelComprovante comprovante = new ModelComprovante();
            String delete = "DELETE FROM comprovantes WHERE comprovantes.id_comprovante=?";
            
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
		PreparedStatement stmt = getConnection().prepareStatement("select * from itens_venda  where itens_venda.id_venda = ?")
		return null;
	}
	


	@Override
	public ArrayList<Object> getAll() throws SQLException {
		ArrayList<Object> comprovantes = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM comprovantes");
        
        
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
        	ModelComprovante comprovante = new ModelComprovante(rs.getInt("id_comprovante"), rs.getInt("id_venda"), 
        			ModelCliente.getByIdArray(rs.getInt("id_cliente")), ModelFuncionario.getByIdArray(rs.getInt("id_funcionario")), 
        			rs.getDate("data_venda"),rs.getString("forma_pagamento"), rs.getDouble("valor"), carrinho);
            comprovantes.add(comprovante);
        }
        rs.close();
        stmt.close();
        return comprovantes;

	}
	protected int createId() throws SQLException { 
        
        System.out.println("SELECT comprovantes.id_comprovante FROM comprovantes order by ? desc limit 1"); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_comprovante FROM comprovantes order by ? desc limit 1"); 
        stmt.setString(1, "id_comprovante"); 
        stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            int ultimoId = rs.getInt("id_comprovante"); 
            return ultimoId + 1; 
        } 
     
        rs.close();
        stmt.close();
        return 0; 
    }
}

