/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

/**
 *
 * @author Roberto
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Tab bt_arquivo;

    @FXML
    private Tab bt_cadastro;

    @FXML
    private Tab bt_movimentacao;

    @FXML
    private Tab bt_financeiro;

    @FXML
    private Tab bt_relatorio;

    @FXML
    private Tab bt_consultas;

    @FXML
    private Tab bt_utilitarios;

    @FXML
    private Tab bt_sair;

    @FXML
    private ImageView pane_vendas;

    @FXML
    private ImageView pane_devolucao;

    @FXML
    private Pane pane_produtos;

    @FXML
    private Pane pane_recibo;

    @FXML
    private Pane pane_clientes;

    @FXML
    private Pane pane_compras;

    @FXML
    private Pane pane_contasReceber;

    @FXML
    private Pane pane_resumoVendas;

    @FXML
    private Pane pane_despesas;

    @FXML
    private Pane pane_fluxoCaixa;

    @FXML
    private Pane pane_sair; 
    @FXML
    private Label label;
    
    @FXML
    void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
