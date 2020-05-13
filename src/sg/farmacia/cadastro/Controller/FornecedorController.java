/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.cadastro.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author Roberto
 */
public class FornecedorController implements Initializable {

    @FXML
    private Button bt_novo;

    @FXML
    private Button bt_alterar;

    @FXML
    private Button bt_gravar;

    @FXML
    private Button bt_procurar;

    @FXML
    private Button bt_excluir;

    @FXML
    private Label lb_Codigo;

    @FXML
    private Label lb_cadastro;

    @FXML
    private Label lb_nomeFornecedor;

    @FXML
    private Label lb_contacto;

    @FXML
    private Label lb_contactoAuxiliar;

    @FXML
    private TextField txt_codigo;

    @FXML
    private TextField txt_dataCadastro;

    @FXML
    private TextField txt_nomeFornecedor;

    @FXML
    private TextField txt_contacto;

    @FXML
    private TextField txt_contactoAuxiliar;

    @FXML
    private Label lb_email;

    @FXML
    private TextField txt_email;

    @FXML
    private ImageView img_lotipo;

    @FXML
    private Label lb_logotipoFornecedor;

    @FXML
    private Label lb_nuit;

    @FXML
    private TextField txt_nuit;

    @FXML
    private TextField txt_localizacao;

    @FXML
    private Label lb_localizacao;

    @FXML
    private Button bt_adicionarLogo;

    @FXML
    private Label lb_observacao;

    @FXML
    private TextArea txt_observacao;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
