package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLFormClienteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private TextField textFielRG;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonVoltar;

    @FXML
    void onActionButtonSalvar(ActionEvent event) throws IOException {
        
    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {

    }

    
}
