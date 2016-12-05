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
public class MemoriaVirtual {
    
    private HashMap<Integer, Pagina> memoriaVirtual;
    private int tamanho;
    private int endereco = 0;
    private int tamPagina;

    public MemoriaVirtual(int tamanho, int tamPagina){
        this.tamPagina = tamPagina;
        this.tamanho = tamanho;
        memoriaVirtual = new HashMap<Integer, Pagina>(this.tamanho);
    }
    
    public boolean alocarProcesso(Processo p) {

        if (memoriaVirtual.size() < this.tamanho + p.getTamProcesso()) {
            for (int i = 0; i < p.getTamProcesso(); i++) {
                
                Pagina pagina = new Pagina(tamPagina);

                for (int j = 0; j < this.tamPagina; j++) {
                    Endereco enderecoPagina = new Endereco(endereco,p.getIdProcesso());
                    endereco++;
                }

                memoriaVirtual.put(endereco, pagina);
                p.getPaginas().add(pagina.getId());
            }
            return true;
        } else {
            return false;
        }
    }

    public boolean removerProcesso(Processo p){
        return true;
    }
    
}
