
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOItemDeVenda;

public class ModelItemDeVenda implements CRUD{
    
    //Kaio: Acho que nao faz sentido essa classe ter o atributo static ArrayList<ModelItemDeVenda>, se tiver outra opinião, avise pf, vai que estou errado.
    //Ao meu entender, não vale a pena manter em memoria esse Array,
    //melhor deixar no BD, quando precisar buscamos

    //Yan: Ok
    private ModelBrinquedo brinquedo;
    private int quantidade;
    private int id;
    

    public ModelItemDeVenda() {
    }

    //Com ID
    public ModelItemDeVenda(ModelBrinquedo brinquedo, int quantidade, int id) {
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
        this.id = id;
    }

    //Sem ID
    public ModelItemDeVenda(ModelBrinquedo brinquedo, int quantidade) {
        this.brinquedo = brinquedo;
        this.quantidade = quantidade;
        this.id = -1;
    }



    // por enquanto to achando que essa classe não pode ter um construtor sem int id_ModelItemEstoque
    // pois ela é gerada a partir de ModelItemDeVenda
    

    public ModelBrinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(ModelBrinquedo produto) {
        this.brinquedo = produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public double getValor(){
        return getQuantidade() * getBrinquedo().getPreco();
    }

    //acesso DAO
    //private DAOItemDeVenda dao = new DAOItemDeVenda();

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


    
}