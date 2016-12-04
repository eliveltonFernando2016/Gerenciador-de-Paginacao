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
import java.util.List;

/**
 *
 * @author elivelton
 */
public class LeituraEntrada {
    public int numeroFrames = 0;
    private List<Entrada> listaEntrada = new ArrayList();

    public List<Entrada> LeituraEntrada() {
        try {
            System.out.println("Informe o número de frames:");
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            String x;
            numeroFrames = Integer.parseInt(input.readLine());

            System.out.println("Agora informe os valores de entrada:");
            while (!"".equals(x = input.readLine())) {
                listaEntrada.add(new Entrada(Integer.parseInt(x)));
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return listaEntrada;
    }
    
}
