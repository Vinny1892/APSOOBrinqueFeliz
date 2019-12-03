package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLComprarBrinquedoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    @FXML
    private TableView<?> tableViewBrinquedo;

    @FXML
    private TableColumn<?, ?> tableColumnNome;

    @FXML
    private TableColumn<?, ?> tableColumnCodigo;

    @FXML
    private TableColumn<?, ?> tableColumnPreco;

    @FXML
    private TableColumn<?, ?> tableColumnCategoria;

    @FXML
    private TableColumn<?, ?> tableColumnFabricante;

    @FXML
    private TableColumn<?, ?> tableColumnDescricao;

    @FXML
    private ComboBox<?> comboBoxFornecedor;

    @FXML
    private TextField textFildQuantidade;
    
}
