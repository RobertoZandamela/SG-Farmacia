/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.Controller.Cadastro;

import java.net.URL;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
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
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import sg.farmacia.model.Cadastro.Cliente;
import sg.farmacia.model.Cadastro.TipoDocumentoCliente;
import sg.farmacia.model.DAO.ClienteDAO;

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
    private TextField txt_numDocumento;

    @FXML
    private TextField txt_localEmissao;

    @FXML
    private TextField txt_DataEmissao;

    
    @FXML
    private Label lb_genero;

    @FXML
    private Label lb_naturalidade;

    @FXML
    private Label lb_dataNascimento;


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
    @FXML
    private ToggleGroup genero;
   
    
@FXML
    private ComboBox<TipoDocumentoCliente> combobox_tidoDocumento;
    private final List<TipoDocumentoCliente> tipodocumento= new ArrayList<>();
    private ObservableList<TipoDocumentoCliente> obser;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        carregarTipoDocumento();
        
    }    
    
    public void carregarTipoDocumento(){
        TipoDocumentoCliente tipo1 = new TipoDocumentoCliente((byte)1,"Bilhete de Identidade");
        TipoDocumentoCliente tipo2 = new TipoDocumentoCliente((byte)2,"Carta de Condução");
        TipoDocumentoCliente tipo3 = new TipoDocumentoCliente((byte)3,"PassaPorte");
        TipoDocumentoCliente tipo4 = new TipoDocumentoCliente((byte)4,"Cartão de Eleitor");
        tipodocumento.add(tipo1);
        tipodocumento.add(tipo2);
        tipodocumento.add(tipo3);
        tipodocumento.add(tipo4);
        obser = FXCollections.observableArrayList(tipodocumento);
        combobox_tidoDocumento.setItems(obser);
    }
   
    
    public char radioButtons()
    //Pega o genero do cliente
    {
        char sexo;
        if(this.genero.getSelectedToggle().equals(this.rad_masculino)){
            sexo='M';
        }else
            sexo='F';
        return sexo;
    }
      @FXML
    private void gravar(ActionEvent event) throws ParseException, SQLException{
        System.out.println("Chegou aqui");
        if(event.getSource()==bt_gravar){
            System.out.println("Entrou no if");
            Cliente cliente = new Cliente();
            cliente.setNome(text_nomeCliente.getText());
             cliente.setGenero(radioButtons());
            cliente.setEmail(txt_email.getText());
            cliente.setCell(Long.parseLong(this.text_contacto.getText()));
            cliente.setCellAlternativo(Long.parseLong(this.text_ContactoAlternativo.getText()));
            cliente.setFoto("");
            //cliente.setDataCadastro()
            try{
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
            cliente.setDataNascimento(formato.parse(this.txt_dataNascimento.getText()));
            cliente.setDataEmissao(formato.parse(this.txt_DataEmissao.getText()));
 
            }catch(ParseException par){
                System.out.println("Erro no formato de data");
            }
            cliente.setTipoDocumento(combobox_tidoDocumento.getValue().getNome());
            cliente.setNumDocumento(this.txt_numDocumento.getText());
            cliente.setDistrito(this.txt_distrito.getText());
            cliente.setNumCasa(this.txt_numCasa.getText());
            cliente.setBairro(this.txt_bairro.getText());
            cliente.setProvincia(this.txt_provincia.getText());
            cliente.setQuarteirao(this.txt_quarteirao.getText());
            cliente.setRua(this.txt_rua.getText());
            
            System.out.println(cliente.getNome());
            
            ClienteDAO add = new ClienteDAO();
            add.inserirClinte(cliente);
        }else{
            System.out.println("Não funcionam phaaa");
        }
        
      
    }
    public void guardarClienteBD(Cliente cl){
        
    }
}
