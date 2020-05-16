
package sg.farmacia.model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import sg.farmacia.model.BDConexao.DataBaseMYSQL;
import sg.farmacia.model.Cadastro.Cliente;
/**
 *
 * @author Roberto
 */
public class ClienteDAO {
    private Connection conexao;
    
    public ClienteDAO(){
        
        try{
            conexao=DataBaseMYSQL.getConnection();
        }catch(SQLException|ClassNotFoundException ex){
            System.out.println("Erro de conexao: "+ex.getMessage());
    }
}
    public void inserirClinte(){
        
    }
    
    public List<Cliente> listarClientes() throws SQLException{
        String query="SELECT * FROM clientes";
        List<Cliente> lista=null;
        try{
            PreparedStatement
                    stmt=conexao.prepareStatement(query);
            ResultSet rs =stmt.executeQuery();
            String queryAux = null;
            PreparedStatement stmtAux = conexao.prepareStatement(queryAux);
            lista = new ArrayList<>();
            while(rs.next()){
                Cliente cl = new Cliente();
                int codigo = rs.getInt("id");
                cl.setCodigo(codigo);
                cl.setNome(rs.getString("nome"));
                cl.setEmail(rs.getString("email"));
                cl.setFoto(rs.getString("foto"));
                cl.setDataCadastro(rs.getDate("data_cadastro"));
                cl.setCelular(rs.getLong("contacto"));
                cl.setDataNascimento(rs.getDate("data_nascimento"));
                cl.setNumBI(rs.getString("numero_bi"));
                cl.setDataEmissao(rs.getDate("data_emisao_bi"));
                cl.setMorada(rs.getString("morada"));
               lista.add(cl);
                        
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