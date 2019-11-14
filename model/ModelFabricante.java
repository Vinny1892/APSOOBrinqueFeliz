package model;

import java.sql.SQLException;
import dao.DAOFabricante;
import java.util.List;
import java.util.ArrayList;

public class ModelFabricante{
    private String nome;
    private List<ModelBrinquedo> brinquedo = new ArrayList<>(); //Consta como produto de acordo com o diagrama


    public ModelFabricante(String nome, ModelBrinquedo brinquedo) {
        this.nome = nome;
        this.brinquedo = brinquedo;
    }

    public ModelFabricante() {
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ModelBrinquedo getBrinquedo() {
        return this.brinquedo;
    }

    public void setBrinquedo(ModelBrinquedo brinquedo) {
        this.brinquedo = brinquedo;
    }


    public void criar(Object obj){

    }

    public void atualizar(Object obj){

    }

    public void excluir(Object obj){

    }

    public void buscar(Object obj){

    }
}