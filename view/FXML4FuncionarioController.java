/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.net.URL;
import java.sql.SQLException;
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
public class FXML4FuncionarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
//        buttonCancelar.setDisable(true);
//        buttonCriar.setDisable(true);
//        buttonEditar.setDisable(false);
//        buttonSalvar.setDisable(false);
//        buttonVoltar.setDisable(true);
    }

    @FXML
    private Button buttonVoltar;

    @FXML
    private TableView<ModelFuncionario> tableViewFuncionario;

    @FXML
    private TableColumn<ModelFuncionario, String> columnNome;

    @FXML
    private TableColumn<ModelFuncionario, String> columnTelefone;

    @FXML
    private TableColumn<ModelFuncionario, String> columnCelular;

    @FXML
    private TableColumn<ModelFuncionario, String> comumnEmail;

    @FXML
    private TableColumn<ModelFuncionario, String> columnDataContracao;

    @FXML
    private TableColumn<ModelFuncionario, String> columnPermissao;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonCancelar;

    @FXML
    private Button buttonEditar;

    @FXML
    private Button buttonExcluir;

    @FXML
    private Button buttonCriar;

    @FXML
    private TextField textFildNome;

    @FXML
    private TextField textFieldTelefone;

    @FXML
    private TextField textFieldCelular;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldDataContratacao;

    @FXML
    private ComboBox<?> comboBoxPermissao;

    @FXML
    void onActionButtonSalvar(ActionEvent event) throws SQLException {
        String nome = textFildNome.getText();
        String tel = textFieldTelefone.getText();
        String cel = textFieldCelular.getText();
        String email = textFieldEmail.getText();
        String data = textFieldDataContratacao.getText();
        String permissao = comboBoxPermissao.getTypeSelector();
        String matricula = "";
        String login = "";
        String senha = "";
        ModelFuncionario mf = new ModelFuncionario(matricula, tel, cel, email, data, login, senha);
        mf.salvar(mf);
    }

    @FXML
    void onActionButtonVoltar(ActionEvent event) {
        buttonVoltar.getScene().getWindow().hide();
    }

    @FXML
    void onActionTextFieldNome(ActionEvent event) {

    }

    @FXML
    void onActionbuttonCacelar(ActionEvent event) {
        textFieldDataContratacao.clear();
        textFieldCelular.clear();
        textFieldEmail.clear();
        textFildNome.clear();
        textFieldTelefone.clear();
        //comboBoxPermissao.;

        textFieldCelular.setDisable(true);
        textFieldDataContratacao.setDisable(true);
        textFieldEmail.setDisable(true);
        textFildNome.setDisable(true);
        textFieldTelefone.setDisable(true);
        comboBoxPermissao.setDisable(true);

        buttonCriar.setDisable(true);
        buttonCancelar.setDisable(false);
        buttonEditar.setDisable(false);
        buttonSalvar.setDisable(false);
    }

    @FXML
    void onActionbuttonCriar(ActionEvent event) {
        buttonCriar.setDisable(true);
        //buttonCancelar.setDisable(false);
        buttonSalvar.setDisable(false);
        buttonExcluir.setDisable(true);
        buttonEditar.setDisable(true);

        textFieldDataContratacao.clear();
        textFieldCelular.clear();
        textFieldEmail.clear();
        textFildNome.clear();
        textFieldTelefone.clear();
        //comboBoxPermissao.;

        textFieldCelular.setDisable(false);
        textFieldDataContratacao.setDisable(false);
        textFieldEmail.setDisable(false);
        textFildNome.setDisable(false);
        textFieldTelefone.setDisable(false);
        comboBoxPermissao.setDisable(false);
    }

    @FXML
    void onActionbuttonEditar(ActionEvent event) {
        ModelFuncionario mf = tableViewFuncionario.getSelectionModel().getSelectedItem();

        textFieldCelular.setText(mf.getTelefoneCelular());
        textFieldDataContratacao.setText(mf.getDataDeContratacao().toString());
        textFieldEmail.setText(mf.getEmail());
        textFildNome.setText(mf.getNome());
        textFieldTelefone.setText(mf.getTelefoneResidencial());
        if (mf.isADM()) {
            //comboBoxPermissao.;
        } else {
            //comboBoxPermissao.
        }

        textFieldCelular.setDisable(false);
        textFieldDataContratacao.setDisable(false);
        textFieldEmail.setDisable(false);
        textFildNome.setDisable(false);
        textFieldTelefone.setDisable(false);
        comboBoxPermissao.setDisable(false);

        buttonSalvar.setDisable(false);
        buttonCriar.setDisable(true);
        buttonCancelar.setDisable(false);
        buttonEditar.setDisable(true);
    }

    @FXML
    void onActionbuttonExcluir(ActionEvent event) {
        buttonSalvar.setDisable(false);
        buttonCriar.setDisable(false);
        buttonCancelar.setDisable(true);
        buttonEditar.setDisable(false);
    }

    @FXML
    void onActioncomboBoxPermissao(ActionEvent event) {

    }

    @FXML
    void onActiontextFieldCelular(ActionEvent event) {

    }

    @FXML
    void onActiontextFieldDataContratacao(ActionEvent event) {

    }

    @FXML
    void onActiontextFieldTelefone(ActionEvent event) {

    }

    @FXML
    void textFieldbuttonEmail(ActionEvent event) {

    }

}
