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
    private int idPagina;

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
}
