package consultalogado;

import static Dados.ConexaoDB.conectarBD;
import Dados.Livro;
import static Dados.Dados.getObooklist;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class ConsultaLogado_FXMLController implements Initializable{
    

    
    @FXML
    private Button bt_search;
    
    @FXML
    private ImageView im_capa;// = new ImageView();

    @FXML
    private Label lbtitulo;

    @FXML
    private ListView<Livro> bookList;
    @FXML
    private Label lbautor;

    @FXML
    private Label lb_edicao;

    @FXML
    private Label lb_ano;

    @FXML
    private Label lb_editora;

    @FXML
    private Label lb_qnt;

    @FXML
    void ListClick(MouseEvent event) {
        lbtitulo.setText("Titulo: " + bookList.getSelectionModel().getSelectedItem().getTitulo());
        lbautor.setText("Autor: " + bookList.getSelectionModel().getSelectedItem().getAutor());
        lb_edicao.setText("Edição: "+bookList.getSelectionModel().getSelectedItem().getEdição());
        lb_ano.setText("Ano: "+bookList.getSelectionModel().getSelectedItem().getAno());
        lb_editora.setText("Editora: " + bookList.getSelectionModel().getSelectedItem().getEditora());
        lb_qnt.setText("Disp: " + (bookList.getSelectionModel().getSelectedItem().getQntdd()- bookList.getSelectionModel().getSelectedItem().getQntdd_aluga())+"/"+ bookList.getSelectionModel().getSelectedItem().getQntdd());
        Image image = new Image("/imagens/" + bookList.getSelectionModel().getSelectedItem().getCapa() + ".jpg");
        im_capa.setImage(image);
       
    }
    
    @FXML
    void SearcClick(ActionEvent event) {
       ObservableList newBookList = FXCollections.observableArrayList();
        newBookList.add(new Livro("Teste1" , "Pequeno Principe", "2", "2000", "intrinsica", 13, 5,1, "capa1"));
        newBookList.add(new Livro("Teste2" , "A incendiaria", "3", "2001", "C&A das letras", 78, 5,2,"capa2"));
        bookList.getItems().setAll(newBookList);
       
    }
    
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        conectarBD();
        bookList.getItems().clear();
        bookList.getItems().setAll(getObooklist());
         
    }

}

