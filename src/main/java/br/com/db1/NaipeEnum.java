package br.com.db1;

import java.util.IllegalFormatCodePointException;

/**
 * Created by Edlaine on 15/12/16.
 */
public enum NaipeEnum {

    COPAS('H'), OURO('D'), PAUS('C'), ESPADA('S');

    private final char sigla;

    NaipeEnum(char sigla) {
        this.sigla = sigla;
    }

    public static NaipeEnum getNaipeFrom(char sigla) {
        for (NaipeEnum naipe : NaipeEnum.values()) {
            if (naipe.sigla == sigla) {
                return naipe;
            }
        }
        throw new IllegalArgumentException("Naipe invalido....");
    }
}
