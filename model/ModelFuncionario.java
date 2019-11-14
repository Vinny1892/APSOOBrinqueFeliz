package model;

import java.sql.SQLException;
import dao.DAOFuncionario;

public class ModelFuncionario{
    private String matricula;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;
    private Date dataDeContratacao;
    //private enum tipoDePermissao;
    private String login;
    private String senha;


    public ModelFuncionario(String matricula, String telefoneResidencial, String telefoneCelular, String email, Date dataDeContratacao, String login, String senha) {
        this.matricula = matricula;
        this.telefoneResidencial = telefoneResidencial;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
        this.dataDeContratacao = dataDeContratacao;
        this.login = login;
        this.senha = senha;
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


    public Double consultaPreco(long codigoDeBarras){

    }

    public void cadastrarCliente(ModelCliente cliente){

    }

    public void excluircliente(ModelCliente cliente){

    }

    public void atualizarCliente(ModelCliente cliente){

    }

    public ModelCliente consultaCliente(String rg){
        
    }
}