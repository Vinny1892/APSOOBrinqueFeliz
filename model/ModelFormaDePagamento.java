package model;

import java.sql.SQLException;
import dao.DAOFormaDePagamento;

public class ModelFormaDePagamento implements CRUD{
    private TIPO_PAGAMENTO tipoPagamento;
    private int ID;
    //private Cartao cartao;
    //private Cheque cheque;

    public ModelFormaDePagamento() {
    }


    public ModelFormaDePagamento(TIPO_PAGAMENTO tipoPagamento, int ID) {
        this.tipoPagamento = tipoPagamento;
        this.ID = ID;
    }


    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public TIPO_PAGAMENTO getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TIPO_PAGAMENTO tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void gerarComprovante(){
        
    }


    //acesso DAO
    private DAOCategoria dao = new DAOCategoria();
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