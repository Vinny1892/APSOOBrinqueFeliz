package controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.ModelFormaDePagamento;
import model.ModelVenda;

/**
 *
 * @author kaio
 */
public class ControllerVenda {

    //SALVAR VENDA NO BANCO
    public static ArrayList<String> formasDePagamento() throws SQLException {
        return new ModelFormaDePagamento().getFormas();
    }

    public static int finalizarCompra(ModelVenda venda) throws SQLException {
        
        return new ModelVenda().salvar(venda);
    }
    
    public static ModelVenda getById(int idVenda){
        return null;
    }

}
