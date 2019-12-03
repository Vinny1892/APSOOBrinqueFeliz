
package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelCliente;
import model.ModelComprovante;
import model.ModelFuncionario;
import model.ModelVenda;

public class DAOVenda extends GenericDAO_CRUD{

	@Override
	public int salvar(Object object) throws SQLException {
		try {
            ModelVenda venda = (ModelVenda) object;
            if(venda.getId() > -1) {
                throw new RuntimeException("Essa venda já foi inserido, para modifica-lo basta o atualizar");}
			int id = createId();
            String insert = "INSERT INTO vendas (id_venda, data_venda, valor, id_funcionario, forma_pagamento, id_cliente) VALUES(?,?,?,?,?,?)";
            save(insert, id,venda.getData_venda(), venda.getValorTotal(), venda.getFuncionario().getId(), venda.getForma(), venda.getCliente().getId());
            System.out.println("Metodo salvar DAOVenda realizado");
            return id;
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
			String update= "UPDATE vendas SET data_venda =?, valor=?, id_funcionario=?, forma_pagamento=?, id_cliente=? WHERE vendas.id_venda=?";
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
            
            String delete = "DELETE FROM vendas WHERE vendas.id_venda=?";
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
		ArrayList<Object> comprovantes = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM comprovantes");
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
        	ModelVenda ve1= new ModelVenda();
        	ModelVenda venda= new ModelVenda(rs.getInt("id_venda"), ModelCliente.getByIdArray(rs.getInt("id_cliente")),
        			ModelFuncionario.getByIdArray(rs.getInt("id_funcionario")), rs.getDate("data_venda"), rs.getString("forma_pagamento"), 
        			rs.getDouble("valor"), ve1.getAllArray());
        }
        rs.close();
        stmt.close();
        return comprovantes;
	}
	protected int createId() throws SQLException { 
        
        System.out.println("SELECT vendas.id_venda FROM vendas order by ? desc limit 1"); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_venda FROM vendas order by ? desc limit 1"); 
        stmt.setString(1, "id_venda"); 
        stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            int ultimoId = rs.getInt("id_venda"); 
            return ultimoId + 1; 
        } 
     
        rs.close();
        stmt.close();
        return 0; 
    }

}

