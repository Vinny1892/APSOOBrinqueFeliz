package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelBrinquedo;
import model.ModelComprovante;
import model.ModelVenda;

public class DAOVenda extends GenericDAO_CRUD{

	@Override
	public int salvar(Object object) throws SQLException {
		try {
            ModelVenda venda = (ModelVenda) object;
            String insert = "INSERT INTO vendas (data_venda, valor, id_funcionario, forma_pagamento, id_cliente) VALUES(?,?,?,?,?,)";
            save(insert, venda.getData_venda(), venda.getValorTotal(), venda.getFuncionario().getId(), venda.getForma(), venda.getCliente().getId());
            System.out.println("Metodo salvar DAOVenda realizado");
            return 1;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Venda Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir Venda");
        }
        return -1;
	}

	@Override
	public boolean atualizar(Object object) throws SQLException {
		try {
			ModelVenda venda = (ModelVenda) object;
			String update= "UPDATE vendas SET data_venda =?, valor=?, id_funcionario=?, forma_pagamento=?, id_cliente=? WHERE ID=?";
			update(update, venda.getData_venda(), venda.getValorTotal(), venda.getFuncionario().getId(), venda.getForma(), venda.getCliente().getId());
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
            String delete = "DELETE FROM vendas WHERE ID=?";
            
           delete(delete, id);
            System.out.println("Metodo deletar venda realizado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar venda");
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
		// TODO Auto-generated method stub
		return null;
	}

}
