package model;

import java.sql.SQLException;
import dao.DAOCliente;

public class Cliente{
    private String rg;

    public Cliente(String nome, String cpf, String endereco, String cep; String idade; String estado, Date dataDeNascimento){
        super(nome, cpf, endereco, cep, idade, estado, dataDeNascimento);
    }

	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

    


    //acesso DAO
    @Override
    public void salvar() throws SQLException {
        daoEstoque.salvar(this);
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