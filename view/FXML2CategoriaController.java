package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML2CategoriaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     @FXML
    private Button buttonCria;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private MenuButton menuButtonCategorias;

    @FXML
    private TextField textFieldNome;

    @FXML
    private TextArea textAreaDescricao;

    @FXML
    private Button buttonSalvar;

    @FXML
    void onActionButtonCria(ActionEvent event) {

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
    void onActionMenuButtonCategorias(ActionEvent event) {

    }
}
