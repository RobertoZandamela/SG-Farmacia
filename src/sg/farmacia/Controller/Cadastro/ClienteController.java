/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.Controller.Cadastro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Roberto
 */
public class ClienteController implements Initializable {

    @FXML
    private TitledPane panel_cadastroClente;

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
    private Pane panel_formulario;

    @FXML
    private Label lb_codigo;

    @FXML
    private Label lb_dataCadastro;

    @FXML
    private Label lb_nomeCliente;

    @FXML
    private Label lb_contacto;

    @FXML
    private Label lb_contactoAlternativo;

    @FXML
    private TextField text_codigo;

    @FXML
    private TextField text_dataCadastro;

    @FXML
    private TextField text_nomeCliente;

    @FXML
    private TextField text_contacto;

    @FXML
    private TextField text_ContactoAlternativo;

    @FXML
    private Label lb_tipoDocumento;

    @FXML
    private Label lb_numDocumento;

    @FXML
    private Label lb_localEmissao;

    @FXML
    private Label lb_dataEmissao;

    @FXML
    private Label lb_fotoClliente;

    @FXML
    private ComboBox<?> txt_tipoDocumento;

    @FXML
    private TextField txt_numDocumento;

    @FXML
    private TextField txt_localEmissao;

    @FXML
    private TextField txt_DataEmissao;

    @FXML
    private Label lb_estadoCivil;

    @FXML
    private Label lb_genero;

    @FXML
    private Label lb_naturalidade;

    @FXML
    private Label lb_dataNascimento;

    @FXML
    private ComboBox<?> txt_estadoCivil;

    @FXML
    private ComboBox<?> txt_genero;

    @FXML
    private TextField txt_naturalidade;

    @FXML
    private TextField txt_dataNascimento;

    @FXML
    private Label lb_numCasa;

    @FXML
    private Label lb_bairro;

    @FXML
    private Label lb_distrito;

    @FXML
    private Label lb_provincia;

    @FXML
    private TextField txt_numCasa;

    @FXML
    private Label lb_quarteirao;

    @FXML
    private TextField txt_rua;

    @FXML
    private TextField txt_quarteirao;

    @FXML
    private Label lb_rua;

    @FXML
    private TextField txt_bairro;

    @FXML
    private TextField txt_distrito;

    @FXML
    private TextField txt_provincia;

    @FXML
    private ImageView img_fotoCliente;

    @FXML
    private Label lb_email;

    @FXML
    private TextField txt_email;

    @FXML
    private Button bt_inserirFotoCliente;

    @FXML
    private Label lb_observacao;

    @FXML
    private TextArea txt_observacao;
    
    @FXML
    private SplitMenuButton tipoDocumento;
     @FXML
    private RadioButton rad_masculino;

    @FXML
    private RadioButton rad_femenino;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
     
}
