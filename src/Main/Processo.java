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

    public Processo(int idProcesso, int tamProcesso) {
        this.idProcesso = idProcesso;
        this.tamProcesso = tamProcesso;
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
}