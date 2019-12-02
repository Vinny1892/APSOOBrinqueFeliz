/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Vinny
 */
public class FXMLFormBrinquedoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
        @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldPreco;

    @FXML
    private ComboBox<?> comboBoxFabricantes;

    @FXML
    private ComboBox<?> comboBoxCategoria;

    @FXML
    private TextArea textAreaDesc;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    @FXML
    void onActionbtnSalvar(ActionEvent event) {

    }

    @FXML
    void onActionbtnVoltar(ActionEvent event) {

    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
