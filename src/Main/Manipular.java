package Main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Manipular {

    LinkedList<Processo> listaProcessos = new LinkedList();

    public void lerArquivo(String caminho) {
        String linha;                                                           // Cria variável para armazenar a linha do arquivo a ser lido
        String id;
        String duracao;
        String prioridade;
        String tempo;

        try {
            FileReader reader = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(reader);
            StringTokenizer st = null;

            while ((linha = leitor.readLine()) != null) {
                st = new StringTokenizer(linha, " ");                           // Define token de separação.
                id = st.nextToken();                                            // Pega o ID e armazena na variável
                duracao = st.nextToken();                                       // Pega a duração e armazena na variável
                prioridade = st.nextToken();                                    // Pega a prioridade e armazena na variável
                tempo = st.nextToken();                                         // Pega o tempo de chegada e armazena na variável

                LinkedList<Integer> listaES = new LinkedList();        // Cria a lista de Entrada e Saída.

                while (st.hasMoreTokens()) {
                    listaES.add(Integer.parseInt(st.nextToken()));              // Caso exista, adiciona os elementos na lista de Entrada e Saída
                }

            }
            reader.close();
        } catch (IOException ex) {
            Logger.getLogger(Manipular.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
