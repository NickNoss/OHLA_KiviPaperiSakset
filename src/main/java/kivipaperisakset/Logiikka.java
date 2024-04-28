package kivipaperisakset;

/**
 * @author Nikita Nossenko
 * Luokka tarjoaa toiminnallisuuden kivi-paperi-sakset -pelin logiikalle.
 */
public class Logiikka {

    /**
     * Metodi arpoo satunnaisen valinnan kivi-paperi-sakset -peliin.
     *
     * @return Satunnainen valinta merkkijonona ("Kivi", "Sakset" tai "Paperi").
     */
    public static String arvoValinta() {
        String[] valinnat = {"Kivi", "Sakset", "Paperi"};
        int valinta = (int) (Math.random() * valinnat.length);
        return valinnat[valinta];
    }

    /**
     * Metodi tarkistaa kahden pelaajan valinnat ja määrittää voittajan.
     *
     * @param valinta1 Pelaajan 1 valinta merkkijonona ("Kivi", "Sakset" tai "Paperi").
     * @param valinta2 Pelaajan 2 valinta merkkijonona ("Kivi", "Sakset" tai "Paperi").
     * @return Voittajan indeksi: 0 tasapeli, 1 pelaaja 1 voittaa, -1 pelaaja 2 voittaa.
     */
    public static int tarkistaVoittaja(String valinta1, String valinta2) {
        if (valinta1 == null || valinta1.trim().isEmpty() || valinta2 == null || valinta2.trim().isEmpty()) {
            throw new IllegalArgumentException("Pelaajan valinta ei voi olla tyhjä");
        }
        if (valinta1.equals(valinta2)) {
            return 0;
        } else if ((valinta1.equals("Kivi") && valinta2.equals("Sakset")) ||
                (valinta1.equals("Sakset") && valinta2.equals("Paperi")) ||
                (valinta1.equals("Paperi") && valinta2.equals("Kivi"))) {
            return 1;
        } else
            return -1;
    }
}
