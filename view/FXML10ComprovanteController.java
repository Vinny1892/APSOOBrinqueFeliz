package view;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import model.ModelComprovante;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML10ComprovanteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private TableView<ModelComprovante> tableView;

    @FXML
    private TableColumn<?, ?> columnProduto;

    @FXML
    private TableColumn<?, ?> columnValor;

    @FXML
    private TableColumn<?, ?> columnQuantidade;

    @FXML
    private TableColumn<?, ?> columnValorSubProduto;

    @FXML
    private Label labelVendedor;

    @FXML
    private Label labelCliente;

    @FXML
    private Label labelValorTotal;
    
    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonImprimir;

    @FXML
    void onActionButtonImprimir(ActionEvent event) {

    }

    @FXML
    void onActionVoltar(ActionEvent event) {

    }
}
