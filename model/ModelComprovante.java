package model;

import java.sql.SQLException;
import dao.DAOComprovante;
import java.util.List;

public class ModelComprovante implements CRUD{
    
    //atributos
    private Cliente cliente;
    private Funcionario funcionario;
    private FormaDePagamento formaDePagamento;
    private Venda venda;
    //construtor

    public ModelComprovante() {
    }



    //getter
   public Cliente getCliente(){
       return this.cliente;
   }

   public Funcionario getFuncionario(){
       return this.funcionario;
   }

   public FormaDePagamento getFormaDePagamento(){
       return this.formaDePagamento;
   }

   public Venda getVenda(){
       return this.venda;
   }

   //setter

   public void 



    public void gerarRelatorioDeVendaPorDia(){

    }

    public void gerarComprovanteVenda(){

    }

    public void venderBrinquedo(){

    }

    /*public void inserir(ItemDeVenda item){
        //Isso aqui n seria a mesma coisa que setItemDeVEnda?
    }*/
    

    @Override
    public void atualizar(ItemDeVenda item){

    }

    public Object buscar(Object obj){

    }

    public void excluir(Object obj){
        
    }





    //acesso DAO
    @Override
    public void salvar() throws SQLException {
        daoEstoque.salvar(this);
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