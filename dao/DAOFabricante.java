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
        ArrayList<Object> fabricantes = new ArrayList<>();
        PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM fabricante");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelFabricante fabricante = new ModelFabricante(rs.getInt("id_fabricante"), rs.getString("nome"), rs.getString("cnpj"), rs.getString("endereco"), rs.getBoolean("recorrente"), rs.getInt("taxa_desconto"));
            fabricantes.add(fabricante);
        }
        rs.close();
        stmt.close();
        return fabricantes;
    }

}
