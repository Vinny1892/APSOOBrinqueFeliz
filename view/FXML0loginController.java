package view;

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
<<<<<<< HEAD
import sun.applet.Main;
=======
>>>>>>> 4741ae9d685f720065ba2924d89defaa341648cc

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
        ModelFuncionario mf = buscaFuncionario(user, password);
        if (true) {//if (mf != null) {
            Stage stage = new Stage();
            if (true) {//if (mf.isADM()) //chama tela adm
                Parent p = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
                Scene scene = new Scene(p);
                stage.setScene(scene);

            } else {//chama tela funcionario
                Parent p = FXMLLoader.load(getClass().getResource("FXML4Funcionario.fxml"));
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
