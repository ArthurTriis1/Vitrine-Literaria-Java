/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consultalogado;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import Dados.Dados;

/**
 *
 * @author arthu
 */
public class ConsultaLogado extends Application {
    
    public static Stage TelaConsultaLogado;
    
    @Override
    public void start(Stage stage) throws Exception {
        
        TelaConsultaLogado = stage;
        
        Parent root = FXMLLoader.load(getClass().getResource("ConsultaLogado_FXML.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.setTitle(Dados.login);
        stage.show();
    }

    /**
     * @param args the command line arguments 
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
