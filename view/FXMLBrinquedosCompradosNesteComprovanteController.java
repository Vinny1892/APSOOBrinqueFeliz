
package view;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.ModelBrinquedo;
import model.ModelComprovante;
import model.ModelItemDeVenda;
/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLBrinquedosCompradosNesteComprovanteController implements Initializable {

    public FXMLBrinquedosCompradosNesteComprovanteController(ModelComprovante comprovante) {
        this.comprovante = comprovante;
    }

    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//            // TODO
        try {
            inicializarTabelaBrinquedo();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLBrinquedosCompradosNesteComprovanteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        textFieldCliente.setDisable(true);
        textFieldDataVenda.setDisable(true);
        textFieldFormaPagamento.setDisable(true);
        textFieldFuncionario.setDisable(true);
        textFieldIDComprovante.setDisable(true);
        textFieldIDVenda.setDisable(true);
        textFieldValorTotal.setDisable(true);
        
    }
    
    private ModelComprovante comprovante;
    
    @FXML
    private TableView<ModelItemDeVenda> tableViewItemDeVenda;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnBrinquedo;

    @FXML
    private TableColumn<ModelItemDeVenda, Integer> cloumnQtd;

    @FXML
    private TableColumn<ModelItemDeVenda, Integer> columnIDItemDeVenda;

    @FXML
    private TextField textFieldIDComprovante;

    @FXML
    private TextField textFieldIDVenda;

    @FXML
    private TextField textFieldCliente;

    @FXML
    private TextField textFieldFuncionario;

    @FXML
    private TextField textFieldDataVenda;

    @FXML
    private TextField textFieldFormaPagamento;

    @FXML
    private TextField textFieldValorTotal;

    private ArrayList<ModelItemDeVenda> itensDeVenda;
    private ObservableList<ModelItemDeVenda> obsItensDeVenda;
    public void inicializarTabelaBrinquedo() throws SQLException{
        itensDeVenda = comprovante.getCarrinho();
        columnBrinquedo.setCellValueFactory(new PropertyValueFactory<>("brinquedo"));
        cloumnQtd.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        columnIDItemDeVenda.setCellValueFactory(new PropertyValueFactory<>("id"));
        obsItensDeVenda = FXCollections.observableArrayList(itensDeVenda);
    }
}
