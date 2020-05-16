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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 * FXML Controller class
 *
 * @author Roberto
 */
public class ProdutoController implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Label lb_cadastroProduto;

    @FXML
    private Button bt_novo;

    @FXML
    private Button bt_guardar;

    @FXML
    private Button bt_alterar;

    @FXML
    private Button bt_procurar;

    @FXML
    private Button bt_apagar;

    @FXML
    private Button bt_imprimirEtiquete;

    @FXML
    private Button bt_sair;

    @FXML
    private Label lb_codigo;

    @FXML
    private TextField txt_codigo;

    @FXML
    private Button bt_gerarCodigo;

    @FXML
    private Label lb_descricao;

    @FXML
    private TextField txt_descricao;

    @FXML
    private Label lb_precoCompra;

    @FXML
    private Label lb_precoVenda;

    @FXML
    private TextField txt_precoCompra;

    @FXML
    private TextField txt_precoVenda;

    @FXML
    private ComboBox<?> cbox_quantidade;

    @FXML
    private Label lb_formaFarmaceutica;

    @FXML
    private ComboBox<?> cbox_formaFarmcautica;

    @FXML
    private ComboBox<?> cbox_dosagem;

    @FXML
    private Label lb_dosagem;

    @FXML
    private ImageView img_fotoproduto;

    @FXML
    private Label lb_fotoProduto;

    @FXML
    private Label lb_categoria;

    @FXML
    private Label lb_fornecedor;

    @FXML
    private ComboBox<?> cbox_categoria;

    @FXML
    private Button bt_cadastrarCategoria;

    @FXML
    private ComboBox<?> cbox_fornecedor;

    @FXML
    private Button bt_cadastrarForneceedor;

    @FXML
    private Label lb_estoqueMinimo;

    @FXML
    private TextField txt_estoqueMinimo;

    @FXML
    private Label lb_garantia;

    @FXML
    private TextField txt_garantia;

    @FXML
    private Label lb_marca;

    @FXML
    private TextField txt_marca;

    @FXML
    private Label lb_referencia;

    @FXML
    private TextField txt_referencia;

    @FXML
    private TextField txt_validade;

    @FXML
    private Label lb_validade;

    @FXML
    private Label lb_obsevacao;

    @FXML
    private TextArea txt_observacao;

    @FXML
    private Label lb_nota1;

    @FXML
    private Label lb_nota2;

    @FXML
    private Label lb_nota3;

    @FXML
    private Label lb_estoqueActual;

    @FXML
    private Label lb_valorEstoqueActual;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
