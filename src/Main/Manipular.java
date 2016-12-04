package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manipular {

    public ArrayList<Processo> lerArquivo(String caminho) {
        ArrayList<Processo> listaProcessos = new ArrayList();
        int idProcesso;
        int tamProcesso;
        String linha;

        try {
            FileReader reader = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            while ((linha = leitor.readLine()) != null) {
                st = new StringTokenizer(linha, " ");

                while (st.hasMoreTokens()) {
                    idProcesso = Integer.parseInt(st.nextToken());
                    tamProcesso = Integer.parseInt(st.nextToken());
                    listaProcessos.add(new Processo(idProcesso, tamProcesso));
                }
            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Manipular.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listaProcessos;
    }
}