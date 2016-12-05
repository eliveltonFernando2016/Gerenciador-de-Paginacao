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

    private ArrayList<Endereco> memoriaVirtual = new ArrayList();
    private int tamVetor;
    private int blocosLivres;
    private int tamBloco;
    private Processo p;

    public MemoriaVirtual() {
    }

    public void inicializar(int x, int y) {
        tamBloco = x;
        blocosLivres = y;
    }
    
    public int getBlocosLivres() {
        return blocosLivres;
    }

    public void setBlocosLivres(int blocosLivres) {
        this.blocosLivres = blocosLivres;
    }

    public int getTamBloco() {
        return tamBloco;
    }

    public MemoriaVirtual(int tamVetor) {
        this.tamVetor = tamVetor;
    }

    public ArrayList<Endereco> getListaEndereco() {
        return memoriaVirtual;
    }

    public void setListaEndereco(ArrayList<Endereco> listaEndereco) {
        this.memoriaVirtual = listaEndereco;
    }

    public int getTamVetor() {
        return tamVetor;
    }

    public void setTamVetor(int tamVetor) {
        this.tamVetor = tamVetor;
    }
    
    public void adicionarProcesso(){
        
    }
    

}
