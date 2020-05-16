/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.model.Cadastro;

/**
 *
 * @author Roberto
 */
public class Farmacia extends Empresa {
    private String slogan;
    private String licenca;
    
    public Farmacia(int codigo, int nuit, String nome, String logotipo,
            String localizao,String email, String slogan,String licenca){
        super(codigo,nuit,nome,logotipo,localizao,email);
        this.slogan =slogan;
        this.licenca =licenca;
    }
    
    public Farmacia(){
        this(0,0,"","","","","","");
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public String getLicenca() {
        return licenca;
    }

    public void setLicenca(String licenca) {
        this.licenca = licenca;
    }

    @Override
    public int getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int getNuit() {
        return nuit;
    }

    @Override
    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getLogotipo() {
        return logotipo;
    }

    @Override
    public void setLogotipo(String logotipo) {
        this.logotipo = logotipo;
    }

    @Override
    public String getLocalizao() {
        return localizao;
    }

    @Override
    public void setLocalizao(String localizao) {
        this.localizao = localizao;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
