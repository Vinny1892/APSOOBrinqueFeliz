/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML9ClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @FXML
    private TableView<?> tableViewCliente;

    @FXML
    private TableColumn<?, ?> columnRG;

    @FXML
    private TableColumn<?, ?> columnID;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonCriar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonEditar;

    @FXML
    void onActionButtonEditar(ActionEvent event) {

    }

    @FXML
    void onActionCriar(ActionEvent event) throws IOException {
        Parent paret = FXMLLoader.load(getClass().getResource("FXMLFormCliente.fxml"));
        Scene scene = new Scene(paret);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonCriar.getScene();
    }

    @FXML
    void onActionExcluir(ActionEvent event) {

    }

    @FXML
    void onActionVoltar(ActionEvent event) {

    }
    
}
