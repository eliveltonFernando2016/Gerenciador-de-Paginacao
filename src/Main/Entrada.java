/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author elivelton
 */
public class Entrada {
    private int value;
    private ArrayList<Integer> nextUse;

    public Entrada(int value) {
        this.value = value;
        this.nextUse = new ArrayList();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ArrayList<Integer> getNextUse() {
        return nextUse;
    }

    public void setNextUse(ArrayList<Integer> nextUse) {
        this.nextUse = nextUse;
    }
    
    
}
