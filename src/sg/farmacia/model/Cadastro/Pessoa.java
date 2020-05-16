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
public class Pessoa {
    protected int codigo;
    protected long celular;
   protected String nome,email,foto,numBI,morada;
   protected Date dataEmissao,dataNascimento;
 
 public Pessoa(int codigo,int celular,String nome, String email,String foto,
         String numBI,String morada,
         Date dataEmissao, Date dataNascimento){
     this.codigo=codigo;
     this.celular=celular;
     this.nome= nome;
     this.email=email;
     this.foto=foto;
     this.numBI=numBI;
     this.morada =morada;
     this.dataEmissao= dataEmissao;
    this.dataNascimento=dataNascimento;
     
 }
   
    public Pessoa(){ 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getCelular() {
        return celular;
    }

    public void setCelular(long celular) {
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getNumBI() {
        return numBI;
    }

    public void setNumBI(String numBI) {
        this.numBI = numBI;
    }



    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
