package model;

import java.sql.SQLException;
import dao.DAOCliente;

public class Cliente implements CRUD{
    private String rg;
    private int id;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, String endereco, String cep; String idade; String estado, Date dataDeNascimento, String rg, int id){
        super(nome, cpf, endereco, cep, idade, estado, dataDeNascimento);
        this.id = id;
        this.rg = rg;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

    


    //acesso DAO
    private DAOCliente dao = new DAOCliente();
    @Override
    public void salvar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
    }


    @Override
    public List<Object> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deletar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}