
package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOFormaDePagamento;

public class ModelFormaDePagamento implements CRUD{
    private int ID;
    private String nome;//nome da forma de pagamento
    
    
    /*
    talvez precise colocar os atributos de alguma forma de pagamento, 
    por exemplo,
    private int numerocartao;
    sei la, 
    algo assim,
    talvez a gente precise disso,
    TALVEZ
    */

    public ModelFormaDePagamento() {
    }

    public ModelFormaDePagamento(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public ModelFormaDePagamento(String nome) {
        this.nome = nome;
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    //acesso DAO
//    private DAOCategoria dao = new DAOCategoria();

    
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