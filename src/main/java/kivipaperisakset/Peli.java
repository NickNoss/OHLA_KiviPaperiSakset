package kivipaperisakset;

import java.util.Scanner;

/**
 * @author Nikita Nossenko
 * Luokka käynnistää kivi-paperi-sakset -pelin.
 * Käyttäjältä pyydetään pelaajien nimet sekä pelattavien kierrosten määrä.
 */
public class Peli {
    /**
     * Metodi main käynnistää kivi-paperi-sakset -pelin.
     * Käyttäjältä pyydetään nimet sekä pelattavien kierrosten määrä.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Anna nimi pelaajalle yksi: ");
        String p1 = in.nextLine();
        System.out.println("Anna nimi pelaajalle kaksi: ");
        String p2 = in.nextLine();
        System.out.println("Anna pelattavien erien määrä: ");
        int rounds = in.nextInt();

        KiviPaperiSakset kps = new KiviPaperiSakset();
        kps.aloitaPeli(p1, p2, rounds);
    }
}
