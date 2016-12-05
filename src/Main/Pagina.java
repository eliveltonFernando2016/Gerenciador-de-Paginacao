/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author vitor
 */
public class Pagina {
    Random random = new Random();
    private ArrayList<Endereco> Paginas;
    private int tamanho;
    private int id = random.nextInt(200);
    private boolean load;

    
    public Pagina(int tamanho) {
        this.tamanho = tamanho;
        Paginas = new ArrayList<Endereco>(tamanho);
    }

    public ArrayList<Endereco> getPaginas() {
        return Paginas;
    }

    public void setPaginas(ArrayList<Endereco> Paginas) {
        this.Paginas = Paginas;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isLoad() {
        return load;
    }

    public void setLoad(boolean load) {
        this.load = load;
    }
    
}
