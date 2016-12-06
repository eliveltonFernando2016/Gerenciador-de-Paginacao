/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GerenciarArquivo.Manipular;


/**
 *
 * @author vitor
 */
public class Main {

    int tamanhoMemoria;
    int tamanhoPagina;

    public void main(){
    
        Manipular manipular = new Manipular();
        manipular.lerArquivo("teste.txt");
        
        MemoriaFisica memoriaFisica = new MemoriaFisica(tamanhoMemoria/tamanhoPagina);
        GerenciadorDePagina gerenciadorDePagina = new GerenciadorDePagina(tamanhoMemoria/tamanhoPagina);
        
        gerenciadorDePagina.mapearPagina(endereco que estiver no arquivo / tamanhoPagina, memoriaFisica);
        
        
        
        manipular.getListaEnderecos();
        
    }
            

}
