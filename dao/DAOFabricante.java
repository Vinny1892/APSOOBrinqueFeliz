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

/**
 *
 * @author kaio
 */
public class DAOFabricante implements CRUD{

    @Override
    public void salvar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Object object) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(String algumaCoisa) throws SQLException {
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
        ArrayList<Object> fornecedores = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM fornecedor");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            GestaoFornecedor fornecedor = new GestaoFornecedor(rs.getInt("id_fornecedor"), rs.getString("nome"), rs.getString("cnpj"), rs.getString("endereco"), rs.getBoolean("recorrente"), rs.getInt("taxa_desconto"));
            fornecedores.add(fornecedor);
        }
        rs.close();
        stmt.close();
        return fornecedores;
    }
    
}
