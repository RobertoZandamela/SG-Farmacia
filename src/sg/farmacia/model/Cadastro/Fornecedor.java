/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.model.Cadastro;

import java.util.Date;

/**
 *
 * @author Roberto
 */
public class Fornecedor extends Empresa {
    private Date dataCadastro;
    private String produtoF;
    
    
    public Fornecedor(int codigo, int nuit, String nome, String logotipo,
            String localizao,String email, Date dataCadastro, String produtoF){
        super(codigo,nuit,nome,logotipo,localizao,email);
        this.dataCadastro=dataCadastro;
        this.produtoF =produtoF;
        
    }
    public Fornecedor(){
        
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getProdutoF() {
        return produtoF;
    }

    public void setProdutoF(String produtoF) {
        this.produtoF = produtoF;
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

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
    
}
