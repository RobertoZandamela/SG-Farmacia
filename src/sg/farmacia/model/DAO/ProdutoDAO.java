/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.farmacia.model.BDConexao.DataBaseMYSQL;
import sg.farmacia.model.Cadastro.Cliente;
import sg.farmacia.model.Cadastro.Produto;

/**
 *
 * @author Roberto
 */
public class ProdutoDAO {
    private Connection conexao;
    
    public ProdutoDAO() throws ClassNotFoundException, SQLException{
        try{
            conexao=DataBaseMYSQL.getConnection();
        }catch(SQLException | ClassNotFoundException ex){
            System.out.println("Erro de conexao:" +ex.getMessage());
        }
    }
    
    
    public void inseriProduto(){
        
    }
    public List<Produto> listarProduto() throws SQLException{
     
        String query="SELECT * FROM clientes";
        List<Produto> lista=null;
        try{
            PreparedStatement
                    stmt=conexao.prepareStatement(query);
            ResultSet rs =stmt.executeQuery();
            String queryAux = null;
            PreparedStatement stmtAux = conexao.prepareStatement(queryAux);
            lista = new ArrayList<>();
            while(rs.next()){
                Produto produto = new Produto();
                String codigo = rs.getString("id");
                produto.setCodigo(codigo);
                String descricao = rs.getString("descricao");
                produto.setDescricao(descricao);
                produto.setFormaFarmaceutica(rs.getString("forma_farmaceutica"));
                produto.setDosagem(rs.getFloat("dosagem"));
                produto.setFotoProduto(rs.getString("foto_produto"));
                produto.setMarca(rs.getString("marca"));
                produto.setReferencia(rs.getString("referencia"));
                produto.setValidade(rs.getDate("validade"));
                produto.setPrecoCompra(rs.getDouble("preco_compra"));
                produto.setPrecoVenda(rs.getDouble("preco_venda"));
                produto.setPrecoAtacado(rs.getDouble("preco_atacado"));
                produto.setMarkup(rs.getFloat("markup"));
                produto.setFornecedor(rs.getString("fornecedor"));
                produto.setEstoqueMinimo(rs.getByte("estoque_minimo"));
                produto.setGarantia(rs.getDate("garantia"));
                produto.setCategoria(rs.getString("categoria"));
               lista.add(produto);
                        
            }
            return lista;
        }catch (SQLException ex){
            System.out.println("Erro de listagem da tabela da base de dados: "
                    + ex.getMessage());
            for(int i=0;i<lista.size();i++){
                lista.get(i).toString();
            }
            return new ArrayList<>();
        }
       
    } 
}

