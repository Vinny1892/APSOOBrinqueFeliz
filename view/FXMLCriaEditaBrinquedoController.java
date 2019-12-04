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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLCriaEditaBrinquedoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldPreco;

    @FXML
    private ComboBox<?> comboBoxFabricante;

    @FXML
    private ComboBox<?> comboBoxFornecedor;

    @FXML
    private ComboBox<?> comboBoxCategoria;

    @FXML
    private TextArea textAreaDescricao;

    @FXML
    private Button buttonSalvar;

    @FXML
    void onActionButtonSalvar(ActionEvent event) {

    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {

    }
}
