package br.com.db1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Edlaine on 15/12/16.
 */
public class Mao implements Comparable<Mao> {

        Set<Carta> cartas = new HashSet<Carta>();

    public Mao(Set<Carta> cartas) {
        this.cartas = cartas;
    }

    public Set<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(Set<Carta> cartas) {
        this.cartas = cartas;
    }


    public int compareTo(Mao o) {
        return 0;
    }

    public Carta getMaiorCarta(){
        return cartas.stream()
                .max(Carta::compareTo)
                .orElseThrow(IllegalStateException::new);
    }
}
