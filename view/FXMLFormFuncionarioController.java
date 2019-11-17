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
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vinicius Espindola
 */
public class FXMLFormFuncionarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            BooleanBinding camposPreenchidos = textFieldNome.textProperty().isEmpty()
                .or(textFieldTelefone.textProperty().isEmpty())
                .or(textFieldEmail.textProperty().isEmpty())
                .or(textFieldDataContratacao.textProperty().isEmpty())
                .or(textFieldCelular.textProperty().isEmpty())
                .or(textfieldCPF.textProperty().isEmpty())
                .or(textFieldPassword.textProperty().isEmpty());
        buttonSalvar.disableProperty().bind(camposPreenchidos);
        inicializarComboBox();
        
        
    } 
    
    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonVoltar;

    @FXML
    private TextField textFieldNome;

    @FXML
    private ComboBox<String> comboBoxPermissao;

    @FXML
    private TextField textFieldCelular;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldTelefone;

    @FXML
    private TextField textFieldDataContratacao;

    @FXML
    private TextField textfieldCPF;
    
    @FXML
    private PasswordField textFieldPassword;
    
    private ObservableList<String> obsPermissoesComboBox;
    
    @FXML
    void btnSalvarAction(ActionEvent event) {

    }

    @FXML
    void btnVoltarAction(ActionEvent event) throws IOException {
        Parent adm = FXMLLoader.load(getClass().getResource("FXML4Funcionario.fxml"));
        Scene scene = new Scene(adm);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonVoltar.getScene().getWindow().hide();
    }


    
 public void inicializarComboBox() {
       ArrayList<String> permissoes = new ArrayList<String>();
        permissoes.add("Administrador");
        permissoes.add("Funcionario");

       obsPermissoesComboBox = FXCollections.observableArrayList(permissoes);
        comboBoxPermissao.setItems(obsPermissoesComboBox);
        comboBoxPermissao.getSelectionModel().select("Administrador");

    }
    
}
