/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.farmacia.model.Cadastro;

/**
 *
 * @author Roberto
 */
public class TipoDocumentoCliente {
    private byte id;
    private String nome;

    public TipoDocumentoCliente(byte id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    
    public TipoDocumentoCliente(){
        
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return  nome;
    }
    
    
    
}
