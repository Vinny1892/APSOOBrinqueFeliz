package model;

import java.sql.SQLException;
import dao.DAOAdministrador;

public class ModelAdministrador extends ModelFuncionario{


    public ModelAdministrador() {
    }

    public Object informaDados(){

    }

    public void corrigirEstoque(){

    }

    public boolean validarAdministrador(){

    }

    public void delegarPermissao(ModelFuncionario funcionario){

    } 

    public void atualizaFornecedor(String cnpj){

    }

    public void removeFornecedor(String cnpj){

    }

    public void cadastraFornecedor(String cnpj){

    }

    public buscaFornecedor(String cnpj){

    }

    public void atualizaFuncionario(String cpf){

    }

    public void removeFuncionario(String cpf){

    }

    public void cadastraFuncionario(ModelFuncionario funcionario){

    }

    public void buscaFuncionario(String cnpj){

    }

    public void cadastraCategoria(ModelCategoria categoria){
        
    }

    public void removeCategoria(String nome){

    }

    public void atualizaCategoria(ModelCategoria categoria){

    }

    public ModelCategoria buscaCategoria(String nome){

    }

    public boolean revogarPermissao(ModelFuncionario funcionario){

    }

    public void cadastraBrinquedo(ModelBrinquedo brinquedo){

    }

    public void removeBrinquedo(int codigoDeBarra){

    }

    public void atualizaBrinquedo(int codigoDeBarra){

    }

    public ModelBrinquedo buscaBrinquedo(int codigoDeBarra){

    }

    public void gerarRelatorioDeEstatistica(Date dataInicio, Date dataFinal){

    }

    public void gerarRelatorioDeVenda(Date dataInicio, Date dataFinal){

    }

    public void gerarRelatorioDeVendaDiario(Date dataInicio, Date dataFinal){

    }
    
}