/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.ModelFormaDePagamento;

/**
 *
 * @author kaio
 */
public class ControllerVenda {
//    public static  (){
//    
//    }
    
    
    public ArrayList<ModelFormaDePagamento> formasDePagamento(){
        ArrayList<ModelFormaDePagamento> formas = new ArrayList<>();
        //se tiver no BD essas forma de pagamento, é só chamar o DAO que pega
        formas.add(new ModelFormaDePagamento("vista"));
        formas.add(new ModelFormaDePagamento("cartão"));
        formas.add(new ModelFormaDePagamento("boleto"));
        formas.add(new ModelFormaDePagamento("cheque"));
        return formas;
    }
}
