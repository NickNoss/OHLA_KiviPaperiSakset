package test;

import kivipaperisakset.Pelaaja;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nikita Nossenko
 * Testiluokka Pelaaja-luokan toiminnallisuuden testaamiseen.
 */
public class PelaajaTest {

    /**
     * Testi pelaajan luomiselle.
     * Tarkistaa, että pelaaja luodaan oikealla nimellä ja alkuarvoilla.
     */
    @Test
    public void testPelaajanLuominen() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");
        assertEquals("Testipelaaja", pelaaja.getNimi());
        assertEquals(0, pelaaja.getPelit());
        assertEquals(0, pelaaja.getVoitot());
    }

    /**
     * Testi pelattujen pelien lisäämiselle.
     * Tarkistaa, että pelaajan pelien määrä kasvaa yhdellä.
     */
    @Test
    public void testLisaaPelattuPeli() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");
        pelaaja.lisaaPelattuPeli();
        assertEquals(1, pelaaja.getPelit());
    }

    /**
     * Testi voittojen lisäämiselle.
     * Tarkistaa, että pelaajan voittojen määrä kasvaa yhdellä.
     */
    @Test
    public void testLisaaVoitto() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }

    /**
     * Testi pelaajan luomiselle tyhjällä nimellä.
     * Tarkistaa, että tyhjä nimi aiheuttaa IllegalArgumentExceptionin.
     */
    @Test
    public void testPelaajanLuominenTyhjallaNimella() {
        assertThrows(IllegalArgumentException.class, () -> {
            Pelaaja pelaaja = new Pelaaja("");
        });
    }
}
