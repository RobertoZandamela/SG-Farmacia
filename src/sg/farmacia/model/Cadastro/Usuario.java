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
public class Usuario extends Pessoa{
    private String username,funcao,senha;
    private double salario;
  
    
    public Usuario (int codigo,int celular,String nome, String email,String foto,
         String numBI, String morada,
         Date dataEmissao, Date dataNascimento, String username, String funcao, 
         double salario,String senha){
        super();
        this.username =username;
        this.funcao= funcao;
        this.salario =salario;
        this.senha=senha;
    }
    public Usuario(){
        super();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
    public long getCelular() {
        return celular;
    }

    @Override
    public void setCelular(long celular) {
        this.celular = celular;
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
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getFoto() {
        return foto;
    }

    @Override
    public void setFoto(String foto) {
        this.foto = foto;
    }

    @Override
    public String getNumBI() {
        return numBI;
    }

    @Override
    public void setNumBI(String numBI) {
        this.numBI = numBI;
    }


    @Override
    public String getMorada() {
        return morada;
    }

    @Override
    public void setMorada(String morada) {
        this.morada = morada;
    }

    @Override
    public Date getDataEmissao() {
        return dataEmissao;
    }

    @Override
    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    @Override
    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
}
