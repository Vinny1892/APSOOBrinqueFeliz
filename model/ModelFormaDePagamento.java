package model;

import java.sql.SQLException;
import dao.DAOFormaDePagamento;

public class ModelFormaDePagamento{
    private TIPO_PAGAMENTO tipoPagamento;
    //private Cartao cartao;
    //private Cheque cheque;


    public ModelFormaDePagamento(TIPO_PAGAMENTO tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public ModelFormaDePagamento() {
    }

    public TIPO_PAGAMENTO getTipoPagamento() {
        return this.tipoPagamento;
    }

    public void setTipoPagamento(TIPO_PAGAMENTO tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public void gerarComprovante(){
        
    }

}