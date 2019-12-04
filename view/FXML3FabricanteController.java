/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.ModelFabricante;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML3FabricanteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private TableView<ModelFabricante> tableView;

    @FXML
    private TableColumn<ModelFabricante, String> columnNome;

    @FXML
    private TableColumn<ModelFabricante, String> columnCNPJ;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonCriar;

    @FXML
    private TextField textFielNome;

    @FXML
    private Button buttonEditarProdito;

    @FXML
    void onActionButtonCriar(ActionEvent event) {

    }

    @FXML
    void onActionButtonEditar(ActionEvent event) {

    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) {

    }

    @FXML
    void onActionButtonSalvar(ActionEvent event) {

    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {

    }
    
    
    
}
