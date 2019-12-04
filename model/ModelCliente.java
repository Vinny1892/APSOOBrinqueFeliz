
package model;

import dao.DAOCliente;
import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOCliente;
import java.util.Date;

public class ModelCliente extends ModelPessoa implements CRUD{

    private String rg;
    private int id;
    private static ArrayList<ModelCliente> clientes; 
    
    private DAOCliente dao = new DAOCliente(); 
    

    //Com ID
    public ModelCliente(String nome, String cpf, String endereco, String cep, String cidade, String estado, Date dataDeNascimento, String rg, int id) throws SQLException {
        super(nome, cpf, dataDeNascimento, endereco, cep, cidade, estado, id);
        this.id = id;
        this.rg = rg; 
        
        
    } 

    //Sem ID
    public ModelCliente(String nome, String cpf, String endereco, String cep, String cidade, String estado, Date dataDeNascimento, String rg) throws SQLException {
        super(nome, cpf, dataDeNascimento, endereco, cep, cidade, estado);
        this.rg = rg;
        this.id = -1; 
        
        
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
        return dao.salvar(obj); // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        clientes = (ArrayList<ModelCliente>)(ArrayList<?>) new dao.DAOCliente().getAll(); 
    }
    

    public ArrayList<ModelCliente> getCliente() {
        return clientes; 
    }
    

    public ModelCliente getByIdArray(int id) throws SQLException  {
        atualizarArrayCliente();

        //return cliente.get(cliente.indexOf(Object.getId() == id));
        // this.cliente.forEach(c -> {
        //     if(c.getId() == id)
        //         return c;
        // });

        for(ModelCliente c : clientes){
            if(c.getId() == id)
                return c;
        } 
        
        return null; 
        
        
    } 

    public ArrayList<ModelCliente> getAllArray()  {
        return clientes; 
    }    

}

