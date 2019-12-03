package view;
import helpers.BCrypt;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.Scene;
import static controller.ControllerFuncionario.buscaFuncionario;
import model.ModelFuncionario;
import sun.applet.Main;

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML0loginController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Button buttonLogar;

    @FXML
    private TextField textFieldUser;

    @FXML
    private TextField textFieldPassword;

    @FXML
    void onActionButtonLogar(ActionEvent event) throws IOException {
        String user = textFieldUser.getText();
        String password = textFieldPassword.getText();
        String passwordHashed = BCrypt.hashpw(password,  BCrypt.gensalt(6));
        
        ModelFuncionario funcionario = buscaFuncionario(user, password);
        if (true) {//if (
            Stage stage = new Stage();
            if (false) {//if (mf.isADM()) //chama tela adm
                 System.out.println(passwordHashed);
                 System.out.println(BCrypt.checkpw(password, passwordHashed));
                Parent p = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
                Scene scene = new Scene(p);
                stage.setScene(scene);

            } else {//chama tela funcionario
                FXMLLoader loader = FXMLLoader.load(getClass().getResource("FXML8Venda.fxml"));
                loader.setController(new FXML8VendaController(funcionario));
                Parent p = loader.load();
                Scene scene = new Scene(p);
                stage.setScene(scene);

            }
            stage.show();
            //fecha essa tela1 atual
            buttonLogar.getScene().getWindow().hide();
        } else {
            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("Login");
            dialogoInfo.setHeaderText("Login negado");
            dialogoInfo.setContentText("Login ou senha incorreto(s), não foram encontrado, ou não existem.");
            dialogoInfo.showAndWait();
        }
    }

}
