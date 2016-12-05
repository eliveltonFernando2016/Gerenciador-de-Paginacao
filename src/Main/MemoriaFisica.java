/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.HashMap;

/**
 *
 * @author elivelton
 */
public class MemoriaFisica {

    private HashMap<Integer, Pagina> memoriaFisica;
    private int tamanho;
    private int endereco = 4000;
    private int tamPagina;

    public MemoriaFisica(int tamanho, int tamPagina) {
        this.tamanho = tamanho;
        this.tamPagina = tamPagina;
        memoriaFisica = new HashMap<Integer, Pagina>(this.tamanho);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public boolean alocarProcesso(Processo p) {

        if (memoriaFisica.size() < this.tamanho + p.getTamProcesso()) {
            for (int i = 0; i < p.getTamProcesso(); i++) {

                Pagina pagina = new Pagina(tamPagina);

                for (int j = 0; j < this.tamPagina; j++) {
                    Endereco enderecoPagina = new Endereco(endereco, p.getIdProcesso());
                    endereco++;
                }

                memoriaFisica.put(endereco, pagina);
                p.getPaginas().add(pagina.getId());
            }
            return true;
        } else {
            return false;
        }
    }
}
