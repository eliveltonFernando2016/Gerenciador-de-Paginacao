/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GerenciarArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class Manipular {
    
    

    private LinkedList<Integer> listaEnderecos = new LinkedList<Integer>();

    public Manipular(){
    
    }
    
    public void lerArquivo(String caminho) {
        String endereco;
        int enderecoInt = 0;
        String linha;

        try {
            FileReader reader = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            while ((linha = leitor.readLine()) != null) {
                st = new StringTokenizer(linha, " ");
                endereco = st.nextToken();
                enderecoInt = Integer.parseInt(endereco);
                listaEnderecos.add(enderecoInt);
            }

            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Manipular.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public LinkedList<Integer> getListaEnderecos() {
        return listaEnderecos;
    }
    
}
