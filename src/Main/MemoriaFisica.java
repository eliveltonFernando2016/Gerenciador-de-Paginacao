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
public class MemoriaFisica {

    private ArrayList<Endereco> memoria = new ArrayList();
    private int tamBloco;
    private int blocosLivres;
    private int idPagina;

     public void inicializar(int x,int y){
        tamBloco = x;
        blocosLivres = y;
    }

    public int getBlocosLivres() {
        return blocosLivres;
    }

    public void setBlocosLivres(int blocosLivres) {
        this.blocosLivres = blocosLivres;
    }
     
     

    public ArrayList<Endereco> getMemoria() {
        return memoria;
    }

    public void setMemoria(ArrayList<Endereco> memoria) {
        this.memoria = memoria;
    }

    public int getIdPagina() {
        return idPagina;
    }

    public void setIdPagina(int idPagina) {
        this.idPagina = idPagina;
    }

    public int getTamBloco() {
        return tamBloco;
    }
    
    public void adicionarProcesso(){
        
    }

}
