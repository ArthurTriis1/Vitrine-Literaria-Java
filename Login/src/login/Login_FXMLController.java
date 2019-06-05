package login;

import static Dados.ConexaoDB.conectarBD;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import Dados.Dados;
import static login.Login.TelaLogin;
import consultalogado.ConsultaLogado;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.stage.Stage;


public class Login_FXMLController implements Initializable{

    @FXML
    private Button bt_login;

    @FXML
    private Label lb_login;

    @FXML
    private TextField tx_senha;

    @FXML
    private TextField tx_login;

    @FXML
    private Label lb_senha;

    @FXML
    private Button bt_apnsconsulta;


    @FXML
    void click_bt_apnsconsulta(ActionEvent event) {
        

        
        
        
         try{
                
                TelaLogin.close();
            }
            
            catch (Exception e) {
            }
        
    }

    @FXML
    void click_bt_login(ActionEvent event) {
            
        if(tx_login.getText().equals("arthur@ifpe")  &&  "1234".equals(tx_senha.getText())){
            
            
            Dados.login = tx_login.getText();
            
            ConsultaLogado tela = new ConsultaLogado();
            
            try{
                tela.start(new Stage());
                TelaLogin.close();
            }
            
            catch (Exception e) {
                // TODO Auto-generated catch block

            }
            
            
       
        }

        else{   
        }
        
        
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        conectarBD();
    }

}


