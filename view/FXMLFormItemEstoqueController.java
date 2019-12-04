package view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ModelBrinquedo;
import model.ModelCategoria;
import model.ModelItemDeEstoque;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXMLFormItemEstoqueController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            inicializarComboBoxBrinquedo();
        } catch (SQLException ex) {
            Logger.getLogger(FXMLFormItemEstoqueController.class.getName()).log(Level.SEVERE, null, ex);
        }
        textFieldCodigoBarraBrinquedo.setDisable(true);
        buttonSalvar.setDisable(true);
    }

    @FXML
    private Button buttonSalvar;

    @FXML
    private ComboBox<ModelBrinquedo> comboBoxNomeBrinquedo;

    @FXML
    private TextField textFieldCodigoBarraBrinquedo;

    @FXML
    private TextField textFiledQuantidadeEmEstoque;

    @FXML
    private Button buttonVoltar;

    private ModelItemDeEstoque itemDeEstoque;

    @FXML
    void onActionButtonSalvar(ActionEvent event) throws SQLException, IOException {
        int qtd = Integer.parseInt(textFiledQuantidadeEmEstoque.getText().trim());
        controller.ControllerItemDeEstoque.atualizarItemNoEstoque(itemDeEstoque, qtd);
        Parent paret = FXMLLoader.load(getClass().getResource("FXMLRelatorioEstoque.fxml"));
        Scene scene = new Scene(paret);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonVoltar.getScene().getWindow().hide();
    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) throws IOException {
//        Parent paret = FXMLLoader.load(getClass().getResource("FXMLRelatorioEstoque.fxml"));
//        Scene scene = new Scene(paret);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
        buttonVoltar.getScene().getWindow().hide();

    }

    private ObservableList<ModelBrinquedo> obsTableBrinquedos;
    private ArrayList<ModelBrinquedo> brinquedos;

    public void inicializarComboBoxBrinquedo() throws SQLException {
        brinquedos = controller.ControllerBrinquedo.todosBrinquedos();
        obsTableBrinquedos = FXCollections.observableArrayList(brinquedos);
        comboBoxNomeBrinquedo.setItems(obsTableBrinquedos);
        if (brinquedos.size() > 0) {
            comboBoxNomeBrinquedo.getSelectionModel().selectFirst();
        } else {
            comboBoxNomeBrinquedo.setEditable(false);
        }
    }

}
