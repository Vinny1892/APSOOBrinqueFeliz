package model;

import java.sql.SQLException;
//import dao.DAOFuncionario;
import java.util.ArrayList;
import java.util.Date;
import java.util.TreeMap;

public class ModelFuncionario extends ModelPessoa implements CRUD{
    //private String matricula;
    //private String nome;
    private int id;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;
    private Date dataDeContratacao;
    //private enum tipoDePermissao;
    private boolean isADM;
    private String senha;


    //private static ArrayList<ModelFuncionario> funcionarios;
    //private static Map<Integer, ModelFuncionario> funcionarios;

    //Commom employee constructor

    
    public ModelFuncionario(){
    
    }

    //Com ID
    public ModelFuncionario(int id, String telefoneResidencial, String telefoneCelular, String email, Date dataDeContratacao, boolean isADM, String senha) {
        this.id = id;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.dataDeContratacao = dataDeContratacao;
        this.isADM = isADM;
        this.senha = senha;
    }


    //Sem ID
    public ModelFuncionario(String telefoneResidencial, String telefoneCelular, String email, Date dataDeContratacao, boolean isADM, String senha) {
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.dataDeContratacao = dataDeContratacao;
        this.isADM = isADM;
        this.senha = senha;
    }



    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
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

    public boolean isIsADM() {
        return this.isADM;
    }

    public boolean getIsADM() {
        return this.isADM;
    }

    public void setIsADM(boolean isADM) {
        this.isADM = isADM;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    
    public Double consultarPreco(long codigoDeBarras){
        return 0.0;
    }
    
    public void cadastrarCliente(ModelCliente cliente){

    }

    public void excluirCliente(ModelCliente cliente){

    }

     //private DAOFuncionario dao = new DAOFuncionario();
    public TreeMap<String, String> loginFuncionario(String cpf, String password){
        //TreeMap é um MAP, precisa de dois argumentos... <Key, Value>
        return null;
    }

    public void atualizarCliente(ModelCliente cliente){

    }

    public ModelCliente consultarCliente(String rg){
        return null;
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