/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Algoritmos.Lru;
import Algoritmos.Otimo;
import java.util.List;

/**
 *
 * @author elivelton
 */
public class GerenciadorDePaginação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //LeituraEntrada entrada = new LeituraEntrada();
        List<Entrada> entrada = new LeituraEntrada().LeituraEntrada();

        Lru lruAlgo = new Lru();
        lruAlgo.Simular(entrada, entrada.get(0).getValue());

        Otimo otmAlgo = new Otimo();
        otmAlgo.Simular(entrada, entrada.get(0).getValue());
    }
    
}
