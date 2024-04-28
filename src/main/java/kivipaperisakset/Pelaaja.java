package kivipaperisakset;

/**
 * @author Nikita Nossenko
 * Pelaaja-olio luokka, joka edustaa yksittäistä pelaajaa.
 * Sisältää tiedot pelaajan nimestä, pelatuista peleistä ja voitoista.
 */
public class Pelaaja {
    private String nimi;
    private int pelit;
    private int voitot;

    /**
     * Pelaajan konstruktori, luo pelaajan annetulla nimellä
     * Pelaajan pelit ja voitot alustetaan nollaan.
     *
     * @param nimi Pelaajan nimi
     */
    public Pelaaja(String nimi) {
        this.nimi = nimi;
        this.pelit = 0;
        this.voitot = 0;
    }

    /**
     * Metodi kononaispelien määrän kasvattamiseen yhdellä.
     */
    public void lisaaPelattuPeli() {
        pelit++;
    }

    /**
     * Metodi voittojen määrän kasvattamiseen yhdellä.
     */
    public void lisaaVoitto() {
        voitot++;
    }

    /**
     * Getteri-metodi voittojen määrän palauttamiseen.
     *
     * @return Pelaajan voittojen määrä.
     */
    public int getVoitot() {
        return voitot;
    }

    /**
     * Getteri-metodi kokonaispelien määrän palauttamiseen.
     *
     * @return Pelaajan kokonaispelien määrä.
     */
    public int getPelit() {
        return pelit;
    }

    /**
     * Getteri-metodi nimen palauttamiseen.
     *
     * @return Pelaajan nimi.
     */
    public String getNimi() {
        return nimi;
    }
}
