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
import javafx.scene.control.Button;
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

    }

    @FXML
    void onActionButtonEditar(ActionEvent event) {

    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) {

    }

    @FXML
    void onActionButtonSalvar(ActionEvent event) {

    }
     private ObservableList<ModelCategoria> obsCategoria;
    private void inicializarComboBoxCategoria(){
        obsCategoria =  FXCollections.observableArrayList(categorias);
        comboBoxCategorias.setItems(obsCategoria);
    }
}
