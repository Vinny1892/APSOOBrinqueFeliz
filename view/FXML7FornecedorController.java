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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelFornecedor;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML7FornecedorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
   
    @FXML
    private TableView<ModelFornecedor> tableViewFornecedores;


    @FXML
    private TableColumn<ModelFornecedor, String> columnNome;

    @FXML
    private TableColumn<ModelFornecedor, String> columnCNPJ;

    @FXML
    private TableColumn<ModelFornecedor, String> columnEndereco;

    @FXML
    private TableColumn<ModelFornecedor, String> columnCidade;

    @FXML
    private TableColumn<ModelFornecedor, String> columnEstado;

    @FXML
    private TableColumn<ModelFornecedor, String> columnTelefone;

    @FXML
    private TableColumn<ModelFornecedor, String> columnEMail;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonCriar;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;
    
    private ArrayList<ModelFornecedor> fornecedores;
    private ObservableList<ModelFornecedor> obsTableFornecedores; 

    @FXML
    void onActionButtonCriar(ActionEvent event) throws IOException {
        Parent categoria = FXMLLoader.load(getClass().getResource("FXMLFormFornecedor.fxml"));
        Scene scene = new Scene(categoria);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        inicilizarTableForncedor();
    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) throws SQLException {
        ModelFornecedor fornecedor = tableViewFornecedores.getSelectionModel().getSelectedItem();
        controller.ControllerFornecedor.excluir(fornecedor);
    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) throws IOException {
        Parent categoria = FXMLLoader.load(getClass().getResource("FXMLFormFornecedor.fxml"));
        Scene scene = new Scene(categoria);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        inicilizarTableForncedor();
    }

    @FXML
    void onActionbuttonVoltar(ActionEvent event) throws IOException {
        buttonCriar.getScene().getWindow().hide();
    }
    
    void inicilizarTableForncedor(){
        fornecedores = controller.ControllerFornecedor.todosFornecedores();
        columnCNPJ.setCellValueFactory(new PropertyValueFactory<>("cnpj"));
        columnCidade.setCellValueFactory(new PropertyValueFactory<>("cidade"));
        columnEMail.setCellValueFactory(new PropertyValueFactory<>("email"));
        columnEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
        columnEstado.setCellValueFactory(new PropertyValueFactory<>("estado"));
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefone"));
        obsTableFornecedores = FXCollections.observableArrayList(fornecedores);
        tableViewFornecedores.setItems(obsTableFornecedores);
    }
    
}
