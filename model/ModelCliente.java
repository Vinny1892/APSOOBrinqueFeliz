
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOCliente;
import java.util.Date;

public class ModelCliente extends ModelPessoa implements CRUD{

    private String rg;
    private int id;
    private ArrayList<ModelCliente> cliente;

    //Com ID
    public ModelCliente(String nome, String cpf, String endereco, String cep, String cidade, String estado, Date dataDeNascimento, String rg, int id) {
        super(nome, cpf, dataDeNascimento, endereco, cep, cidade, estado, id);
        this.id = id;
        this.rg = rg;
    }

    //Sem ID
    public ModelCliente(String nome, String cpf, String endereco, String cep, String cidade, String estado, Date dataDeNascimento, String rg) {
        super(nome, cpf, dataDeNascimento, endereco, cep, cidade, estado);
        this.rg = rg;
    }


    public ModelCliente() {
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
    //Fim Getters Setters



    @Override
    public String toString() {
        return getNome();
    }

    @Override
    public int salvar(Object obj) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(Object obj) throws SQLException {
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

    @Override
    public ArrayList<Object> getAll() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    //


    public void atualizarArrayCliente() throws SQLException{
        cliente = (ArrayList<ModelCliente>)(ArrayList<?>) dao.getAll();
    }
    
    public ArrayList<ModelCliente> getClientes() {
        return cliente;
    }
    
    public ModelCliente getByIdArray(int id)  {
        atualizarArrayCliente();

        //return cliente.get(cliente.indexOf(Object.getId() == id));
        cliente.forEach(c -> {
            if(c.getId() == id)
                return c;
        });
    }
    public ArrayList<ModelCliente> getAllArray()  {
        return cliente;
    }    

}

