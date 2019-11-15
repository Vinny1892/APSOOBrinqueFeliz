package model;

import java.sql.SQLException;
import dao.DAOFornecedor;


public class ModelFornecedor implements CRUD{
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private List<ModelFabricante> fabricantes;
    private int id;


    public ModelFornecedor() {
    }

    public ModelFornecedor(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String cidade, String estado, String telefone, String email, List<ModelFabricante> fabricantes, int id) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.fabricantes = fabricantes;
        this.id = id;
    }


    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
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

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<ModelFabricante> getFabricantes() {
        return this.fabricantes;
    }

    public void setFabricantes(List<ModelFabricante> fabricantes) {
        this.fabricantes = fabricantes;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    



    public void criar(Object obj){

    }

    public void atualizar(Object obj){

    }

    public void excluir(Object obj){

    }

    public void buscar(Object obj){

    }


    //acesso DAO
    private DAOFornecedor dao = new DAOFornecedor();
    @Override
    public void salvar() throws SQLException {
        throw new UnsupportedOperationException("Not supported yet.");
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