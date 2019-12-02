
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOFornecedor;


public class ModelFornecedor implements CRUD{
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String endereco;
    private String cidade;
    private String estado;
    private String telefone;
    private String email;
    private ArrayList<ModelFornecedor> fornecedor;
    private int id;


    public ModelFornecedor() {
    }

    //Com ID
    public ModelFornecedor(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String cidade, String estado, String telefone, String email, int id) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
        this.id = id;
    }

    //Sem ID
    public ModelFornecedor(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String cidade, String estado, String telefone, String email) {
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.email = email;
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

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
    //Fim Getters e Setters

    //acesso DAO
//    private DAOFornecedor dao = new DAOFornecedor();

    @Override
    public int salvar(Object obj) throws SQLException {
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
  

    //
    public void atualizarArrayFornecedor() throws SQLException{
        fornecedor = (ArrayList<ModelFornecedor>)(ArrayList<?>) dao.getAll();
    }
    
    public ArrayList<ModelFornecedor> getFornecedor() {
        return fornecedor;
    }
    
    public ModelFornecedor getByIdArray(int id)  {
        atualizarArrayFornecedor();
        
        //return fornecedor.get(fornecedor.indexOf(Object.getId() == id));
        // fornecedor.forEach(f -> {
        //     if(f.getId() == id)
        //         return f;
        // });
        for(ModelFornecedor f : fornecedor){
            if(f.getId() == id)
                return f;
        }
    }

    public ArrayList<ModelFornecedor> getAllArray()  {
        return fornecedor;
    } 


}