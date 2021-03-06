/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author vitor
 */
public class MemoriaFisica {

    ArrayList<Boolean> frames;
    
    public MemoriaFisica(int tamanho){
        frames = new ArrayList<>(tamanho);
        for (int i = 0; i < tamanho; i++) {
            frames.add(false);
        }
    }

    public boolean isLoad(int index){
        return frames.get(index);
    }
    
    public void load(int index){
        frames.set(index, true);
    }
    
    public void unload(int index){
        frames.set(index, false);
    }
    
    public int getFrameLivre(){
        for (int i = 0; i < frames.size(); i++) {
            if (!isLoad(i)) {
                load(i);
                return i;
            }
        }
        return -1;
    }
}
