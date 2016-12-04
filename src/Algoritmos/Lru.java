package Algoritmos;

import Main.Entrada;
import java.util.ArrayList;
import java.util.List;

public class Lru {
    private int numeroFaltaPagina;

    public Lru() {
        this.numeroFaltaPagina = 0;
    }

    public int getNumberOfPageErrors() {
        return numeroFaltaPagina;
    }

    public void setNumberOfPageErrors(int numberOfPageErrors) {
        this.numeroFaltaPagina = numberOfPageErrors;
    }

    public void Simular(List<Entrada> list, int numeroFrames) {
        boolean found = false;

        ArrayList<Entrada> stack = new ArrayList<>(numeroFrames);
        final int BASE = numeroFrames - 1;
        final int TOPO = 0;

        for (Entrada entry : list) {
            found = false;

            for (Entrada frame : stack) {
                //IF FOUND
                if (frame.getValue() == entry.getValue()) {
                    stack.remove(frame);
                    stack.add(TOPO, entry);
                    found = true;
                    break;
                }
            }

            //IF NOT FOUND
            if (!found) {
                if (stack.size() != numeroFrames) {
                    numeroFaltaPagina++;
                    stack.add(TOPO, entry);
                } else {
                    numeroFaltaPagina++;
                    stack.remove(BASE);
                    stack.add(TOPO, entry);
                }
            }
        }

        System.out.println("Quantidade de Falta de páginas:");
        System.out.println("LRU " + numeroFaltaPagina);
    }

}
