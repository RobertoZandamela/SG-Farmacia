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
public class Produto {
    private String codigo;
    private String descricao;
    private String formaFarmaceutica;
    private float dosagem;
    private String fotoProduto;
    private String marca;
    private String referencia;
    private Date validade;
    private double precoCompra;
    private double precoVenda;
    private double precoAtacado;
    private float markup;
    private String fornecedor;
    private int estoqueMinimo;
    private Date garantia;
    private String grupo;
    private String subGrupo;
    
    public Produto(String codigo, String descricao, String formaFarmaceutica, 
            float dosagem, String fotoProduto,String marca,String referencia,
            Date validade,double precoCompra, double precoVenda, 
            double precoAtacado,float markup, String fornecedor,int estoqueMinimo,
            Date garantia, String grupo, String subGrupo){
        this.codigo=codigo;
        this.descricao=descricao;
        this.formaFarmaceutica=formaFarmaceutica;
        this.dosagem=dosagem;
        this.fotoProduto=fotoProduto;
        this.marca=marca;
        this.referencia=referencia;
        this.validade= validade;
        this.precoCompra= precoCompra;
        this.precoVenda = precoVenda;
        this.precoAtacado = precoAtacado;
        this.markup =markup;
        this.fornecedor =fornecedor;
        this.estoqueMinimo = estoqueMinimo;
        this.garantia = garantia;
        this.grupo= grupo;
        this.subGrupo = subGrupo;
        
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFormaFarmaceutica() {
        return formaFarmaceutica;
    }

    public void setFormaFarmaceutica(String formaFarmaceutica) {
        this.formaFarmaceutica = formaFarmaceutica;
    }

    public float getDosagem() {
        return dosagem;
    }

    public void setDosagem(float dosagem) {
        this.dosagem = dosagem;
    }

    public String getFotoProduto() {
        return fotoProduto;
    }

    public void setFotoProduto(String fotoProduto) {
        this.fotoProduto = fotoProduto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Date getValidade() {
        return validade;
    }

    public void setValidade(Date validade) {
        this.validade = validade;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    public double getPrecoAtacado() {
        return precoAtacado;
    }

    public void setPrecoAtacado(double precoAtacado) {
        this.precoAtacado = precoAtacado;
    }

    public float getMarkup() {
        return markup;
    }

    public void setMarkup(float markup) {
        this.markup = markup;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public Date getGarantia() {
        return garantia;
    }

    public void setGarantia(Date garantia) {
        this.garantia = garantia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(String subGrupo) {
        this.subGrupo = subGrupo;
    }
   
    
}
