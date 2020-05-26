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

    public Usuario(String username, String funcao, String senha, double salario, 
            int codigo, long cell, long cellAlternativo, char genero, String nome,
            String email, String foto, String tipoDocumento, String numDocumento, 
            String rua, String quarteirao, String numCasa, String bairro, String 
                    distrito, String provincia, Date dataEmissao, 
                    Date dataNascimento, Date dataCadastro) {
        super(codigo, cell, cellAlternativo, genero, nome, email, foto, 
                tipoDocumento, numDocumento, rua, quarteirao, numCasa, bairro,
                distrito, provincia, dataEmissao, dataNascimento, dataCadastro);
        this.username = username;
        this.funcao = funcao;
        this.senha = senha;
        this.salario = salario;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public char getGenero() {
        return genero;
    }

    @Override
    public void setGenero(char genero) {
        this.genero = genero;
    }

    @Override
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    @Override
    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Override
    public String getNumDocumento() {
        return numDocumento;
    }

    @Override
    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    @Override
    public Date getDataCadastro() {
        return dataCadastro;
    }

    @Override
    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
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
    public long getCell() {
        return cell;
    }

    public void setCell(long cell) {
        this.cell = cell;
    }

    @Override
    public long getCellAlternativo() {
        return cellAlternativo;
    }

    @Override
    public void setCellAlternativo(long cellAlternativo) {
        this.cellAlternativo = cellAlternativo;
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
    public String getRua() {
        return rua;
    }

    @Override
    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String getQuarteirao() {
        return quarteirao;
    }

    @Override
    public void setQuarteirao(String quarteirao) {
        this.quarteirao = quarteirao;
    }

    @Override
    public String getNumCasa() {
        return numCasa;
    }

    @Override
    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    @Override
    public String getBairro() {
        return bairro;
    }

    @Override
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String getDistrito() {
        return distrito;
    }

    @Override
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @Override
    public String getProvincia() {
        return provincia;
    }

    @Override
    public void setProvincia(String provincia) {
        this.provincia = provincia;
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
