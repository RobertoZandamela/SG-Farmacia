
package sg.farmacia.model.DAO;

import java.sql.Connection;
import java.sql.Date;
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
    public void inserirClinte(Cliente cl) throws SQLException {
        
        //Implementar a query
        String query="INSERT INTO clientes(nome,genero,email,contacto,"
                + "contacto_alternativo,foto,data_nascimento,"
                + "tipo_documento,num_documento,data_emissao_documento,"
                + "num_casa,rua,quarteirao,bairro,distrito,provincia) VALUES(?,"
                + "?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";                
        try {
            try (PreparedStatement stmt = conexao.prepareStatement(query)) {
                stmt.setString(1, cl.getNome());
                stmt.setString(2, String.valueOf(cl.getGenero()));
                stmt.setString(3, cl.getEmail());
                stmt.setLong(4, cl.getCell());
                stmt.setLong(5, cl.getCellAlternativo());
                stmt.setString(6, cl.getFoto());
                stmt.setDate(7, (Date) cl.getDataNascimento());
                stmt.setString(8, cl.getTipoDocumento());
                stmt.setString(9, cl.getNumDocumento());
                stmt.setDate(10,(Date) cl.getDataEmissao());
                stmt.setString(11, cl.getNumCasa());
                stmt.setString(12, cl.getRua());
                stmt.setString(13, cl.getQuarteirao());
                stmt.setString(14, cl.getBairro());
                stmt.setString(15, cl.getDistrito());
                stmt.setString(16, cl.getProvincia());
                stmt.executeUpdate();
            }                             
        } catch (SQLException ex) {
            System.out.println("Erro de insercao da base de dados:: "+ex.getMessage());
        }
    

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
                cl.setCodigo(rs.getInt("id"));
                cl.setNome(rs.getString("nome"));
                String sexo = rs.getString("genero");
                cl.setGenero(sexo.charAt(0));
                cl.setEmail(rs.getString("email"));
                cl.setCell(rs.getLong("contacto"));
                cl.setCellAlternativo(rs.getLong("contacto_alternativo"));
                cl.setFoto(rs.getString("foto"));
                cl.setDataCadastro(rs.getDate("data_cadastro"));
                cl.setDataNascimento(rs.getDate("data_nascimento"));
                cl.setTipoDocumento(rs.getString("tipo_documento"));
                cl.setNumDocumento(rs.getString("num_documento"));
                cl.setDataEmissao(rs.getDate("data_emisao_documento"));
                cl.setNumCasa(rs.getString("num_casa"));
                cl.setRua(rs.getString("rua"));
                cl.setQuarteirao(rs.getString("quarteirao"));
                cl.setBairro(rs.getString("bairro"));
                cl.setDistrito(rs.getString("distrito"));
                cl.setProvincia(rs.getString("provincia"));
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