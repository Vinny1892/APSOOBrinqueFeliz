package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML0loginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
        @FXML
    private Button buttonLogar;

    @FXML
    private TextField textFieldUser;

    @FXML
    private TextField textFieldPassword;
    
     @FXML
    void onActionButtonLogar(ActionEvent event) {

    }
    
}
