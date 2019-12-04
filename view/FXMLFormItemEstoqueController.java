package view;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
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
        // TODO
    }  
    
    @FXML
    private Button buttonSalvar;

    @FXML
    private TextField textFieldNomeBrinquedo;

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
        Parent paret = FXMLLoader.load(getClass().getResource("FXMLRelatorioEstoque.fxml"));
        Scene scene = new Scene(paret);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
        buttonVoltar.getScene().getWindow().hide();

    }
    
}
