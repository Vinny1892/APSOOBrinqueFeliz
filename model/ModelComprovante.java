package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
//import dao.DAOComprovante;

public class ModelComprovante implements CRUD{

    private int id;    
    private int idVenda;
    private ModelCliente cliente;
    private ModelFuncionario funcionario;
    private Date data_venda;
    private String forma;
    private Double valorTotal;
    private ArrayList<ModelItemDeVenda> carrinho; 
    
    private static ArrayList<ModelComprovante> comrpovantes; 
    
    
    public ModelComprovante() {
    }

    //Com ID
    public ModelComprovante(int id, int idVenda, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, String forma, Double valorTotal, ArrayList<ModelItemDeVenda> carrinho) {
        this.id = id;
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.forma = forma;
        this.valorTotal = valorTotal;
        this.carrinho = carrinho;
    }

    
    //Sem ID
    public ModelComprovante(int idVenda, ModelCliente cliente, ModelFuncionario funcionario, Date data_venda, String forma, Double valorTotal, ArrayList<ModelItemDeVenda> carrinho) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.data_venda = data_venda;
        this.forma = forma;
        this.valorTotal = valorTotal;
        this.carrinho = carrinho;
        this.id = -1;
    }

    
    //acesso DAO
    //private DAOComprovante dao = new DAOComprovante();

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
    

    //////
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public ModelCliente getCliente() {
        return cliente;
    }

    public void setCliente(ModelCliente cliente) {
        this.cliente = cliente;
    }

    public ModelFuncionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ModelFuncionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getData_venda() {
        return data_venda;
    }

    public void setData_venda(Date data_venda) {
        this.data_venda = data_venda;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void setCarrinho(ArrayList<ModelItemDeVenda> carrinho) {
        this.carrinho = carrinho;
    }
    //Fim Getters e Setters

    
    
    ////
    public ArrayList<ModelItemDeVenda> getCarrinho() {
        return carrinho;
    }

    public void atualizarArrayCarrinho() throws SQLException{
        carrinho = (ArrayList<ModelItemDeVenda>)(ArrayList<?>) new dao.DAOComprovante().getAll(); 
    }
    
    //Aqui acho que não pode ser retornado ModelComprovante pq o ArrayList é do tipo ModelItemDeVenda, então ele só retornaria objetos desse tipo.
    public ModelItemDeVenda getByIdArray(int id) throws SQLException  {
        atualizarArrayCarrinho(); 

        // carrinho.forEach(c -> {
        //     if(c.getId() == id)
        //         return c;
        // });
        for(ModelItemDeVenda item : carrinho){
            if(item.getId() == id)
                return item;
        } 
        
        return null; 
        
        
    } 

    public ArrayList<ModelItemDeVenda> getAllArray()  {
        return carrinho;
    }    

}