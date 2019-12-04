package view;

import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.ModelCategoria;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML2CategoriaController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BooleanBinding camposPreenchidos = textFieldNome.textProperty().isEmpty()
                .or(buttonCria.textProperty().isEmpty())
                .or(buttonEditar.textProperty().isEmpty())
                .or(buttonExcluir.textProperty().isEmpty())
                .or(buttonSalvar.textProperty().isEmpty());
        buttonSalvar.disableProperty().bind(camposPreenchidos);
        try {
            categorias = controller.ControllerCategoria.todasCategorias();
        } catch (SQLException ex) {
            Logger.getLogger(FXML2CategoriaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        inicializarComboBoxCategoria();
    }

    @FXML
    private Button buttonCria;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private ComboBox<ModelCategoria> comboBoxCategorias;

    @FXML
    private TextField textFieldNome;

    @FXML
    private Button buttonSalvar;

    private ArrayList<ModelCategoria> categorias;

    @FXML
    void onActionButtonCria(ActionEvent event) {
        textFieldNome.setDisable(false);
        buttonCria.setDisable(true);
        buttonEditar.setDisable(true);
        buttonExcluir.setDisable(true);
        buttonSalvar.setDisable(false);
    }

    @FXML
    void onActionButtonEditar(ActionEvent event) {
        textFieldNome.setDisable(false);
        buttonCria.setDisable(true);
        buttonEditar.setDisable(true);
        buttonExcluir.setDisable(true);
        buttonSalvar.setDisable(false);
    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) throws SQLException {
        ModelCategoria categoria = comboBoxCategorias.getValue();
        Alert alert = null;
        if (categoria != null) {
                controller.ControllerCategoria.remover(categoria);
        } else {
            alert = new Alert(Alert.AlertType.NONE, "Não foi selecionado nenhuma categoria", ButtonType.YES);
            alert.show();
        }
    }

    @FXML
    void onActionButtonSalvar(ActionEvent event) throws SQLException {
        ModelCategoria categoria = comboBoxCategorias.getValue();
        String nome = textFieldNome.getText();
        if (categoria == null) {//editar
            categoria.setNome(nome);
            controller.ControllerCategoria.editar(categoria);
        } else {//salvar novo
            categoria = new ModelCategoria(nome);
            controller.ControllerCategoria.salvar(categoria);
        }
    }
    private ObservableList<ModelCategoria> obsCategoria;

    private void inicializarComboBoxCategoria() {
        obsCategoria = FXCollections.observableArrayList(categorias);
        comboBoxCategorias.setItems(obsCategoria);
    }
}
