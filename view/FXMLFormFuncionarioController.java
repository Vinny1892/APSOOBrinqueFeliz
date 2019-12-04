/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import helpers.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.binding.BooleanBinding;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sun.security.jca.GetInstance;
import model.ModelFuncionario;
import static controller.ControllerFuncionario.salvarFuncionario;
import java.sql.SQLException;
import java.text.ParseException;

/**
 * FXML Controller class
 *
 * @author Vinicius Espindola
 */
public class FXMLFormFuncionarioController implements Initializable {

    public FXMLFormFuncionarioController(ModelFuncionario funcionario) {
        this.funcionarioAtualizar = funcionario;
    }

    public FXMLFormFuncionarioController() {
    }

    private ModelFuncionario funcionarioAtualizar;

    public void setFuncionarioAtualizar(ModelFuncionario funcionarioAtualizar) {
        this.funcionarioAtualizar = funcionarioAtualizar;
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         inicializarComboBox();
        BooleanBinding camposPreenchidos = textFieldNome.textProperty().isEmpty()
                .or(textFieldTelefone.textProperty().isEmpty())
                .or(textFieldEmail.textProperty().isEmpty())
                .or(textFieldDataContratacao.textProperty().isEmpty())
                .or(textFieldCelular.textProperty().isEmpty())
                .or(textfieldCPF.textProperty().isEmpty());

        if (funcionarioAtualizar != null) {
            textFieldCelular.setText(funcionarioAtualizar.getTelefoneCelular());
            textFieldNome.setText(funcionarioAtualizar.getNome());
            textFieldEmail.setText(funcionarioAtualizar.getEmail());
            textFieldTelefone.setText(funcionarioAtualizar.getTelefoneResidencial());
            textFieldDataContratacao.setText(DateHelper.toDateString(funcionarioAtualizar.getDataDeContratacao()));
            textfieldCPF.setText(funcionarioAtualizar.getCpf());
            if(funcionarioAtualizar.getIsADM()){
                 comboBoxPermissao.getSelectionModel().selectFirst(); 
            }else{
                  comboBoxPermissao.getSelectionModel().selectLast();
            }
        }

        buttonSalvar.disableProperty().bind(camposPreenchidos);
       

    }

    @FXML
    private TextField textFieldEstado;
    @FXML
    private TextField textFieldCidade;
    @FXML
    private TextField textFieldCEP;
    @FXML
    private TextField textFieldEndereco;

    @FXML
    private TextField textFieldDTnascimento;

    @FXML
    private Button buttonSalvar;

    @FXML
    private Button buttonVoltar;

    @FXML
    private TextField textFieldNome;

    @FXML
    private ComboBox<String> comboBoxPermissao;

    @FXML
    private TextField textFieldCelular;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private TextField textFieldTelefone;

    @FXML
    private TextField textFieldDataContratacao;

    @FXML
    private TextField textfieldCPF;

    @FXML
    private PasswordField textFieldPassword;

    private ObservableList<String> obsPermissoesComboBox;

    @FXML
    void btnSalvarAction(ActionEvent event) throws ParseException, SQLException {
        System.out.println(textFieldCidade.getText());
        boolean adm = comboBoxPermissao.getSelectionModel().getSelectedItem().equals("Administrador") ? true : false;
        String passwordHashed = BCrypt.hashpw(textFieldPassword.getText(), BCrypt.gensalt(12));
        if(funcionarioAtualizar != null){
            funcionarioAtualizar.setCep(textFieldCEP.getText());
            funcionarioAtualizar.setNome(textFieldNome.getText());
            funcionarioAtualizar.setEstado(textFieldEstado.getText());
            funcionarioAtualizar.setCidade(textFieldCidade.getText());
            funcionarioAtualizar.setTelefoneCelular(textFieldCelular.getText());
            funcionarioAtualizar.setIsADM(adm);
            funcionarioAtualizar.setDataDeContratacao(DateHelper.toDate(textFieldDataContratacao.getText()));
            funcionarioAtualizar.setDataDeNascimento(DateHelper.toDate(textFieldDTnascimento.getText()));
            funcionarioAtualizar.setEmail(textFieldEmail.getText());
            funcionarioAtualizar.setCpf(textfieldCPF.getText());
            funcionarioAtualizar.setSenha(passwordHashed);
            funcionarioAtualizar.setTelefoneResidencial(textFieldTelefone.getText());
            funcionarioAtualizar.setEstado(textFieldEstado.getText());
        
        }else{
        ModelFuncionario funcionario = new ModelFuncionario(
                textFieldTelefone.getText(),
                textFieldCelular.getText(),
                textFieldEmail.getText(),
                DateHelper.toDate(textFieldDataContratacao.getText()),
                adm,
                passwordHashed,
                textFieldNome.getText(),
                textfieldCPF.getText(),
                DateHelper.toDate(textFieldDTnascimento.getText()),
                textFieldEndereco.getText(),
                textFieldCEP.getText(),
                textFieldCidade.getText(),
                textFieldEstado.getText()
        );
        
        salvarFuncionario(funcionario);
        }

    }

    @FXML
    void btnVoltarAction(ActionEvent event) throws IOException {
//        Parent adm = FXMLLoader.load(getClass().getResource("FXML4Funcionario.fxml"));
//        Scene scene = new Scene(adm);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
        buttonVoltar.getScene().getWindow().hide();
    }

    public void inicializarComboBox() {
        ArrayList<String> permissoes = new ArrayList<String>();
        permissoes.add("Administrador");
        permissoes.add("Funcionario");

        obsPermissoesComboBox = FXCollections.observableArrayList(permissoes);
        comboBoxPermissao.setItems(obsPermissoesComboBox);
        comboBoxPermissao.getSelectionModel().select("Administrador");

    }

}
