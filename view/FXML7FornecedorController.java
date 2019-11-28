/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

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
    private Button buttonExcluir;

    @FXML
    private Button buttonEditar;
    
    @FXML
    private TextField textFieldCNPJ;

    @FXML
    private TextField textFieldCidade;

    @FXML
    private TextField textFieldEstado;

    @FXML
    private TextField textFieldEMail;

    @FXML
    private TextField textFieldNomeFantasia;

    @FXML
    private TextField textFieldRazaoSocial;

    @FXML
    private TextField textFieldEndereco;

    @FXML
    private TextField textFieldTelefone;

    @FXML
    void onActionButtonCriar(ActionEvent event) {

    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) {

    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) {

    }

    @FXML
    void onActionbuttonVoltar(ActionEvent event) {

    }
    
}
