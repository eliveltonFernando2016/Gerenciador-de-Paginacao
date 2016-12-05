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
public class GerenciadorDePaginação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manipular arquivoProcesso = new Manipular();
        
        ArrayList<Processo> processos = arquivoProcesso.lerArquivo("processo.txt");
        MemoriaFisica memoriaFisica = new MemoriaFisica();
        MemoriaVirtual memoriaVirtual = new MemoriaVirtual();
        
        memoriaVirtual.inicializar(4,24);   // tamanho do bloco
        memoriaFisica.inicializar(4,24);   // tamanho do bloco
        
    }
    
}
