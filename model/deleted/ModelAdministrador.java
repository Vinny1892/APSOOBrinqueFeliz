package model;

import java.sql.SQLException;
//import dao.DAOAdministrador;

public class ModelAdministrador extends ModelFuncionario{
    private int id;


    public ModelAdministrador() {
    }

    public ModelAdministrador(int id) {
        this.id = id;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }







    public Object informaDados(){
        return null;
    }

    public void corrigirEstoque(){

    }

    public boolean validarAdministrador(){
        return false;
    }

    public boolean delegarPermissao(ModelFuncionario funcionario){
        return false;
    } 

    public boolean revogarPermissao(ModelFuncionario funcionario){
        return false;
    }

    
    //talvez nao seja aqui esse métodos
//    public void gerarRelatorioDeEstatistica(Date dataInicio, Date dataFinal){
//
//    }
//
//    public void gerarRelatorioDeVenda(Date dataInicio, Date dataFinal){
//
//    }
//
//    public void gerarRelatorioDeVendaDiario(Date dataInicio, Date dataFinal){
//
//    }
//acesso DAO
//    private DAOAdministrador dao = new DAOAdministrador();
    
}