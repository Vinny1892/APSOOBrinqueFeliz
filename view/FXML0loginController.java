package view;
import br.com.fandrauss.fx.gui.WindowControllerFx;
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

/**
 * FXML Controller class
 *
 * @author kaio
 */
public class FXML0loginController extends WindowControllerFx implements Initializable {

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
    private TextField textFieldPassword;
    
    
 
    
      public ModelFuncionario getUserLogado(){
        return funcionarioLogado;
    }
    

    @FXML
    void onActionButtonLogar(ActionEvent event) throws IOException {
        String user = textFieldUser.getText();
        String password = textFieldPassword.getText();

        String passwordHashed = BCrypt.hashpw(password,  BCrypt.gensalt(12));
        System.out.println(passwordHashed);
          this.funcionarioLogado = null;
         this.funcionarioLogado = buscaFuncionario(user, passwordHashed);
            //System.out.println(funcionario.getEmail());
        if (funcionarioLogado != null && BCrypt.checkpw(password,funcionarioLogado.getSenha())) {//if (mf != null) {
              System.out.println(funcionarioLogado.getEmail());

            if (funcionarioLogado.isIsADM()) {//if (mf.isADM()) //chama tela adm
                 System.out.println(funcionarioLogado.isIsADM());
                 Stage stage = new Stage();
                 Parent p = FXMLLoader.load(getClass().getResource("FXML1Administrador.fxml"));
                Scene scene = new Scene(p);
                stage.setScene(scene);

            } else {//chama tela funcionario
//                
                
            }
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
