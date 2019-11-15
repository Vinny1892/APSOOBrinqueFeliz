package view;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.ModelFuncionario;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML1FuncionarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        buttonCancelar.setDisable(false);
        buttonCriar.setDisable(true);
        buttonEditar.setDisable(false);
        buttonSalvar.setDisable(false);
        buttonVoltar.setDisable(true);
    }

    @FXML
    private TableView<ModelFuncionario> tableViewFuncionario;

    @FXML
    private TableColumn<ModelFuncionario, String> tableColumnNome;

    @FXML
    private TableColumn<ModelFuncionario, String> tableColumnTelefone;

    @FXML
    private TableColumn<ModelFuncionario, String> tableColumnCelular;

    @FXML
    private TableColumn<ModelFuncionario, String> tableColumnEMail;

    @FXML
    private TableColumn<ModelFuncionario, String> tableColumnDataContratacao;

    @FXML
    private TableColumn<ModelFuncionario, String> tableColumnPermissao;

    @FXML
    private Button buttonVoltar;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonCriar;

    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldTelefone;

    @FXML
    private TextField textFieldCelular;

    @FXML
    private TextField textFieldEMail;

    @FXML
    private TextField textFieldDataContratacao;

    @FXML
    private ComboBox<?> comboBoxPermissao;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonCancelar;
    

    @FXML
    void onActionButtonCancelar(ActionEvent event) {
        textFieldDataContratacao.clear();
        textFieldCelular.clear();
        textFieldEMail.clear();
        textFieldNome.clear();
        textFieldTelefone.clear();
        //comboBoxPermissao.;

        textFieldCelular.setDisable(false);
        textFieldDataContratacao.setDisable(false);
        textFieldEMail.setDisable(false);
        textFieldNome.setDisable(false);
        textFieldTelefone.setDisable(false);
        comboBoxPermissao.setDisable(false);
    }

    @FXML
    void onActionButtonCriar(ActionEvent event) {

    }

    @FXML
    void onActionButtonEditar(ActionEvent event) {
        ModelFuncionario mf = tableViewFuncionario.getSelectionModel().getSelectedItem();

        textFieldCelular.setText(mf.getTelefoneCelular());
        textFieldDataContratacao.setText(mf.getDataDeContratacao().toString());
        textFieldEMail.setText(mf.getEmail());
        textFieldNome.setText(mf.getNome());
        textFieldTelefone.setText("");
        if (mf.isADM()) {
            //comboBoxPermissao.;
        } else {
            //comboBoxPermissao.
        }

        textFieldCelular.setDisable(true);
        textFieldDataContratacao.setDisable(true);
        textFieldEMail.setDisable(true);
        textFieldNome.setDisable(true);
        textFieldTelefone.setDisable(true);
        comboBoxPermissao.setDisable(true);

        
        buttonSalvar.setDisable(true);
    }

    @FXML
    void onActionButtonExcluir(ActionEvent event) {

    }

    @FXML
    void onActionButtonSalvar(ActionEvent event) {

    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {

    }

}
