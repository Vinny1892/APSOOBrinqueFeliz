package view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.ModelBrinquedo;
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
//        try {
//            // TODO
//            inicializarTabelaBrinquedo();
//        } catch (SQLException ex) {
//            Logger.getLogger(FXMLRelatorioComprovanteController.class.getName()).log(Level.SEVERE, null, ex);
//        }
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
        ModelComprovante comprovante = tableViewComprovante.getSelectionModel().getSelectedItem();
        // TODO passar para proxima tela o ModelComprovante selecionado
        Parent paret = FXMLLoader.load(getClass().getResource("FXMLBrinquedosCompradosNesteComprovante.fxml"));
        Scene scene = new Scene(paret);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonVerItensDeVenda.getScene();
    }
    
    
    private ArrayList<ModelComprovante> comprovantes;
    private ObservableList<ModelComprovante> obsComprovantes;
    public void inicializarTabelaBrinquedo() throws SQLException{
        comprovantes = controller.ControllerComprovante.todosComprovantes();
        columnCliente.setCellValueFactory(new PropertyValueFactory<>("cliente"));
        columnDataVenda.setCellValueFactory(new PropertyValueFactory<>("data_venda"));
        columnFormaPagamento.setCellValueFactory(new PropertyValueFactory<>("forma"));
        columnValorTotal.setCellValueFactory(new PropertyValueFactory<>("valorTotal"));
        columnFuncionario.setCellValueFactory(new PropertyValueFactory<>("funcionario"));
        columnIDVenda.setCellValueFactory(new PropertyValueFactory<>("idVenda"));
        columnIDComprovante.setCellValueFactory(new PropertyValueFactory<>("id"));
        obsComprovantes = FXCollections.observableArrayList(comprovantes);
    }

    
    
}
