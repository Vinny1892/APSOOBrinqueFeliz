/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ModelFornecedor;

/**
 * FXML Controller class
 *
 * @author Vinny
 */
public class FXMLFormFornecedorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    private ModelFornecedor fornecedor;
    public FXMLFormFornecedorController(ModelFornecedor fornecedor) {//editar
        this.fornecedor = fornecedor;
        textFieldCNPJ.setText(fornecedor.getCnpj());
        textFieldCidade.setText(fornecedor.getCidade());
        textFieldEmail.setText(fornecedor.getEmail());
        textFieldEndereco.setText(fornecedor.getEndereco());
        textFieldEstado.setText(fornecedor.getEstado());
        textFieldNome.setText(fornecedor.getNomeFantasia());
        textFieldRazaoSocial.setText(fornecedor.getRazaoSocial());
    }

    public FXMLFormFornecedorController() {//salvar
    }
    
    
    
    
    @FXML
    private TextField textFieldNome;

    @FXML
    private TextField textFieldRazaoSocial;

    @FXML
    private TextField textFieldCidade;

    @FXML
    private TextField textFieldEstado;

    @FXML
    private TextField textFieldCNPJ;

    @FXML
    private TextField textFieldNomeFantasia;

    @FXML
    private TextField textFieldEndereco;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private Button btnSalvar;

    @FXML
    private Button btnVoltar;
    
    @FXML
    private TextField textFieldTelefone;

    @FXML
    void onActionbtnSalvar(ActionEvent event) throws SQLException {
        String nome = textFieldNome.getText();
        String cnpj = textFieldCNPJ.getText();
        String razaoSocial = textFieldRazaoSocial.getText();
        String endereco = textFieldEndereco.getText();
        String cidade = textFieldCidade.getText();
        String estado = textFieldEstado.getText();
        String telefone = textFieldTelefone.getText();
        String email = textFieldEmail.getText();
        
        if (fornecedor == null) {//salvar
            fornecedor = new ModelFornecedor(cnpj, nome, razaoSocial, endereco, cidade, estado, telefone, email);
            int id = controller.ControllerFornecedor.salvar(fornecedor);
            fornecedor.setId(id);
        }else{//editar
            fornecedor.setCidade(cidade);
            fornecedor.setCnpj(cnpj);
            fornecedor.setEmail(email);
            fornecedor.setEndereco(endereco);
            fornecedor.setEstado(estado);
            fornecedor.setNomeFantasia(nome);
            fornecedor.setRazaoSocial(razaoSocial);
            fornecedor.setTelefone(telefone);
            controller.ControllerFornecedor.editar(fornecedor);
        }

    }

    @FXML
    void onActionbtnVoltar(ActionEvent event) throws IOException {
//        Parent fornecedor = FXMLLoader.load(getClass().getResource("FXML7Fornecedor.fxml"));
//        Scene scene = new Scene(fornecedor);
//        Stage stage = new Stage();
//        stage.setScene(scene);
//        stage.show();
        btnVoltar.getScene().getWindow().hide();

    }
    
}
