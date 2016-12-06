/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class GerenciadorDePagina {

    ArrayList<Integer> tabelaPagina;

    public GerenciadorDePagina(int tamanho) {
        tabelaPagina = new ArrayList<Integer>(tamanho);
    }

    GerenciadorDePagina() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void mapearPagina(int numeroDaPagina, MemoriaFisica memoriaFisica){
        if(tabelaPagina.get(numeroDaPagina) != null){
            System.out.println("PageFault");
        } 
        
        int x = memoriaFisica.getFrameLivre();
        
        tabelaPagina.set(numeroDaPagina,x);
    
    }
    
}
