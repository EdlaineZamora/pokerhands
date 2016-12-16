package br.com.db1;

/**
 * Created by Edlaine on 15/12/16.
 */
public class CartaFactory {
    public Carta cria(String s) {

        char numero = s.charAt(0);
        char sigla = s.charAt(1);

        return new Carta(getNumero(numero), NaipeEnum.getNaipeFrom(sigla));
    }

    private int getNumero(char numero) {
        switch (numero) {
            case 'T': return 10;
            case 'J': return 11;
            case 'Q': return 12;
            case 'K': return 13;
            case 'A': return 14;

            default: return numero - 48;
        }
    }
}
