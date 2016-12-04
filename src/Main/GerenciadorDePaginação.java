/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        try {
            ArrayList<Processo> processos = new ArrayList();

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            String x;
            while (!"".equals(x = input.readLine())) {
                int idrocesso = 0;
                
            }
        } catch (IOException e) {
            e.getMessage();
        }

    }
    
}
