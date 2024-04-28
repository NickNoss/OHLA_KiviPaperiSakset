package test;

import kivipaperisakset.KiviPaperiSakset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Nikita Nossenko
 * Testiluokka KiviPaperiSakset-pelin toiminnallisuuden testaamiseen.
 */
public class KpsTest {

    /**
     * Testi aloitaPeli-metodille positiivisilla kierroksilla.
     */
    @Test
    public void testAloitaPeli() {
        assertDoesNotThrow(() -> {
            KiviPaperiSakset peli = new KiviPaperiSakset();
            peli.aloitaPeli("Pelaaja1", "Pelaaja2", 10);
        });
    }

    /**
     * Testi aloitaPeli-metodille negatiivisilla kierroksilla.
     */
    @Test
    public void testAloitaPeliNegatiivisillaKierroksilla() {
        assertThrows(IllegalArgumentException.class, () -> {
            KiviPaperiSakset peli = new KiviPaperiSakset();
            peli.aloitaPeli("Pelaaja1", "Pelaaja2", -5);
        });
    }

    /**
     * Testi aloitaPeli-metodille tyhjällä nimellä.
     */
    @Test
    public void testAloitaPeliTyhjallaNimella() {
        assertThrows(IllegalArgumentException.class, () -> {
            KiviPaperiSakset peli = new KiviPaperiSakset();
            peli.aloitaPeli("", "Pelaaja2", 10);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            KiviPaperiSakset peli = new KiviPaperiSakset();
            peli.aloitaPeli("Pelaaja1", "", 10);
        });
    }
}
