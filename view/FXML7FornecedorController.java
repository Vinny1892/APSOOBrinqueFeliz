/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
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
    private AnchorPane tableViewFornecedor;

    @FXML
    private TableColumn<?, ?> columnNome;

    @FXML
    private TableColumn<?, ?> columnCNPJ;

    @FXML
    private TableColumn<?, ?> columnEndereco;

    @FXML
    private TableColumn<?, ?> columnCidade;

    @FXML
    private TableColumn<?, ?> columnEstado;

    @FXML
    private TableColumn<?, ?> columnTelefone;

    @FXML
    private TableColumn<?, ?> columnEMail;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonCriar;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;
    
    private ArrayList<ModelFornecedor> fornecedores;

    @FXML
    void onActionButtonCriar(ActionEvent event) throws IOException {
        Parent categoria = FXMLLoader.load(getClass().getResource("FXMLFormFornecedor.fxml"));
        Scene scene = new Scene(categoria);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //buttonCriar.getScene().getWindow().hide();
        inicilizarTableForncedor();
    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) {

    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) {
        Parent categoria = FXMLLoader.load(getClass().getResource("FXMLFormFornecedor.fxml"));
        Scene scene = new Scene(categoria);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //buttonCriar.getScene().getWindow().hide();
        inicilizarTableForncedor();
    }

    @FXML
    void onActionbuttonVoltar(ActionEvent event) throws IOException {
        buttonCriar.getScene().getWindow().hide();
    }
    
    void inicilizarTableForncedor(){
        fornecedores = controller.ControllerFornecedor.todosFornecedores();
    }
    
}
