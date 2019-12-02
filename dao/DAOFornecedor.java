
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import model.ModelFornecedor;


public class DAOFornecedor extends GenericDAO_CRUD {

	@Override
	public int salvar(Object object) throws SQLException {
		//try {
			ModelFornecedor fornecedor = (ModelFornecedor) object;
			if(fornecedor.getId() > -1) {
                throw new RuntimeException("Esse Fornecedor j� foi inserido, para modifica-lo basta o atualizar");}
			int id = createId();
			String insert ="INSERT INTO fornecedores(id_fornecedor, cnpj, nome_fantasia, razao_social, "
					+ "endereco, cidade, estado, telefone, email) VALUE(?,?,?,?,?,?,?,?,?)";
			save(insert, id, fornecedor.getCnpj(), fornecedor.getNomeFantasia(), fornecedor.getRazaoSocial(), fornecedor.getEndereco(), 
					     fornecedor.getCidade(), fornecedor.getEstado(), fornecedor.getTelefone(), fornecedor.getEmail());
			return id;
		/*} catch (MySQLIntegrityConstraintViolationException e ) {
			JOptionPane.showMessageDialog(null, "Fornecedor Ja cadastrado no BD");
			return -1;
		}catch (SQLException ex) {
	            System.out.println(ex);
	            JOptionPane.showMessageDialog(null, "Erro ao inserir Brinquedo");
	        }
		return -1;*/
	}

	@Override
	public boolean atualizar(Object object) throws SQLException {
		try {
			ModelFornecedor fornecedor= (ModelFornecedor) object;
			String update = "UPDATE fornecedores SET cnpj=?,nome_fantasia=?, razao_social=?, "
					+ "endereco=?, cidade=?, estado=?, telefone=?, email=?  WHERE fornecedores.id_fornecedor=?";
			update(update, fornecedor.getId(), fornecedor.getCnpj(), fornecedor.getNomeFantasia(), fornecedor.getRazaoSocial(),
					fornecedor.getEndereco(), fornecedor.getCidade(), fornecedor.getEstado(), fornecedor.getTelefone(), fornecedor.getEmail());
			return true;
		} catch (MySQLIntegrityConstraintViolationException e) {
	          JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
	          return true;
		} catch (SQLException ex) {
	          System.out.println(ex);
	          JOptionPane.showMessageDialog(null, "Erro ao atualizar Fornecedor");
		}
		return false;
	}

	@Override
	public boolean deletar(int id) throws SQLException {
		 try {
             String delete = "DELETE FROM fornecedores WHERE fornecedores.id_fornecedor=?";
             
             delete(delete, id);
             System.out.println("Metodo deletar DAOFornecedores realizado");
             return true;
         } catch (SQLException ex) {
             System.out.println(ex);
             JOptionPane.showMessageDialog(null, "Erro ao deletar DAOFornecedores");
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
		ArrayList<Object> fornecedores = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM fornecedores");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelFornecedor fornecedor = new ModelFornecedor(rs.getString("cnpj"), rs.getString("nome_fantasia"), rs.getString("razao_social"), 
            												rs.getString("endereco"), rs.getString("cidade"), rs.getString("estado"), 
            												rs.getString("telefone"), rs.getString("email"), rs.getInt("id_fornecedor"));
            fornecedores.add(fornecedor); 
        }
        rs.close();
        stmt.close();
        return fornecedores;
	}
	 protected int createId() throws SQLException { 
	        
	        System.out.println("SELECT fornecedores.id_fornecedor FROM fornecedores order by ? desc limit 1"); 
	        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_fornecedor FROM fornecedores order by ? desc limit 1"); 
	        stmt.setString(1, "id_fornecedor"); 
	        stmt.execute(); 
	        ResultSet rs = stmt.executeQuery(); 
	        while (rs.next()) {
	            int ultimoId = rs.getInt("id_fornecedor"); 
	            return ultimoId + 1; 
	        } 
	     
	        rs.close();
	        stmt.close();
	        return 0; 
	    }

}
