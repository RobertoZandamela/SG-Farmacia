/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.cadastro.Model;

/**
 *
 * @author Roberto
 */
public class Empresa {
    protected int codigo,nuit;
    protected String nome,logotipo,localizao, email;
    
    public Empresa(int codigo, int nuit, String nome, String logotipo,
            String localizao,String email){
       this.codigo=codigo;
       this.nuit=nuit;
       this.localizao= localizao;
       this.logotipo= logotipo;
       this.nome =nome;
       this.email=email;
       
    }
    public Empresa(){
        this(0,0,"","","","");
    }      

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNuit() {
        return nuit;
    }

    public void setNuit(int nuit) {
        this.nuit = nuit;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogotipo() {
        return logotipo;
    }

    public void setLogotipo(String logotipo) {
        this.logotipo = logotipo;
    }

    public String getLocalizao() {
        return localizao;
    }

    public void setLocalizao(String localizao) {
        this.localizao = localizao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
