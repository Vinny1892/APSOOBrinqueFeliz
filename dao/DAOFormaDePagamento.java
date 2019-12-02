package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import helpers.DateHelper;

import model.ModelFuncionario; 


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane; 


public class DAOFormaDePagamento extends GenericDAO_CRUD {

    @Override
    public int salvar(Object object) throws SQLException {
       // try {
            ModelFuncionario funcionario = (ModelFuncionario) object;
            String insert = "INSERT INTO funcionarios (id_funcionario, senha, telefone_residencial, telefone_celular, email, data_contratacao, is_adm, nome, cpf, data_nascimento, endereco, cep, cidade, estado ) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?) "; 
            save(insert, funcionario.getId(), funcionario.getSenha(), funcionario.getTelefoneResidencial(), funcionario.getTelefoneCelular(), funcionario.getEmail(), funcionario.getDataDeContratacao(), funcionario.getIsADM(), funcionario.getNome(), funcionario.getCpf(), funcionario.getDataDeNascimento(), funcionario.getEndereco(), funcionario.getCep(), funcionario.getCidade(), funcionario.getEstado()); 
            System.out.println("Metodo salvar DaoBrinquedo realizado");
            return -1; 
       // } catch (MySQLIntegrityConstraintViolationException e) {
         //   JOptionPane.showMessageDialog(null, "Brinquedo Ja cadastrado no BD");
        //} catch (SQLException ex) {
          //  System.out.println(ex);
           // JOptionPane.showMessageDialog(null, "Erro ao inserir Brinquedo");
       // }
        //return false;
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {
    	 // try {
              ModelFuncionario funcionario = (ModelFuncionario) object;
              String update = "UPDATE brinquedos SET id_categoria=?, codigo_de_barras=?, preco=?, id_fabricante=?, descricao=?, id_fornecedor=? WHERE ID=?";
              
             //update(update, brinquedo.getId(),  brinquedo.getCategoria().getId(), brinquedo.getCodigoDeBarras(), brinquedo.getPreco, brinquedo.getFabricante().getID(), brinquedo.getDescricao, brinquedo.getFornecedor().getId());
              
              
              System.out.println("Metodo atualizar DaoBrinquedo realizado");
              return true;
//    	  } catch (MySQLIntegrityConstraintViolationException e) {
//              JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
//          } catch (SQLException ex) {
//              System.out.println(ex);
//              JOptionPane.showMessageDialog(null, "Erro ao atualizar Brinquedo");
//          }
      }

    	
    

    @Override
    public boolean deletar(int id) throws SQLException {
    	 try {
             //ModelBrinquedo brinquedo = (ModelBrinquedo) object;
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
    
    protected int createId() throws SQLException { 
        
        System.out.println("SELECT funcionarios.id_funcionario FROM funcionarios order by ? desc limit 1"); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT id_funcionario FROM funcionarios order by ? desc limit 1"); 
        stmt.setString(1, "id_funcionario"); 
        stmt.execute(); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            
            int ultimoId = rs.getInt("id_funcionario"); 
            
            return ultimoId + 1; 
            
            //fabricantes.add(fabricante);
        } 
        
        
        rs.close();
        stmt.close();
        return -1;//fabricantes; 
        
        
    } 
    
    
    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    
    public ModelFuncionario getByEmail(String email) throws SQLException, ParseException{ 
        
        System.out.println("SELECT * FROM funcionarios where funcionarios.email = ?"); 
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM funcionarios where funcionarios.email = ?"); 
        stmt.setString(1, email); 
        ResultSet rs = stmt.executeQuery(); 
        while (rs.next()) {
            
            ModelFuncionario funcionario = new ModelFuncionario(rs.getInt("id_funcionario"), rs.getString("telefone_residencial"), rs.getString("telefone_celular"), rs.getString("email"), rs.getDate("data_contratacao"), rs.getBoolean("is_adm"), rs.getString("senha"), rs.getString("nome"), rs.getString("cpf"), rs.getDate("data_nascimento"), rs.getString("endereco"), rs.getString("cep"), rs.getString("cidade"), rs.getString("estado")); 
            
            return funcionario; 
            
            //fabricantes.add(fabricante);
        } 
        
        
        rs.close();
        stmt.close();
        return null;//fabricantes; 
        
        
    }

    /*
        Metodo utilizado para pegar todos os fornecedores na tabela/entidade fornecedor,
        e retorna um ArrayList deste objeto GestaoFornecedor.
     */
    @Override
    public ArrayList<Object> getAll() throws SQLException {
        ArrayList<Object> brinquedos = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM brinquedos");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            //ModelBrinquedo brinquedo = new ModelBrinquedo(rs.getInt("id_categoria"), rs.getLong("codigo_de_barras"), rs.getDouble("preco"), rs.getInt("id_fabricante"), rs.getString("descricao"), rs.getInt("id_fornecedor"));
            //brinquedos.add(brinquedo);
        }
        rs.close();
        stmt.close();
        return brinquedos;
    }

}

