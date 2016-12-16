package br.com.db1;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Edlaine on 15/12/16.
 */
public class MaoFactory {
    public Mao cria(String input) {

        String[] valores = input.split(" ");
        Set<Carta> cartas = new HashSet<Carta>();
        for (String valor : valores) {
            cartas.add(new CartaFactory().cria(valor));
        }
        return new Mao(cartas);
    }
}
