/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author elivelton
 */
public class MemoriaVirtual {
    private ArrayList<Endereco> listaEndereco = new ArrayList();
    private int tamVetor;

    public MemoriaVirtual(int tamVetor) {
        this.tamVetor = tamVetor;
    }

    public ArrayList<Endereco> getListaEndereco() {
        return listaEndereco;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.listaEndereco = listaEndereco;
    }

    public int getTamVetor() {
        return tamVetor;
    }

    public void setTamVetor(int tamVetor) {
        this.tamVetor = tamVetor;
    }
}
