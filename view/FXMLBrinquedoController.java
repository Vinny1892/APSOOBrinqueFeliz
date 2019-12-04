/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import model.ModelCategoria;
import model.ModelFabricante;
/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLBrinquedoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            // TODO
//            inicializarTabelaBrinquedo();
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLBrinquedoController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }   
    
    @FXML
    private TableView<ModelBrinquedo> tableViewBrinquedo;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnNome;

    @FXML
    private TableColumn<ModelBrinquedo, Integer> columnCodigo;

    @FXML
    private TableColumn<ModelBrinquedo, Double> columnPreco;

    @FXML
    private TableColumn<ModelCategoria, String> columnCategoria;

    @FXML
    private TableColumn<ModelFabricante, String> columnFabricante;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnDescricao;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonCriar;

    @FXML
    private Button buttonVoltar;
     @FXML
    void onActionbuttonCriar(ActionEvent event) throws IOException {
        //TO DO
        Parent categoria = FXMLLoader.load(getClass().getResource("FXMLFormBrinquedo.fxml"));
        Scene scene = new Scene(categoria);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonCriar.getScene();
    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) throws IOException {
        //passa pra proxima tela o obj brinquedo;
        // TODO
        Parent categoria = FXMLLoader.load(getClass().getResource("FXMLFormBrinquedo.fxml"));
        Scene scene = new Scene(categoria);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonEditar.getScene();
    }

    @FXML
    void onActionbuttonExcluir(ActionEvent event) throws SQLException {
        ModelBrinquedo brinquedo = tableViewBrinquedo.getSelectionModel().getSelectedItem();
        controller.ControllerBrinquedo.excluirBrinquedo(brinquedo);
        inicializarTabelaBrinquedo();
    }

    @FXML
    void onActionbuttonVoltar(ActionEvent event) {
        buttonVoltar.getScene().getWindow().hide();
        
    }
    
    private ArrayList<ModelBrinquedo> brinquedos;
    private ObservableList<ModelBrinquedo> obsBrinquedos;
    public void inicializarTabelaBrinquedo() throws SQLException{
        brinquedos = controller.ControllerBrinquedo.todosBrinquedos();
        columnCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        columnCodigo.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        columnFabricante.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        obsBrinquedos = FXCollections.observableArrayList(brinquedos);
    }

}
