/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author vitor
 */
public class GerenciadorDePagina {

    ArrayList<Integer> tabelaPagina = null;

    public GerenciadorDePagina(int tamanho) {
        tabelaPagina = new ArrayList<Integer>(tamanho);
        for (int i = 0; i < tamanho; i++) {
            tabelaPagina.add(null);
        }
    }

    public LinkedList<String> mapearPagina(int numeroDaPagina, MemoriaFisica memoriaFisica) {

        LinkedList<String> listaDados = new LinkedList<String>();
        int x=0;
        if (tabelaPagina.get(numeroDaPagina) == null) {

            listaDados.add("Page Fault");

            x = memoriaFisica.getFrameLivre();
            tabelaPagina.set(numeroDaPagina, x);

            listaDados.add("Página " + numeroDaPagina + " carregada na Memória Física na posição " + x);
            
        } else {
            
            listaDados.add("Página " + numeroDaPagina + " já está carregada na memória");
        
        }
        String string = (x+"");
        listaDados.add(string);
        
        return listaDados;

    }

    public String mandaString(String texto) {
        return texto;
    }

}
