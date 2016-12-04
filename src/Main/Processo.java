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
public class Processo {
    private int idProcesso;
    private int tamProcesso;
    private ArrayList<Integer> paginas = new ArrayList();
    private MemoriaVirtual memoriaVirtual = new MemoriaVirtual();

    public Processo(int idProcesso, int tamProcesso) {
        this.idProcesso = idProcesso;
        this.tamProcesso = tamProcesso;
    }
    
    private void inicializar(){
        MemoriaVirtual memoriaVirtual = new MemoriaVirtual();
        memoriaVirtual.preencherMemoria(this);
    }

    public MemoriaVirtual getMemoriaVirtual() {
        return memoriaVirtual;
    }

    public void setMemoriaVirtual(MemoriaVirtual memoriaVirtual) {
        this.memoriaVirtual = memoriaVirtual;
    }
    
    
    
    public void memoriaVirtual(){
    }
    
    

    public int getIdProcesso() {
        return idProcesso;
    }

    public void setIdProcesso(int idProcesso) {
        this.idProcesso = idProcesso;
    }

    public int getTamProcesso() {
        return tamProcesso;
    }

    public void setTamProcesso(int tamProcesso) {
        this.tamProcesso = tamProcesso;
    }

    public ArrayList<Integer> getPaginas() {
        return paginas;
    }

    public void setPaginas(ArrayList<Integer> paginas)  {
        this.paginas = paginas;
    }
    
    public void jogarMemoriaFisica(){
        
    }
    
    
}