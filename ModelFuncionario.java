package model;

import java.sql.SQLException;
import dao.DAOFuncionario;
import java.util.Date;

public class ModelFuncionario implements CRUD{
    private String matricula;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;
    private Date dataDeContratacao;
    //private enum tipoDePermissao;
    private String login;
    private String senha;
    private boolean adm = false;
    private int id;

    //Commom employee constructor
/*
    public ModelFuncionario(String matricula, String telefoneResidencial, String telefoneCelular, String email, Date dataDeContratacao, String login, String senha, int id) {
        this.matricula = matricula;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.dataDeContratacao = dataDeContratacao;
        this.login = login;
        this.senha = senha;
	this.id = id;
    }
*/
    
    public ModelFuncionario(){}


    //
    public ModelFuncionario(String matricula, String telefoneResidencial, String telefoneCelular, String email, Date dataDeContratacao, String login, String senha, boolean adm, int id) {
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

    public Double consultaPreco(long codigoDeBarras){

    }
    
    public boolean isADM(){
	return this.adm;
    }
    
    public void cadastrarCliente(ModelCliente cliente){

    }

    public void excluircliente(ModelCliente cliente){

    }

    public void atualizarCliente(ModelCliente cliente){

    }

    public ModelCliente consultaCliente(String rg){
        
    }




    //CRUD Methods

    private DAOFuncionario dao = new DAOFuncionario();
    @Override
    public void salvar() throws SQLException{
        dao.salvar(this);
    }

    @Override
    public void atualizar() throws SQLException{
        dao.atualizar(this);
    }

    @Override
    public void deletar() throws SQLException{
        dao.deletar(this);
    }

    @Override
    public Object getById() throws SQLException{
        dao.getById(this);
    }

    //public Object getAllById(int id) throws SQLException;//retorna Object
    //public Object getById(int id, int id) throws SQLException ;
    @Override
    public List<Object> getAll() throws SQLException{
        dao.getAll(this);
    }// pega tudo de uma tabela

}