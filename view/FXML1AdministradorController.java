package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML1AdministradorController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
      @FXML
    private Button buttonEstoque;

    @FXML
    private Button buttonFornecedores;

    @FXML
    private Button buttonFuncionarios;

    @FXML
    private Button buttonCategorias;

    @FXML
    private Button buttonBrinquedos;

    @FXML
    private Button buttonVendas;

    @FXML
    private Button buttonClientes;

    @FXML
    private Button buttonCatalogo;

    @FXML
    private Button buttonfabricantes;

    @FXML
    private Button buttonComprovantes;

    @FXML
    private Button buttonRelatorios;

    @FXML
    private Button buttonBackUp;

    @FXML
    void buttonCategorias(ActionEvent event) throws IOException {
        Parent categoria = FXMLLoader.load(getClass().getResource("FXML2Categoria.fxml"));
        Scene scene = new Scene(categoria);
        //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonCategorias.getScene();
    }

    @FXML
    void nActionbuttonEstoque(ActionEvent event) {

    }

    @FXML
    void onActionbuttonBrinquedos(ActionEvent event) {

    }

    @FXML
    void onActionbuttonCatalogo(ActionEvent event) {

    }

    @FXML
    void onActionbuttonClientes(ActionEvent event) {

    }

    @FXML
    void onActionbuttonComprovantes(ActionEvent event) {

    }

    @FXML
    void onActionbuttonFuncionarios(ActionEvent event) {
        try{
        Parent funcionario = FXMLLoader.load(getClass().getResource("FXML4Funcionario.fxml"));
        Scene scene = new Scene(funcionario);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonCategorias.getScene();
        }catch(Exception ex){
            System.out.println("Erro ao carregar fxml Funcionario" + ex);
        }
    }

    @FXML
    void onActionbuttonRelatorios(ActionEvent event) {

    }

    @FXML
    void onActionbuttonVendas(ActionEvent event) {

    }

    @FXML
    void onActionbuttonfabricantes(ActionEvent event) {

    }

    @FXML
    void onActionsButtonBackup(ActionEvent event) {

    }
    @FXML
    void onActionbuttonFornecedor (ActionEvent event) throws IOException{
        Parent fornecedor = FXMLLoader.load(getClass().getResource("FXML7Fornecedor.fxml"));
        Scene scene = new Scene(fornecedor);
        //Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
       // buttonFornecedores.getScene();
    }
    
    
}
