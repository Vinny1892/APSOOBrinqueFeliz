package view;

import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import model.ModelComprovante;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.ModelCliente;
import model.ModelFuncionario;
import model.ModelVenda;
import model.ModelFormaDePagamento;
/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLRelatorioComprovanteController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    private TableView<ModelComprovante> tableViewComprovante;

    @FXML
    private TableColumn<ModelComprovante, Integer> columnIDComprovante;

    @FXML
    private TableColumn<ModelVenda, Integer> columnIDVenda;

    @FXML
    private TableColumn<ModelComprovante, Date> columnDataVenda;

    @FXML
    private TableColumn<ModelCliente, String> columnCliente;

    @FXML
    private TableColumn<ModelFuncionario, String> columnFuncionario;

    @FXML
    private TableColumn<ModelFormaDePagamento, String> columnFormaPagamento;

    @FXML
    private TableColumn<ModelComprovante, Double> columnValorTotal;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonVerItensDeVenda;

    @FXML
    void onActionButtonVoltar(ActionEvent event) {
        buttonVoltar.getScene().getWindow().hide();
    }

    @FXML
    void onActionbuttonVerItensDeVenda(ActionEvent event) throws IOException {
        Parent paret = FXMLLoader.load(getClass().getResource("FXMLBrinquedosCompradosNesteComprovante.fxml"));
        Scene scene = new Scene(paret);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonVerItensDeVenda.getScene();
    }
    
}
