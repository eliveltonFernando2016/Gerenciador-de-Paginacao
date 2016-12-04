package Algoritmos;

import Main.Entrada;
import java.util.ArrayList;
import java.util.List;

public class Otimo {
    private int numberOfPageErrors;

    public Otimo() {
        this.numberOfPageErrors = 0;
    }

    public int getNumberOfPageErrors() {
        return numberOfPageErrors;
    }

    public void setNumberOfPageErrors(int numberOfPageErrors) {
        this.numberOfPageErrors = numberOfPageErrors;
    }

    public void Simular(List<Entrada> list, int qtdFaltaPagina) {
        boolean found = false;

        ArrayList<Entrada> frames = new ArrayList<>(qtdFaltaPagina);

        for (Entrada entry : list) {
            found = false;

            for (int i = 0; i < frames.size(); i++) {
                //IF FOUND
                if (frames.get(i).getValue() == entry.getValue()) {
                    frames.remove(i);
                    frames.add(i, entry);
                    found = true;
                    break;
                }
            }

            //IF NOT FOUND
            if (!found) {
                //HAS SPACE
                if (frames.size() != qtdFaltaPagina) {
                    numberOfPageErrors++;
                    frames.add(entry);
                } else {
                    //DOES NOT HAVE SPACE
                    numberOfPageErrors++;
                    Entrada aux = frames.get(0);

                    if (!aux.getNextUse().isEmpty()) {
                        //Iterate over frames
                        int maxIndex = 0;
                        for (int i = 1; i < frames.size(); i++) {
                            if (!frames.get(i).getNextUse().isEmpty()) {
                                if (frames.get(i).getNextUse().get(0) > aux.getNextUse().get(0)) {
                                    aux = frames.get(i);
                                    maxIndex = i;
                                }
                            } else {
                                aux = frames.get(i);
                                maxIndex = i;
                                break;
                            }
                        }

                        frames.remove(maxIndex);
                        frames.add(maxIndex, entry);
                    } else {
                        frames.remove(0);
                        frames.add(0, entry);
                    }
                }
            }
        }

        System.out.println("Quantidade de Falta de páginas:");
        System.out.println("OTM " + numberOfPageErrors);
    }
}
