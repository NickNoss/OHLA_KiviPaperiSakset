package kivipaperisakset;

/**
 * @author Nikita Nossenko
 * Luokka tarjoaa toiminnallisuuden peliä varten.
 * Pelaaminen tapahtuu annettuakierrosmäärää noudattaen kunnes toinen saa enemmistön voittoja.
 * Pelaajien nimet sekä pelattavien kierrosten määrä määritellään pelin alussa.
 */
public class KiviPaperiSakset {

    /**
     * Metodi aloittaa kivi-paperi-sakset -pelin pelaamisen annettujen pelaajien välillä.
     *
     * @param p1 Ensimmäinen pelaaja.
     * @param p2 Toinen pelaaja.
     * @param rounds Pelattavien kierrosten määrä.
     */
    private void pelaaPeli(Pelaaja p1, Pelaaja p2, int rounds) {
        if (rounds < 0) {
            throw new IllegalArgumentException("Kierrosten määrä ei voi olla negatiivinen");
        }
        boolean peliLoppu = false;
        int pelattu = 0;
        int tasapelienmaara = 0;
        int voittojaLoppuun = rounds / 2 + 1;

        while (!peliLoppu) {

            String valinta1 = Logiikka.arvoValinta();
            String valinta2 = Logiikka.arvoValinta();
            System.out.println("Erä nro: " + (pelattu + 1));
            System.out.println(p1.getNimi() + ": " + valinta1 + " (" + p1.getVoitot() + " voittoa)");
            System.out.println(p2.getNimi() + ": " + valinta2 + " (" + p2.getVoitot() + " voittoa)");

            int eraTulos = Logiikka.tarkistaVoittaja(valinta1, valinta2);

            if (eraTulos == 0) {
                tasapelienmaara++;
            } else if (eraTulos == 1) {
                p1.lisaaPelattuPeli();
                p1.lisaaVoitto();
                System.out.println("\n" + "Voittaja on: " + p1.getNimi() + "!");
            } else {
                p2.lisaaPelattuPeli();
                p2.lisaaVoitto();
                System.out.println("\n" + "Voittaja on: " + p2.getNimi() + "!");
            }
            pelattu++;
            System.out.println("Tasapeleja yhteensä: " + tasapelienmaara + "\n");

            if (p1.getVoitot() >= voittojaLoppuun || p2.getVoitot() >= voittojaLoppuun) {
                peliLoppu = true;
            }
        }
    }

    /**
     * Metodi aloittaa uuden kivi-paperi-sakset -pelin.
     *
     * @param n1 Ensimmäisen pelaajan nimi.
     * @param n2 Toisen pelaajan nimi.
     * @param rounds Pelattavien kierrosten määrä.
     */
    public void aloitaPeli(String n1, String n2, int rounds) {
        Pelaaja p1 = new Pelaaja(n1);
        Pelaaja p2 = new Pelaaja(n2);
        pelaaPeli(p1, p2, rounds);
    }
}
