import br.com.db1.*;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Edlaine on 15/12/16.
 */
public class MainTest {

    private Main main;

    @Before
    public void init() {

    }

    @Test
    public void processa_carta_test() {
        Carta carta = new CartaFactory().cria("5H");

        assertEquals(NaipeEnum.COPAS, carta.getNaipe());
        assertEquals(5, carta.getNumero());
    }

    @Test
    public void processa_carta_10_test() {
        Carta carta = new CartaFactory().cria("TH");

        assertEquals(NaipeEnum.COPAS, carta.getNaipe());
        assertEquals(10, carta.getNumero());
    }


    @Test
    public void processa_carta_valete_test() {
        Carta carta = new CartaFactory().cria("JS");

        assertEquals(NaipeEnum.ESPADA, carta.getNaipe());
        assertEquals(11, carta.getNumero());
    }

    @Test
    public void processa_carta_rainha_test() {
        Carta carta = new CartaFactory().cria("QC");

        assertEquals(NaipeEnum.PAUS, carta.getNaipe());
        assertEquals(12, carta.getNumero());
    }

    @Test
    public void processa_carta_rei_test() {
        Carta carta = new CartaFactory().cria("KC");

        assertEquals(NaipeEnum.PAUS, carta.getNaipe());
        assertEquals(13, carta.getNumero());
    }

    @Test
    public void processa_carta_as_test() {
        Carta carta = new CartaFactory().cria("AD");

        assertEquals(NaipeEnum.OURO, carta.getNaipe());
        assertEquals(14, carta.getNumero());
    }

    @Test
    public void compara_maior_carta_test() {
        Carta carta1 = new CartaFactory().cria("2D");
        Carta carta2 = new CartaFactory().cria("3C");

        assertTrue(carta1.compareTo(carta2) < 0);
    }

    @Test
    public void cria_mao_test() {
        String cartas = "8C TS KC 9H 4S";
        Mao mao = new MaoFactory().cria(cartas);
        assertEquals(5, mao.getCartas().size());
        assertEquals(new HashSet<Carta>(Arrays.asList(
                new Carta(8, NaipeEnum.PAUS),
                new Carta(10, NaipeEnum.ESPADA),
                new Carta(13, NaipeEnum.PAUS),
                new Carta(9, NaipeEnum.COPAS),
                new Carta(4, NaipeEnum.ESPADA))), mao.getCartas());
    }

    @Test
    public void cria_duas_maos_test() {
        String cartas = "8C TS KC 9H 4S 7D 2S 5D 3S AC";

        Mao mao1 = new MaoFactory().cria(cartas.substring(0, 14));
        Mao mao2 = new MaoFactory().cria(cartas.substring(15));

        assertEquals(new HashSet<Carta>(Arrays.asList(
                new Carta(8, NaipeEnum.PAUS),
                new Carta(10, NaipeEnum.ESPADA),
                new Carta(13, NaipeEnum.PAUS),
                new Carta(9, NaipeEnum.COPAS),
                new Carta(4, NaipeEnum.ESPADA))), mao1.getCartas());

        assertEquals(new HashSet<Carta>(Arrays.asList(
                new Carta(7, NaipeEnum.OURO),
                new Carta(2, NaipeEnum.ESPADA),
                new Carta(5, NaipeEnum.OURO),
                new Carta(3, NaipeEnum.ESPADA),
                new Carta(14, NaipeEnum.PAUS))), mao2.getCartas());
    }


    @Test
    public void compara_duas_maos_maior_carta_test(){
        String cartas = "8C TS KC 9H 4S 7D 2S 5D 3S AC";
        Mao mao1 = new MaoFactory().cria(cartas.substring(0, 14));
        Mao mao2 = new MaoFactory().cria(cartas.substring(15));
        assertTrue(mao1.compareTo(mao2) < 0);
    }



}