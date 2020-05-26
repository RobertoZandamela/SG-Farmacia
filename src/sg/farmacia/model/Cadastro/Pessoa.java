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
    protected long cell, cellAlternativo;
    protected char genero;
   protected String nome,email,foto,tipoDocumento,numDocumento,rua,quarteirao,
           numCasa,bairro,distrito,provincia;
   protected Date dataEmissao,dataNascimento, dataCadastro;

    public Pessoa(int codigo, long cell, long cellAlternativo, char genero, 
            String nome, String email, String foto, String tipoDocumento, 
            String numDocumento, String rua, String quarteirao, String numCasa, 
            String bairro, String distrito, String provincia, Date dataEmissao, 
            Date dataNascimento, Date dataCadastro) {
        this.codigo = codigo;
        this.cell = cell;
        this.cellAlternativo = cellAlternativo;
        this.genero = genero;
        this.nome = nome;
        this.email = email;
        this.foto = foto;
        this.tipoDocumento = tipoDocumento;
        this.numDocumento = numDocumento;
        this.rua = rua;
        this.quarteirao = quarteirao;
        this.numCasa = numCasa;
        this.bairro = bairro;
        this.distrito = distrito;
        this.provincia = provincia;
        this.dataEmissao = dataEmissao;
        this.dataNascimento = dataNascimento;
        this.dataCadastro = dataCadastro;
    }

    

    

    
    public Pessoa(){ 
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getQuarteirao() {
        return quarteirao;
    }

    public void setQuarteirao(String quarteirao) {
        this.quarteirao = quarteirao;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(String numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

   

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getQuerteirao() {
        return quarteirao;
    }

    public void setQuerteirao(String querteirao) {
        this.quarteirao = querteirao;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
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

    public void setCell(Long cell){
        this.cell= cell;
    }
    public long getCell(){
        return cell;
    }
    public void setCellAlternativo(long cellAlternativo){
        this.cellAlternativo=cellAlternativo;    
    }
    public long getCellAlternativo(){
        return cellAlternativo;
    }
}