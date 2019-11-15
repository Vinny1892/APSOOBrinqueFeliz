package model;

import java.sql.SQLException;
import dao.DAOAdministrador;

public class ModelAdministrador extends ModelFuncionario implements CRUD{
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




    //acesso DAO
    private DAOAdministrador dao = new DAOAdministrador();
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