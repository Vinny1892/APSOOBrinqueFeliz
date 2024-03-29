package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOPessoa;
import java.util.Date;

public abstract class ModelPessoa{
    private String nome;
    private String cpf;
    private Date dataDeNascimento;
    private String endereco;
    private String cep;
    private String cidade;
	private String estado;
	private int id;


	public ModelPessoa() {
	}
	
	//Com ID
	public ModelPessoa(String nome, String cpf, Date dataDeNascimento, String endereco, String cep, String cidade, String estado, int id) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.id = id;
	}


	//Sem ID
	public ModelPessoa(String nome, String cpf, Date dataDeNascimento, String endereco, String cep, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
		this.id = -1;
	}



	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Date getDataDeNascimento() {
		return this.dataDeNascimento;
	}

	public void setDataDeNascimento(Date dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	} 
        
        @Override 
    public String toString() { 
        return getNome(); 
    } 
    

} 

