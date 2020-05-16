
package sg.farmacia.model.Cadastro;
import java.util.Date;

/**
 *
 * @author Roberto
 */
public class Cliente extends Pessoa {
   
    private Date dataCadastro;
    
   public Cliente (int codigo,int celular,String nome, String email,String foto,
         String numBI,String morada,
         Date dataEmissao, Date dataNascimento, Date dataCadastro){
this.dataCadastro =dataCadastro;

   }
    public Cliente(){
        super();
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

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
