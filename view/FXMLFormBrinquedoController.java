/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.ModelBrinquedo;
import model.ModelCategoria;
import model.ModelFabricante;
import model.ModelFornecedor;

/**
 * FXML Controller class
 *
 * @author Vinny
 */
public class FXMLFormBrinquedoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private TextField textFielNome;

    @FXML
    private TextField textFieldPreco;

    @FXML
    private ComboBox<ModelCategoria> comboBoxCategoria;

    @FXML
    private ComboBox<ModelFabricante> comboBoxFabricantes;
    @FXML
    private ComboBox<ModelFornecedor> comboBoxFonecedor;
    @FXML
    private TextArea textAreaDesc;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;

    private ModelBrinquedo brinquedo;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //try {
            // TODO receber obj brinquedo caso seja um EDITAR brinquedo
            if (brinquedo != null) {
                textAreaDesc.setText(brinquedo.getDescricao());
                textFielNome.setText(brinquedo.getNome());
                textFieldPreco.setText((brinquedo.getPreco().toString()));
                // TODO pq isso n funciona ?
//                comboBoxCategoria.setSelectionModel(brinquedo.getCategoria());
//                comboBoxFabricantes.setSelectionModel(brinquedo.getFabricante());
//                comboBoxFonecedor.setSelectionModel(brinquedo.getFornecedor());
            } else {
                //inicializarComboBoxFabricante();
                //inicializarComboBoxFornecedor();
                //inicializarComboBoxCategorias();
            }

        //} catch (SQLException ex) {
        //    Logger.getLogger(FXMLFormBrinquedoController.class.getName()).log(Level.SEVERE, null, ex);
        //}

    }

    private ObservableList<ModelFabricante> obsFabricantes;
    private ArrayList<ModelFabricante> fabricantes;

    private void inicializarComboBoxFabricante() throws SQLException {
        fabricantes = controller.ControllerFabricante.todosFabricantes();
        obsFabricantes = FXCollections.observableArrayList(fabricantes);
        comboBoxFabricantes.setItems(obsFabricantes);
    }
    //private ArrayList<ModelCategoria> categorias;
//    private ObservableList<ModelCategoria> obsCategoria;
    private ObservableList<ModelCategoria> obsTableCategorias;
    private ArrayList<ModelCategoria> categorias;

    public void inicializarComboBoxCategorias() throws SQLException {
        categorias = controller.ControllerCategoria.todasCategorias();
        obsTableCategorias = FXCollections.observableArrayList(categorias);
        comboBoxCategoria.setItems(obsTableCategorias);
        if (categorias.size() > 0) {
            comboBoxCategoria.getSelectionModel().selectFirst();
        } else {
            comboBoxCategoria.setEditable(false);
        }
    }
    private ObservableList<ModelFornecedor> obsTableFornecedor;
    private ArrayList<ModelFornecedor> fornecedores;

    public void inicializarComboBoxFornecedor() throws SQLException {
        fornecedores = controller.ControllerFornecedor.todosFornecedores();
        obsTableFornecedor = FXCollections.observableArrayList(fornecedores);
        comboBoxFonecedor.setItems(obsTableFornecedor);
        if (fornecedores.size() > 0) {
            comboBoxFonecedor.getSelectionModel().selectFirst();
        } else {
            comboBoxFonecedor.setEditable(false);
        }
    }

    @FXML
    void onActionButtonSalvar(ActionEvent event) throws SQLException {
        String nome = textFielNome.getText();
        double preco = Double.parseDouble(textFieldPreco.getText());
        ModelCategoria categoria = comboBoxCategoria.getValue();
        ModelFabricante fabricante = comboBoxFabricantes.getValue();
        String desc = textAreaDesc.getText();
        ModelFornecedor fornecedor = comboBoxFonecedor.getValue();
        new ModelBrinquedo().salvar(new ModelBrinquedo(categoria, nome, preco, fabricante, desc, fornecedor));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Salvo");
        alert.setHeaderText("Novo Brinquedo");
        alert.setContentText("Novo brinquedo Salvo com sucesso");
        alert.showAndWait();

        btnVoltar.getScene().getWindow().hide();
    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {
        btnVoltar.getScene().getWindow().hide();

    }

}
