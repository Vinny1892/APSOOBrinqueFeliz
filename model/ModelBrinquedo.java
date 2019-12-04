
package model;

import dao.DAOBrinquedo;
import java.sql.SQLException;
///import dao.DAOBrinquedo;
import java.util.ArrayList;
import java.util.Objects;

public class ModelBrinquedo implements CRUD{
    
    //atributos
    private ModelCategoria categoria;
    private String nome;
    private Double preco;
    private ModelFabricante fabricante;
    private String descricao;
    private ModelFornecedor fornecedor;
    private int id;//o id vai ser o codigo de barras
    private static ArrayList<ModelBrinquedo> brinquedos; 

    
    public ModelBrinquedo() {
    }

    //Com ID
    public ModelBrinquedo(ModelCategoria categoria, String nome, Double preco, ModelFabricante fabricante, String descricao, ModelFornecedor fornecedor, int id) throws SQLException {
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
        this.fabricante = fabricante;
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.id = id; 
        
        
    } 

    //Sem ID
    public ModelBrinquedo(ModelCategoria categoria, String nome, Double preco, ModelFabricante fabricante, String descricao, ModelFornecedor fornecedor/*, DAOBrinquedo dao*/) throws SQLException {
        
        this(categoria, nome, preco, fabricante, descricao, fornecedor, -1); 
        
        
    } 



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ModelFabricante getFabricante() {
        return fabricante;
    }

    public void setFabricante(ModelFabricante fabricante) {
        this.fabricante = fabricante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ModelFornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(ModelFornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelCategoria getCategoria() {
		return categoria;
	}

	public void setCategoria(ModelCategoria categoria) {
		this.categoria = categoria;
    }
    //Fim Getters e Setters

	@Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ModelBrinquedo other = (ModelBrinquedo) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        if (!Objects.equals(this.preco, other.preco)) {
            return false;
        }
        if (!Objects.equals(this.fabricante, other.fabricante)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        return true;
    } 


    //
    public void atualizarArrayBrinquedos() throws SQLException{
        brinquedos = (ArrayList<ModelBrinquedo>)(ArrayList<?>) dao.getAll(); 
    }
    
    public ArrayList<ModelBrinquedo> getBrinquedo() {
        return brinquedos; 
    }


    public ModelBrinquedo getByIdArray(int id) throws SQLException  {
        //atualizarArrayBrinquedos(); 
        
        //return brinquedo.get(brinquedo.indexOf(Object.getId() == id));
        // brinquedo.forEach(b -> {
        //     if(b.getId() == id)
        //         return b;
        // });
        for(ModelBrinquedo b : brinquedos){
            if(b.getId() == id)
                return b;
        } 
        
        return null; 
        
        

    }


    public ArrayList<ModelBrinquedo> getAllArray()  {
        return brinquedos;
    }


    //acesso DAO
    private DAOBrinquedo dao = new DAOBrinquedo();

    @Override
    public int salvar(Object obj) throws SQLException { 
        return new DAOBrinquedo().salvar(this); 
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean atualizar(Object obj) throws SQLException { 
        return new DAOBrinquedo().atualizar(this); 
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deletar(int id) throws SQLException { 
        return new DAOBrinquedo().deletar(id); 
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getById(int id) throws SQLException { 
        return new DAOBrinquedo().getById(id); 
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Object> getAll() throws SQLException { 
        return new DAOBrinquedo().getAll(); 
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    } 
    

} 

