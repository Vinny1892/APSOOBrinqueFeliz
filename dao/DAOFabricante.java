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
    public boolean salvar(Object object) throws SQLException {
        try {
            ModelFabricante fabricante = (ModelFabricante) object;
            String insert = "INSERT INTO fabricante (nome,endereco,cpf,telefone,id_cartao_fidelidade) VALUES(?,?,?,?,?) ";
            save(insert, fabricante.getNome());
            System.out.println("Metodo salvar DaoFabricante realizado");
            return true;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Fabricante Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir Fabricante");
        }
        return false;
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        ArrayList<Object> fabricantes = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM fabricante");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            //ModelFabricante fabricante = new ModelFabricante(rs.getInt("id_fabricante"), rs.getString("nome"), rs.getString("cnpj"), rs.getString("endereco"), rs.getBoolean("recorrente"), rs.getInt("taxa_desconto"));
            //fabricantes.add(fabricante);
        }
        rs.close();
        stmt.close();
        return null;//fabricantes;
    }

}
