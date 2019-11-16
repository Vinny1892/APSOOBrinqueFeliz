package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.exceptions.jdbc4.MySQLDataException;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelBrinquedo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class DAOBrinquedo extends GenericDAO_CRUD {

    @Override
    public boolean salvar(Object object) throws SQLException {
       // try {
            ModelBrinquedo brinquedo = (ModelBrinquedo) object;
            String insert = "INSERT INTO brinquedos (id_categoria, codigo_de_barras, preco, id_fabricante, descricao, id_fornecedor) VALUES(?,?,?,?,?,?) ";
//            save(insert, brinquedo.getCategoria().getId(), brinquedo.getCodigoDeBarras(), brinquedo.getPreco, brinquedo.getFabricante().getID(), brinquedo.getDescricao, brinquedo.getFornecedor().getId());
            System.out.println("Metodo salvar DaoBrinquedo realizado");
            return true;
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
              ModelBrinquedo brinquedo = (ModelBrinquedo) object;
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
    
    
    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
