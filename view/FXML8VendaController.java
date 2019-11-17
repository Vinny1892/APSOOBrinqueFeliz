package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.ModelBrinquedo;
import static controller.ControllerBrinquedo.todosBrinquedos;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML8VendaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            brinquedos = todosBrinquedos();
//        } catch (SQLException ex) {
//            Logger.getLogger(FXML8VendaController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //inicializarTabelaBrinquedosDaLoja();
    }

    public void inicializarTabelaBrinquedosDaLoja() {
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        columnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        columnCatetoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        columnFabricante.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        columnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        ObservableList<ModelBrinquedo> obsTableList = FXCollections.observableArrayList(brinquedos);
        tableViewBrinquedosDaLoja.setItems(obsTableList);
    }

//    public void inicializarTabelaCarrinhoDeCompras() {
//        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
//        columnCodigo.setCellValueFactory(new PropertyValueFactory<>("categoria"));
//        columnPreco.setCellValueFactory(new PropertyValueFactory<>("descricao"));
//        columnCatetoria.setCellValueFactory(new PropertyValueFactory<>("preco"));
//        columnFabricante.setCellValueFactory(new PropertyValueFactory<>("codigo"));
//        columnDescricao.setCellValueFactory(new PropertyValueFactory<>("codigo"));
//        ObservableList<ModelBrinquedo> obsTableList = FXCollections.observableArrayList();
//        tableViewCarrinhoDeCompras.setItems(obsTableList);
//    }

    ArrayList<ModelBrinquedo> brinquedos;

    @FXML
    private TableView<ModelBrinquedo> tableViewBrinquedosDaLoja;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnNome;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnCodigo;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnPreco;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnCatetoria;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnFabricante;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnDescricao;

    @FXML
    private Button buttonAddCarrinhoCompras;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonFinalizarCompra;

    @FXML
    private ComboBox<?> comboBoxFormaDePagamento;

    @FXML
    private TextField textViewQuantidade;

    @FXML
    private Button buttonExcluirItemDoCarrinhoDeCompra;

    @FXML
    private TableView<?> tableViewCarrinhoDeCompras;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnNome1;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnCodigo1;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnPreco1;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnCatetoria1;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnFabricante1;

    @FXML
    private TableColumn<ModelBrinquedo, String> columnDescricao1;

    @FXML
    void onActionButtonAddCarrinhoCompras(ActionEvent event) {

    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {

    }

    @FXML
    void onActionbuttonExcluirItemDoCarrinhoDeCompra(ActionEvent event) {

    }

    @FXML
    void onActionbuttonFinalizarCompra(ActionEvent event) {

    }

}
