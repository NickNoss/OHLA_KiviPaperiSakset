package test;

import kivipaperisakset.KiviPaperiSakset;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KpsTest {

    @Test
    public void testAloitaPeli() {
        assertDoesNotThrow(() -> {
            KiviPaperiSakset peli = new KiviPaperiSakset();
            peli.aloitaPeli("Pelaaja1", "Pelaaja2", 10);
        });
    }

    @Test
    public void testAloitaPeliNegatiivisillaKierroksilla() {
        assertThrows(IllegalArgumentException.class, () -> {
            KiviPaperiSakset peli = new KiviPaperiSakset();
            peli.aloitaPeli("Pelaaja1", "Pelaaja2", -5);
        });
    }

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
