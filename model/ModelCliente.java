package model;

import java.sql.SQLException;
//import dao.DAOCliente;

public class ModelCliente extends ModelPessoa {

    private String rg;
    private int id;

    //Com ID
    public ModelCliente(String nome, String cpf, String endereco, String cep, String cidade, String estado, /*Date dataDeNascimento, String rg,*/ int id) {
        super(nome, cpf, endereco, cep, cidade, estado, id/*, dataDeNascimento*/);
        this.id = id;
        //this.rg = rg;
    }

    //Sem ID
    public ModelCliente(String rg) {
        //this.rg = rg;
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
}
