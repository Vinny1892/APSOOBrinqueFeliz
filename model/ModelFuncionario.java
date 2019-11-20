package model;

import java.sql.SQLException;
//import dao.DAOFuncionario;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class ModelFuncionario extends ModelPessoa implements CRUD{
    private String matricula;
    private String nome;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;
    private Date dataDeContratacao;
    //private enum tipoDePermissao;
    private String login;
    private String senha;
    private boolean adm = false;
    private int id;
    private static ArrayList<ModelFuncionario> funcionarios;

    //Commom employee constructor

    public ModelFuncionario(String matricula, String telefoneResidencial, String telefoneCelular, String email, String dataDeContratacao, String login, String senha, String nome, String cpf, String endereco, String cep, String cidade, String estado) {
        super();
        this.matricula = matricula;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        //this.dataDeContratacao = (Date) dataDeContratacao;//converte aqui, ou só usa String, pq tanto a tela e BD facilita usar String
        this.login = login;
        this.senha = senha;
	//this.id = id; BD que cria o ID
    }
    
    public ModelFuncionario(){
    
    }


    //
    public ModelFuncionario(String matricula, String telefoneResidencial, String telefoneCelular, String email, Date dataDeContratacao, String login, String senha, boolean adm, int id, String nome, String cpf, String endereco, String cep, String cidade, String estado) {
        super();
        this.matricula = matricula;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.dataDeContratacao = dataDeContratacao;
        this.login = login;
        this.senha = senha;
        this.adm = adm;
        this.id = id;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefoneResidencial() {
        return this.telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() {
        return this.telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataDeContratacao() {
        return this.dataDeContratacao;
    }

    public void setDataDeContratacao(Date dataDeContratacao) {
        this.dataDeContratacao = dataDeContratacao;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getID(){
	return this.id;
    }
 
    public void setADM(Boolean adm){
    	this.adm = adm;
    }
    
    public boolean isADM(){
	return this.adm;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
     //private DAOFuncionario dao = new DAOFuncionario();
    public ModelFuncionario logarFuncionario(String user, String password){
        return null;
    }
    
    public Map<int, ModelFuncionario> loginFuncionario(String cpf, String senha){
        return Map;
    }
    //CRUD Methods
    @Override
    public boolean salvar(Object obj) throws SQLException {
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

}