package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;

import model.ModelCliente;

public class DAOCliente extends GenericDAO_CRUD {

    @Override
    public int salvar(Object object) throws SQLException {
        try {
            ModelCliente cliente = (ModelCliente) object;
            String insert = "INSERT INTO clientes (rg, nome, data_nascimento, endereco, cep, cidade, estado) VALUES(?, ?, ?, ?, ?, ?,?) ";
            save(insert, cliente.getRg(), cliente.getNome(), cliente.getDataDeNascimento(), cliente.getEndereco(), cliente.getCep(), cliente.getCidade(), cliente.getEstado());
            System.out.println("Metodo salvar DAOCliente realizado");
            return 1;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "DAOCliente Ja cadastrado no BD");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao inserir DAOCliente");
        }
        return -1;
    }

    @Override
    public boolean atualizar(Object object) throws SQLException {
        try {
            ModelCliente cliente = (ModelCliente) object;
            String update = "UPDATE clientes SET rg=?, nome=?, data_nascimento=?, "
                    + "endereco=?, cep=?, cidade=?, estado=? WHERE ID=?";
            update(update, cliente.getRg(), cliente.getNome(), cliente.getDataDeNascimento(),
                    cliente.getEndereco(), cliente.getCep(), cliente.getCidade(), cliente.getEstado());
            return true;
        } catch (MySQLIntegrityConstraintViolationException e) {
            JOptionPane.showMessageDialog(null, "Atributo atualizado invalido");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Cliente");
        }
        return false;
    }

    @Override
    public boolean deletar(int id) throws SQLException {
        try {
            String delete = "DELETE FROM clientes WHERE ID=?";

            delete(delete, id);
            System.out.println("Metodo deletar DAOCliente realizado");
            return true;
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(null, "Erro ao deletar DAOCliente");
        }
        return false;
    }

    public Object getById(int id) throws SQLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Object> getAll() throws SQLException {
        ArrayList<Object> clientes = new ArrayList<Object>();
        PreparedStatement stmt = (PreparedStatement) getConnection().prepareStatement("SELECT * FROM clientes");
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            ModelCliente cliente = new ModelCliente(rs.getString("nome"), rs.getString("cpf"), rs.getString("endereco"), rs.getString("cep"),
                    rs.getString("cidade"), rs.getString("estado"), rs.getDate("data_nascimento"),
                    rs.getString("rg"), rs.getInt("id_cliente"));

            clientes.add(cliente);

        }
        rs.close();
        stmt.close();
        return clientes;
    }

}
