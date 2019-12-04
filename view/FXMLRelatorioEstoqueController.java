/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import static controller.ControllerItemDeEstoque.todosItensDeEstoque;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.ModelBrinquedo;
import model.ModelItemDeEstoque;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLRelatorioEstoqueController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private TableView<ModelItemDeEstoque> tableViewBrinquedosDaLoja;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnNome;

    @FXML
    private TableColumn<ModelBrinquedo, Integer> columnCodigo;

    @FXML
    private TableColumn<ModelBrinquedo, Double> columnPreco;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnCatetoria;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnFabricante;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnDescricao;

    @FXML
    private TableColumn<ModelItemDeEstoque, Integer> quantidade;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;



    @FXML
    private Button buttonVoltar;

    private ArrayList<ModelItemDeEstoque> itensDeEstoque;
    private ObservableList<ModelItemDeEstoque> obsTableItensDeEstoque;
    
     @FXML
    private Button buttonComprarBrinquedo;
     
     
     @FXML
    void onActionbuttonComprarBrinquedo(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent p = FXMLLoader.load(getClass().getResource("FXMLFormItemEstoque.fxml"));
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.show();
    }

   

    @FXML
    void onActionButtonExcluir(ActionEvent event) throws SQLException {
        ModelItemDeEstoque item = tableViewBrinquedosDaLoja.getSelectionModel().getSelectedItem();
        controller.ControllerItemDeEstoque.excluirItemNoEstoque(item);
        inicializarTabelaItensEstoque();
    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) throws IOException {
//        Stage stage = new Stage();
//        Parent p = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
//        Scene scene = new Scene(p);
//        stage.setScene(scene);
//        stage.show();
        buttonVoltar.getScene().getWindow().hide();
    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) throws IOException {
        ModelItemDeEstoque item = tableViewBrinquedosDaLoja.getSelectionModel().getSelectedItem();
        //passa para a proxima tela o item a ser editado;
        Stage stage = new Stage();
        Parent p = FXMLLoader.load(getClass().getResource("FXMLFormItemEstoque.fxml"));
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.show();
    }

    private void inicializarTabelaItensEstoque() throws SQLException {
        itensDeEstoque = todosItensDeEstoque();
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCodigo.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        columnFabricante.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        columnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        quantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        obsTableItensDeEstoque = FXCollections.observableArrayList(itensDeEstoque);
        tableViewBrinquedosDaLoja.setItems(obsTableItensDeEstoque);
    }

}
