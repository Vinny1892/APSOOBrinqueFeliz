/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ModelFuncionario;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML4FuncionarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }


    @FXML
    private Button buttonVoltar;
            
            
    @FXML
    private Button buttonEditar;
    
    
    @FXML
    private Button buttonExcluir;
    
    @FXML
    private Button buttonCriar;



    @FXML
    private TableView<ModelFuncionario> tableViewFuncionario;

    @FXML
    private TableColumn<ModelFuncionario, String> columnNome;

    @FXML
    private TableColumn<ModelFuncionario, String> columnTelefone;

    @FXML
    private TableColumn<ModelFuncionario, String> columnCelular;

    @FXML
    private TableColumn<ModelFuncionario, String> comumnEmail;

    @FXML
    private TableColumn<ModelFuncionario, String> columnDataContracao;

    @FXML
    private TableColumn<ModelFuncionario, String> columnPermissao;
    
    
      @FXML
    void onActionbuttonCriar(ActionEvent event) throws IOException {
        Parent formFuncionario = FXMLLoader.load(getClass().getResource("FXMLFormFuncionario10.fxml"));
        Scene scene = new Scene(formFuncionario);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonCriar.getScene().getWindow().hide();
    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) {

    }

    @FXML
    void onActionbuttonExcluir(ActionEvent event) {
        

    }
    
    @FXML
    void onActionButtonVoltar(ActionEvent event) throws IOException {
        Parent adm = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
        Scene scene = new Scene(adm);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonCriar.getScene().getWindow().hide();
    }
    
   
  
 


}
