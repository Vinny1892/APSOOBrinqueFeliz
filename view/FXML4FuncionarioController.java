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
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
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
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
        try {
            inicializarFuncionarios();
                  tableViewFuncionario.getSelectionModel().selectedItemProperty().addListener((obs, oldValue, newValue) -> {
            buttonEditar.setDisable(false);
            buttonExcluir.setDisable(false);
        });
        } catch (SQLException ex) {
            Logger.getLogger(FXML4FuncionarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
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
    private TableColumn<ModelFuncionario, Date> columnDataContracao;

    @FXML
    private TableColumn<ModelFuncionario, Boolean> columnPermissao;
    
    
      @FXML
    void onActionbuttonCriar(ActionEvent event) throws IOException {
        FXMLLoader loader= new FXMLLoader(getClass().getResource("FXMLFormFuncionario10.fxml"));
        FXMLFormFuncionarioController telaFormFuncionario = new FXMLFormFuncionarioController();
        loader.setController(telaFormFuncionario);
        Parent root =  loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        //buttonCriar.getScene().getWindow().hide();
    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) throws IOException {
        ModelFuncionario funcionario = tableViewFuncionario.getSelectionModel().getSelectedItem();
        FXMLFormFuncionarioController telaFormFuncionario = new FXMLFormFuncionarioController();
        telaFormFuncionario.setFuncionarioAtualizar(funcionario);
        //passar o funcionario para  a proxima tela form, e preencher a tela com esses dados;
//        Parent formFuncionario = FXMLLoader.load(getClass().getResource("FXMLFormFuncionario10.fxml"));
//        Scene scene = new Scene(formFuncionario);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
//        //buttonCriar.getScene().getWindow().hide();
        FXMLLoader loader= new FXMLLoader(getClass().getResource("FXMLFormFuncionario10.fxml"));
        loader.setController(telaFormFuncionario);
        Parent root =  loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void onActionbuttonExcluir(ActionEvent event) throws SQLException {
        ModelFuncionario funcionario = tableViewFuncionario.getSelectionModel().getSelectedItem();
        if (!controller.ControllerFuncionario.excluirFuncionario(funcionario)) {
            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("Funcionario");
            dialogoInfo.setHeaderText("Excluir Funcionario");
            dialogoInfo.setContentText("Não foi possivel excluir o funcionario.");
            dialogoInfo.showAndWait();
        }
        tableViewFuncionario.getItems().remove(funcionario);
     
    }
    
    @FXML
    void onActionButtonVoltar(ActionEvent event) throws IOException {
//        Parent adm = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
//        Scene scene = new Scene(adm);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
        buttonCriar.getScene().getWindow().hide();
    }
    
    
    private ArrayList<ModelFuncionario> funcionarios;
    private ObservableList<ModelFuncionario> obsFuncionarios;
    
    
    private void inicializarFuncionarios() throws SQLException {
        funcionarios = controller.ControllerFuncionario.todosFuncionarios();
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCelular.setCellValueFactory(new PropertyValueFactory<>("telefoneCelular"));
        columnDataContracao.setCellValueFactory(new PropertyValueFactory<>("dataDeContratacao"));
        columnPermissao.setCellValueFactory(new PropertyValueFactory<>("isADM"));
        columnTelefone.setCellValueFactory(new PropertyValueFactory<>("telefoneResidencial"));
        comumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        obsFuncionarios = FXCollections.observableArrayList(funcionarios);
        tableViewFuncionario.setItems(obsFuncionarios);
    }
    
   
  
 


}
