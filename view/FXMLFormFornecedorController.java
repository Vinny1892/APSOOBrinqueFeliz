/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Vinny
 */
public class FXMLFormFornecedorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    
    
    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldRazaoSocial;

    @FXML
    private TextField textFieldCidade;

    @FXML
    private TextField textFieldEstado;

    @FXML
    private TextField textFieldCNPJ;

    @FXML
    private TextField textFieldNomeFantasia;

    @FXML
    private TextField textFieldEndereco;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void onActionbtnSalvar(ActionEvent event) {

    }

    @FXML
    void onActionbtnVoltar(ActionEvent event) throws IOException {
        Parent fornecedor = FXMLLoader.load(getClass().getResource("FXML7Fornecedor.fxml"));
        Scene scene = new Scene(fornecedor);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        btnVoltar.getScene().getWindow().hide();

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
