/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author elivelton
 */
public class Endereco {
    private int idEndereco;
    private int idProcesso;
    
    private int enderecoFisicoInicial = 4000;
    
    public int getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(int idEndereco) {
        this.idEndereco = idEndereco;
    }

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public Endereco(int idEndereco, int idProcesso) {
        this.idEndereco = idEndereco;
        this.idProcesso = idProcesso;
    }
    
    
    
}
