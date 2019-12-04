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
import java.sql.SQLException;
import javafx.scene.control.PasswordField;
import model.ModelFuncionario;

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
    ModelFuncionario funcionarioLogado;
    @FXML
    private Button buttonLogar;

    @FXML
    private TextField textFieldUser;

    @FXML
    private PasswordField  textFieldPassword;
    
    
 
    
     
    

    @FXML
    void onActionButtonLogar(ActionEvent event) throws IOException, SQLException{
        String user = textFieldUser.getText();
        String password = textFieldPassword.getText();
        String passwordHashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
         System.out.println(password);
        System.out.println(passwordHashed);
          this.funcionarioLogado = null;
          this.funcionarioLogado = buscaFuncionario(user, passwordHashed);
           System.out.println(funcionarioLogado.getEmail());
        if (funcionarioLogado != null && BCrypt.checkpw(password,funcionarioLogado.getSenha())) {//if (mf != null) {
            Stage stage = new Stage();
            if (funcionarioLogado.isIsADM()) {//if (mf.isADM()) //chama tela adm
                Parent p = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
                Scene scene = new Scene(p);
                stage.setScene(scene);
            } else {//chama tela funcionario
//                Parent p = FXMLLoader.load(getClass().getResource("FXML8Venda.fxml"));
//                Scene scene = new Scene(p);
//                stage.setScene(scene);
                
                    FXML8VendaController telaVenda = new FXML8VendaController(funcionarioLogado);
                    FXMLLoader loader= new FXMLLoader(getClass().getResource("FXML8Venda.fxml"));
                    loader.setController(telaVenda);
                    Parent root =  loader.load();
                    Scene scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
                
            }
            stage.show();
            buttonLogar.getScene().getWindow().hide();
            //fecha essa tela1 atual
        } else {
            Alert dialogoInfo = new Alert(Alert.AlertType.INFORMATION);
            dialogoInfo.setTitle("Login");
            dialogoInfo.setHeaderText("Login negado");
            dialogoInfo.setContentText("Login ou senha incorreto(s), não foram encontrado, ou não existem.");
            dialogoInfo.showAndWait();
        }
    }

}
