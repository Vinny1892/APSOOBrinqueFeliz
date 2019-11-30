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
import java.io.IOException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static controller.ControllerItemDeEstoque.todosItensDeEstoque;
import model.ModelCliente;
import model.ModelItemDeVenda;
import model.ModelItemDeEstoque;
import model.ModelFormaDePagamento;
/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML8VendaController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            itensDeEstoque = todosItensDeEstoque();
            inicializarTabelaItensEstoque();
            formasDePagamentos = new controller.ControllerVenda().formasDePagamento();
            inicializarComboBoxFormaPagamento();
            inicializarComboBoxCliente();
        } catch (SQLException ex) {
            Logger.getLogger(FXML8VendaController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private ArrayList<ModelItemDeEstoque> itensDeEstoque;
    private ObservableList<ModelItemDeEstoque> obsTableItensDeEstoque;

    private ObservableList<ModelFormaDePagamento> obsCategoriasFormaPagamento;
    private ArrayList<ModelFormaDePagamento> formasDePagamentos;

    private ObservableList<ModelCliente> obsClientes;
    private ArrayList<ModelCliente> clientes;
    
    @FXML
    private ComboBox<ModelCliente> comboBoxCliente;
        
        
    @FXML
    private TableView<ModelItemDeEstoque> tableViewModelItemEstoque;

    @FXML
    private TableColumn<ModelItemDeEstoque, String> columnNome;

    @FXML
    private TableColumn<ModelItemDeEstoque, String> columnCodigo;

    @FXML
    private TableColumn<ModelItemDeEstoque, String> columnPreco;

    @FXML
    private TableColumn<ModelItemDeEstoque, String> columnCatetoria;

    @FXML
    private TableColumn<ModelItemDeEstoque, String> columnFabricante;

    @FXML
    private TableColumn<ModelItemDeEstoque, String> columnDescricao;
    
    @FXML
    private TableColumn<ModelItemDeEstoque, Integer> quantidade;
    
    @FXML
    private Button buttonAddCarrinhoCompras;

//    @FXML
//    private Button buttonVoltar;
    @FXML
    private Button buttonFinalizarCompra;

    @FXML
    private ComboBox<ModelFormaDePagamento> comboBoxFormaDePagamento;

    @FXML
    private TextField textViewQuantidade;

    @FXML
    private Button buttonExcluirItemDoCarrinhoDeCompra;

    @FXML
    private TableView<ModelItemDeVenda> tableViewCarrinhoDeCompras;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnNome1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnCodigo1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnPreco1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnCatetoria1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnFabricante1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnDescricao1;


    @FXML
    private TableColumn<ModelItemDeVenda, Integer> quantidade1;
    
    
    @FXML
    private TextField textFieldRGCliente;

//    @FXML
//    void onActionButtonVoltar(ActionEvent event) {
//
//    }
    @FXML
    void onActionbuttonExcluirItemDoCarrinhoDeCompra(ActionEvent event) {
        //tableViewCarrinhoDeCompras.get
    }

    @FXML
    void onActionbuttonFinalizarCompra(ActionEvent event) throws IOException {
        String rg = textFieldRGCliente.getText();
        //pegar quem é o vendendor
        
        //atualizar o Estoque
        
        //gerar lista de itens comprados e suas devidas qtd
        
        ModelFormaDePagamento formaPagamento = comboBoxFormaDePagamento.getValue();
        
        //atualizar tudo depois chamar proxima tela
        
        Stage stage = new Stage();
        Parent p = FXMLLoader.load(getClass().getResource("FXML10Comprovante.fxml"));
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.show();
        //fecha essa tela1 atual
        buttonFinalizarCompra.getScene().getWindow().hide();
    }

    private void inicializarComboBoxFormaPagamento() {
        obsCategoriasFormaPagamento = FXCollections.observableArrayList(formasDePagamentos);
        comboBoxFormaDePagamento.setItems(obsCategoriasFormaPagamento);
        if (formasDePagamentos.size() > 0) {
            comboBoxFormaDePagamento.getSelectionModel().selectFirst();
        } else {
            comboBoxFormaDePagamento.setEditable(false);
        }
    }
    
    

    
    private void inicializarComboBoxCliente() {
        obsClientes = FXCollections.observableArrayList(clientes);
        comboBoxCliente.setItems(obsClientes);
        if (clientes.size() > 0) {
            comboBoxCliente.getSelectionModel().selectFirst();
        } else {
            comboBoxCliente.setEditable(false);
        }
    }

    private void inicializarTabelaItensEstoque() {
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCodigo.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        columnFabricante.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        columnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        quantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        obsTableItensDeEstoque = FXCollections.observableArrayList(itensDeEstoque);
        tableViewModelItemEstoque.setItems(obsTableItensDeEstoque);
    }

    @FXML
    void onActionButtonAddCarrinhoCompras(ActionEvent event) {
        
    }

}
