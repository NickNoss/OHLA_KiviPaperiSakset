package test;

import kivipaperisakset.Pelaaja;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PelaajaTest {

    @Test
    public void testPelaajanLuominen() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");
        assertEquals("Testipelaaja", pelaaja.getNimi());
        assertEquals(0, pelaaja.getPelit());
        assertEquals(0, pelaaja.getVoitot());
    }

    @Test
    public void testLisaaPelattuPeli() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");
        pelaaja.lisaaPelattuPeli();
        assertEquals(1, pelaaja.getPelit());
    }

    @Test
    public void testLisaaVoitto() {
        Pelaaja pelaaja = new Pelaaja("Testipelaaja");
        pelaaja.lisaaVoitto();
        assertEquals(1, pelaaja.getVoitot());
    }

    @Test
    public void testPelaajanLuominenTyhjallaNimella() {
        assertThrows(IllegalArgumentException.class, () -> {
            Pelaaja pelaaja = new Pelaaja("");
        });
    }

}
