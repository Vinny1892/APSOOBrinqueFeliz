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
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML1FuncionarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> columnNome;

    @FXML
    private TableColumn<?, ?> columnProduto;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonCriar;

    @FXML
    private TextField textFielNome;

    @FXML
    private Button buttonEditarProdito;

    @FXML
    void onActionButtonVoltar(ActionEvent event) {

    }

}
