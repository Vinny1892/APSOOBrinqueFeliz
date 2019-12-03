
package model;

import dao.DAOFornecedor;
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
    private static ArrayList<ModelFornecedor> fornecedores; 
    private int id; 
    
    private DAOFornecedor dao; 


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
        
        this.dao = new DAOFornecedor(); 
        
        
    } 

    //Sem ID
    public ModelFornecedor(String cnpj, String nomeFantasia, String razaoSocial, String endereco, String cidade, String estado, String telefone, String email) {
        
        this(cnpj, nomeFantasia, razaoSocial, endereco, cidade, estado, telefone, email, -1); 
        
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
public boolean salvarNoArrayList(ModelFornecedor fornecedor){
        fornecedores.add(fornecedor);
        return true; 
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
        fornecedores = (ArrayList<ModelFornecedor>)(ArrayList<?>) dao.getAll();
    }
    
    public ArrayList<ModelFornecedor> getFornecedor() {
        return fornecedores;
    }
    
    public ModelFornecedor getByIdArray(int id) throws SQLException  {
        atualizarArrayFornecedor();
        
        //return fornecedor.get(fornecedor.indexOf(Object.getId() == id));
        // fornecedor.forEach(f -> {
        //     if(f.getId() == id)
        //         return f;
        // });
        for(ModelFornecedor f : fornecedores){
            if(f.getId() == id)
                return f;
        } 
        
        return null; 
        
        
    } 

    public ArrayList<ModelFornecedor> getAllArray()  {
        return fornecedores; 
    } 


} 

