/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import model.ModelBrinquedo;
import javafx.scene.control.cell.PropertyValueFactory;
import static controller.ControllerBrinquedo.todosBrinquedos;
import javafx.event.ActionEvent;
import model.ModelCategoria;
import model.ModelFabricante;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML1BrinquedoController implements Initializable {

    @FXML
    private AnchorPane buttonCriar;

    @FXML
    private Button buttonSalvar;

    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldCodigo;

    @FXML
    private TextField textFieldPreco;

    @FXML
    private TextField textFieldFabricante;

    @FXML
    private TextField textFieldDescricao;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonVoltar;

    @FXML
    private TableView<ModelBrinquedo> tableViewBrinquedo;

    @FXML
    private TableColumn<ModelBrinquedo, String> tableColumnNome;

    @FXML
    private TableColumn<ModelBrinquedo, Integer> tableColumnCodigo;

    @FXML
    private TableColumn<ModelBrinquedo, Float> tableColumnPreco;

    @FXML
    private TableColumn<ModelBrinquedo, String> tableColumnCategoria;

    @FXML
    private TableColumn<ModelBrinquedo, String> tableColumnFabricante;

    @FXML
    private TableColumn<ModelBrinquedo, String> tableColumnDescricao;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private ComboBox<ModelCategoria> comboBoxCategoria;

    @FXML
    private ComboBox<ModelFabricante> comboBoxFabricante;

    private ArrayList<ModelBrinquedo> brinquedos;

    private ObservableList<ModelBrinquedo> obsTableList;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //preencher o comboBoxCategoria

        //preencher o comboBoxFabricante
        //preencher a tabela
        //brinquedos = todosBrinquedos();
        inicializarTabela();

    }

    public void inicializarTabela() {
        tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
        tableColumnCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        tableColumnDescricao.setCellValueFactory(new PropertyValueFactory<>("descricao"));
        tableColumnPreco.setCellValueFactory(new PropertyValueFactory<>("preco"));
        tableColumnCodigo.setCellValueFactory(new PropertyValueFactory<>("codigo"));;
        obsTableList = FXCollections.observableArrayList(brinquedos);
        tableViewBrinquedo.setItems(obsTableList);
    }
    
    private ArrayList<ModelCategoria> categorias;
    private ObservableList<ModelCategoria> obsTableCategorias;

    public void inicializarComboBoxCategorias() {
        obsTableCategorias = FXCollections.observableArrayList(categorias);
        comboBoxCategoria.setItems(obsTableCategorias);
        if (categorias.size() > 0) {
            comboBoxCategoria.getSelectionModel().selectFirst();
        } else {
            comboBoxCategoria.setEditable(false);
        }
    }
}


