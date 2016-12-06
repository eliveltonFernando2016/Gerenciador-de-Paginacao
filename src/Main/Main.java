/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import GUI.Principal;
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
        
//        MemoriaFisica memoriaFisica = new MemoriaFisica(tamanhoMemoria/tamanhoPagina);
//        GerenciadorDePagina gerenciadorDePagina = new GerenciadorDePagina(tamanhoMemoria/tamanhoPagina);
//        
//        //gerenciadorDePagina.mapearPagina(endereco que estiver no arquivo / tamanhoPagina, memoriaFisica);
        
        Principal principal = new Principal();
        
        //manipular.getListaEnderecos();
        
    }
            

}
