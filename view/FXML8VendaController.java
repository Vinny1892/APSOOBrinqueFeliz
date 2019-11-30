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
import static controller.ControllerItemDeEstoque.todosItensDeEstoque;
import static controller.ControllerVenda.formasDePagamento;
import static controller.ControllerCliente.todosClientes;
import java.util.Date;
//import static controller.ControllerItemVenda.;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import model.ModelBrinquedo;
import model.ModelCliente;
import model.ModelComprovante;
import model.ModelFabricante;
import model.ModelItemDeVenda;
import model.ModelItemDeEstoque;
import model.ModelFormaDePagamento;
import model.ModelFuncionario;
import model.ModelVenda;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML8VendaController implements Initializable {

    public FXML8VendaController(ModelFuncionario funcionario) {
        this.funcionarioLogado = funcionario;
    }
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        try {
//            inicializarTabelaItensEstoque();
//            inicializarComboBoxFormaPagamento();
//            inicializarComboBoxCliente();
//        } catch (SQLException ex) {
//            Logger.getLogger(FXML8VendaController.class.getName()).log(Level.SEVERE, null, ex);
//        }

    }
    private ModelFuncionario funcionarioLogado;
    @FXML
    private FXML10ComprovanteController telaComprovanteFXML;

    private ArrayList<ModelItemDeEstoque> itensDeEstoque;
    private ArrayList<ModelItemDeEstoque> itensDeEstoqueComprado;
    private ObservableList<ModelItemDeEstoque> obsTableItensDeEstoque;

    private ObservableList<ModelFormaDePagamento> obsCategoriasFormaPagamento;
    private ArrayList<ModelFormaDePagamento> formasDePagamentos;

    private ObservableList<ModelCliente> obsClientes;
    private ArrayList<ModelCliente> clientes;
    
    private ObservableList<ModelItemDeVenda> obsCarrinho;
    private ArrayList<ModelItemDeVenda> carrinhoCompra = new ArrayList<>();

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
    private TableColumn<ModelBrinquedo, String> columnNome1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnCodigo1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnPreco1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnCatetoria1;

    @FXML
    private TableColumn<ModelFabricante, String> columnFabricante1;

    @FXML
    private TableColumn<ModelItemDeVenda, String> columnDescricao1;

    @FXML
    private TableColumn<ModelItemDeVenda, Integer> quantidade1;
     
    private double valorTotal = 0;

//    @FXML
//    void onActionButtonVoltar(ActionEvent event) {
//
//    }
    @FXML
    void onActionbuttonExcluirItemDoCarrinhoDeCompra(ActionEvent event) {
        //tableViewCarrinhoDeCompras.get
    }

    @FXML
    void onActionbuttonFinalizarCompra(ActionEvent event) throws IOException, SQLException {
        ModelFuncionario funcionario = null;
        ModelCliente cliente = comboBoxCliente.getValue();
        ModelFormaDePagamento forma = comboBoxFormaDePagamento.getValue();
        Date data_venda = new Date(System.currentTimeMillis());
        ModelVenda venda = new ModelVenda(valorTotal, cliente, funcionario, data_venda, forma, carrinhoCompra);
        //atualizar tudo no BD
        int idVenda = controller.ControllerVenda.finalizarCompra(venda);//SALVAR NO BD
        controller.ControllerComprovante.salvar(new ModelComprovante(venda));
        controller.ControllerItemDeEstoque.atualizarItensNoEstoque(itensDeEstoqueComprado);
        //chamar proxima tela
        Stage stage = new Stage();
        Parent p = FXMLLoader.load(getClass().getResource("FXML10Comprovante.fxml"));
        Scene scene = new Scene(p);
        stage.setScene(scene);
        stage.show();
        //fecha essa tela1 atual
        buttonFinalizarCompra.getScene().getWindow();
    }

    private void inicializarComboBoxFormaPagamento() throws SQLException {
        formasDePagamentos = formasDePagamento();
        obsCategoriasFormaPagamento = FXCollections.observableArrayList(formasDePagamentos);
        comboBoxFormaDePagamento.setItems(obsCategoriasFormaPagamento);
        if (formasDePagamentos.size() > 0) {
            comboBoxFormaDePagamento.getSelectionModel().selectFirst();
        } else {
            comboBoxFormaDePagamento.setEditable(false);
        }
    }

    private void inicializarComboBoxCliente() throws SQLException {
        clientes = todosClientes();
        obsClientes = FXCollections.observableArrayList(clientes);
        comboBoxCliente.setItems(obsClientes);
        if (clientes.size() > 0) {
            comboBoxCliente.getSelectionModel().selectFirst();
        } else {
            comboBoxCliente.setEditable(false);
        }
    }

    private void inicializarTabelaItensEstoque() throws SQLException {
        itensDeEstoque = todosItensDeEstoque();
        columnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCodigo.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        columnFabricante.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        columnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        quantidade.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        obsTableItensDeEstoque = FXCollections.observableArrayList(itensDeEstoque);
        tableViewModelItemEstoque.setItems(obsTableItensDeEstoque);
    }
    
    
    
    private void adicionarItemTabelaItensCarrinhoCompra(ModelItemDeVenda item) throws SQLException {
        carrinhoCompra.add(item);
        columnNome1.setCellValueFactory(new PropertyValueFactory<>("nome"));
        columnCodigo1.setCellValueFactory(new PropertyValueFactory<>("id"));
        columnPreco1.setCellValueFactory(new PropertyValueFactory<>("preco"));
        columnFabricante1.setCellValueFactory(new PropertyValueFactory<>("fabricante"));
        columnDescricao1.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        quantidade1.setCellValueFactory(new PropertyValueFactory<>("quantidade"));
        obsCarrinho = FXCollections.observableArrayList(carrinhoCompra);
        tableViewCarrinhoDeCompras.setItems(obsCarrinho);
    }

    @FXML
    void onActionButtonAddCarrinhoCompras(ActionEvent event) throws SQLException {
        ModelItemDeEstoque item = tableViewModelItemEstoque.getSelectionModel().getSelectedItem();
        Alert alert = null;
        int qtdTela = Integer.parseInt(textViewQuantidade.getText().trim());
        if (!textViewQuantidade.getText().isEmpty()) {
            if (qtdTela > 0) {
                if (qtdTela <= item.getQuantidade()) {
                    //atualizar localmente
                    carrinhoCompra.add(new ModelItemDeVenda(item.getBrinquedo(), qtdTela));
                    int posicao =  itensDeEstoque.indexOf(item);
                    item.setQuantidade(item.getQuantidade()-qtdTela);
                    itensDeEstoque.set(posicao,item);
                    adicionarItemTabelaItensCarrinhoCompra(new ModelItemDeVenda(item.getBrinquedo(), qtdTela));
                    inicializarTabelaItensEstoque();//atualizar tableView
                } else {
                    alert = new Alert(Alert.AlertType.NONE, "Quantidade que deseja deste produto não está diponível", ButtonType.YES);
                    alert.show();
                }
            } else {
                alert = new Alert(Alert.AlertType.NONE, "Quantidade tem que ser maior que zero. ", ButtonType.YES);
                alert.show();
            }
        } else {
            alert = new Alert(Alert.AlertType.NONE, "Quantidade Invalida. ", ButtonType.YES);
            alert.show();
        }

    }

}
