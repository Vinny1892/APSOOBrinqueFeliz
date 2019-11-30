
package model;

import java.sql.SQLException;
//import dao.DAOCliente;
import java.util.Date;

public class ModelCliente extends ModelPessoa {

    private String rg;
    private int id;

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

    @Override
    public String toString() {
        return getNome();
    }
    
    
}

