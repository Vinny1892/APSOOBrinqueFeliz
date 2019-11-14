package model;

import java.sql.SQLException;
import dao.DAOFornecedor;


public class ModelFornecedor{
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private List<ModelFabricante> fabricantes;


    public ModelFornecedor(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String cidade, String estado, String telefone, String email, List<ModelFabricante> fabricantes) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.fabricantes = fabricantes;
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
        this.fabricantes.add(fabricantes);
    }

    public void criar(Object obj){

    }

    public void atualizar(Object obj){

    }

    public void excluir(Object obj){

    }

    public void buscar(Object obj){

    }
}