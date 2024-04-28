package test;

import kivipaperisakset.Logiikka;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nikita Nossenko
 * Testiluokka Logiikka-luokan toiminnallisuuden testaamiseen.
 */
public class LogiikkaTest {

    /**
     * Testi arvoValinta-metodille.
     * Tarkistaa, että arvoValinta-metodi palauttaa odotettujen valintojen joukosta.
     */
    @Test
    public void testArvoValinta() {
        String valinta = Logiikka.arvoValinta();
        assertNotNull(valinta);
        assertTrue(valinta.equals("Kivi") || valinta.equals("Sakset") || valinta.equals("Paperi"));
    }

    /**
     * Testi tarkistaVoittaja-metodille tasapelin tapauksessa.
     * Tarkistaa, että metodi palauttaa 0, kun valinta1 ja valinta2 ovat samat.
     */
    @Test
    public void testTarkistaVoittajaTasapeli() {
        assertEquals(0, Logiikka.tarkistaVoittaja("Kivi", "Kivi"));
        assertEquals(0, Logiikka.tarkistaVoittaja("Sakset", "Sakset"));
        assertEquals(0, Logiikka.tarkistaVoittaja("Paperi", "Paperi"));
    }

    /**
     * Testi tarkistaVoittaja-metodille tilanteissa, joissa pelaaja 1 voittaa.
     */
    @Test
    public void testTarkistaVoittajaPelaaja1Voittaa() {
        assertEquals(1, Logiikka.tarkistaVoittaja("Kivi", "Sakset"));
        assertEquals(1, Logiikka.tarkistaVoittaja("Sakset", "Paperi"));
        assertEquals(1, Logiikka.tarkistaVoittaja("Paperi", "Kivi"));
    }

    /**
     * Testi tarkistaVoittaja-metodille tilanteissa, joissa pelaaja 2 voittaa.
     */
    @Test
    public void testTarkistaVoittajaPelaaja2Voittaa() {
        assertEquals(-1, Logiikka.tarkistaVoittaja("Sakset", "Kivi"));
        assertEquals(-1, Logiikka.tarkistaVoittaja("Paperi", "Sakset"));
        assertEquals(-1, Logiikka.tarkistaVoittaja("Kivi", "Paperi"));
    }

    /**
     * Testi tarkistaVoittaja-metodille, kun pelaaja 1 antaa epäkelvon valinnan.
     * Tarkistaa, että epäkelpo valinta pelaajalta 1 aiheuttaa IllegalArgumentExceptionin.
     */
    @Test
    public void testTarkistaVoittajaEpakelpoValinta1() {
        assertThrows(IllegalArgumentException.class, () -> {
            Logiikka.tarkistaVoittaja("", "Sakset");
        });
    }

    /**
     * Testi tarkistaVoittaja-metodille, kun pelaaja 2 antaa epäkelvon valinnan.
     * Tarkistaa, että epäkelpo valinta pelaajalta 2 aiheuttaa IllegalArgumentExceptionin.
     */
    @Test
    public void testTarkistaVoittajaEpakelpoValinta2() {
        assertThrows(IllegalArgumentException.class, () -> {
            Logiikka.tarkistaVoittaja("Kivi", "");
        });
    }
}
