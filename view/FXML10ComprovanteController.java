package view;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import model.ModelComprovante;
import model.ModelItemDeVenda;
import model.ModelVenda;

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
        ModelComprovante comprovante = controller.ControllerComprovante.getByIdVenda(idVenda);
        itensComprado;
        itensComprado = comprovante.getCarrinho();
        inicializarTabelaDeItensComprados();
        // TODO
    }

    @FXML
    private TableView<ModelItemDeVenda> tableView;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnProduto;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnValor;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnQuantidade;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnValorSubProduto;

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
    
    private int idVenda;
    
    private ObservableList<ModelItemDeVenda> obsItensComprado;
    private ArrayList<ModelItemDeVenda> itensComprado;

    @FXML
    void onActionButtonImprimir(ActionEvent event) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Impressão");
        alert.setHeaderText("Impresso");
        alert.setContentText("Pega lá na impressora, vai na fé!");
        alert.showAndWait();
    }

    @FXML
    void onActionVoltar(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Parent p = FXMLLoader.load(getClass().getResource("FXML8Venda.fxml"));
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.show();
        //fecha essa tela1 atual
        buttonVoltar.getScene().getWindow().hide();
    }

    void inicializarTabelaDeItensComprados() {
        
        
    }
}
