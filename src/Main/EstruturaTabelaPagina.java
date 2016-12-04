/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author elivelton
 */
public class EstruturaTabelaPagina {
    private int endBase;
    private int endLimite;
    private boolean loadFlag = false;

    public int getEndBase() {
        return endBase;
    }

    public void setEndBase(int endBase) {
        this.endBase = endBase;
    }

    public int getEndLimite() {
        return endLimite;
    }

    public void setEndLimite(int endLimite) {
        this.endLimite = endLimite;
    }

    public boolean isLoadFlag() {
        return loadFlag;
    }

    public void setLoadFlag(boolean loadFlag) {
        this.loadFlag = loadFlag;
    }
    
    
}
