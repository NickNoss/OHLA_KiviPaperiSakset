package test;

import kivipaperisakset.Logiikka;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LogiikkaTest {

    @Test
    public void testArvoValinta() {
        // Tarkista, että arvoValinta-metodi palauttaa odotettujen valintojen joukosta
        String valinta = Logiikka.arvoValinta();
        assertNotNull(valinta);
        assertTrue(valinta.equals("Kivi") || valinta.equals("Sakset") || valinta.equals("Paperi"));
    }

    @Test
    public void testTarkistaVoittajaTasapeli() {
        // Tarkista, että tasapelin valinta1 ja valinta2 ovat samat
        assertEquals(0, Logiikka.tarkistaVoittaja("Kivi", "Kivi"));
        assertEquals(0, Logiikka.tarkistaVoittaja("Sakset", "Sakset"));
        assertEquals(0, Logiikka.tarkistaVoittaja("Paperi", "Paperi"));
    }

    @Test
    public void testTarkistaVoittajaPelaaja1Voittaa() {
        // Tarkista, että pelaaja 1 voittaa eri skenaarioissa
        assertEquals(1, Logiikka.tarkistaVoittaja("Kivi", "Sakset"));
        assertEquals(1, Logiikka.tarkistaVoittaja("Sakset", "Paperi"));
        assertEquals(1, Logiikka.tarkistaVoittaja("Paperi", "Kivi"));
    }

    @Test
    public void testTarkistaVoittajaPelaaja2Voittaa() {
        // Tarkista, että pelaaja 2 voittaa eri skenaarioissa
        assertEquals(-1, Logiikka.tarkistaVoittaja("Sakset", "Kivi"));
        assertEquals(-1, Logiikka.tarkistaVoittaja("Paperi", "Sakset"));
        assertEquals(-1, Logiikka.tarkistaVoittaja("Kivi", "Paperi"));
    }

    @Test
    public void testTarkistaVoittajaEpakelpoValinta1() {
        // Tarkista, että epäkelpo valinta pelaajalta 1 aiheuttaa IllegalArgumentExceptionin
        assertThrows(IllegalArgumentException.class, () -> {
            Logiikka.tarkistaVoittaja("", "Sakset");
        });
    }

    @Test
    public void testTarkistaVoittajaEpakelpoValinta2() {
        // Tarkista, että epäkelpo valinta pelaajalta 2 aiheuttaa IllegalArgumentExceptionin
        assertThrows(IllegalArgumentException.class, () -> {
            Logiikka.tarkistaVoittaja("Kivi", "");
        });
    }
}
