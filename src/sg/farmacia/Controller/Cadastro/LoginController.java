/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.Controller.Cadastro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Roberto
 */
public class LoginController implements Initializable {

    
      @FXML
    private AnchorPane label_nomeFarmacia;

    @FXML
    private ImageView img_logo;

    @FXML
    private Button bt_entrar;

    @FXML
    private Button bt_cancelar;

    @FXML
    private ImageView img_iconUsername;

    @FXML
    private ImageView img_iconSenha;
    
      @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        bt_entrar.setOnAction((ActionEvent event) -> {
        });
         
    }    
    
}
