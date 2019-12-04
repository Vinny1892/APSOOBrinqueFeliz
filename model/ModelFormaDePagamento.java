package model;

import java.sql.SQLException;
import java.util.ArrayList;
//import dao.DAOFormaDePagamento;

public class ModelFormaDePagamento implements CRUD {

    // private int ID;
    //private String nome;//nome da forma de pagamento
    private ArrayList<String> formas = new ArrayList<>();

    public ModelFormaDePagamento() {
        formas.add("Dinheiro");
        formas.add("Cartão");
        formas.add("Cheque");
    }

    public ArrayList<String> getFormas() {
        return formas;
    }

    public void setFormas(ArrayList<String> formas) {
        this.formas = formas;
    }

    //acesso DAO
//    private DAOCategoria dao = new DAOCategoria();
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

