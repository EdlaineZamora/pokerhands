package br.com.db1;

/**
 * Created by Edlaine on 15/12/16.
 */
public class Carta implements Comparable<Carta> {

    private NaipeEnum naipe;

    private int numero;

    public Carta(int numero, NaipeEnum naipe) {
        this.naipe = naipe;
        this.numero = numero;
    }

    public NaipeEnum getNaipe() {
        return naipe;
    }

    public int getNumero() {
        return numero;

    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int compareTo(Carta o) {
        return this.numero - o.getNumero();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Carta carta = (Carta) o;

        if (numero != carta.numero) return false;
        return naipe == carta.naipe;

    }

    @Override
    public int hashCode() {
        int result = naipe != null ? naipe.hashCode() : 0;
        result = 31 * result + numero;
        return result;
    }
}
