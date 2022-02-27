package Onlineshop;

/**
 * @author Tomek
 *
 */

public class DVD extends Artikel{

    final int Laenge;


    /**
     *
     * @param Titel Title
     * @param nettoPreis Preis ohne mehrwertsteuer.
     * @param Laenge Videolänge in Minuten
     //* @param Mehrwertsteuersatz Dieser Parameter zeigt die Hoehe der faelligen Steuer an.
     */
    public DVD(String Titel, double nettoPreis, int Laenge, Mehrwertsteuersatz satz) {

        super(Titel, nettoPreis, satz);
        this.Laenge = Laenge;
    }


    /**
     * Gibt die Videolänge in Minuten auf der Disc zurück
     * @return anzahlTracks
     */
    public int getLaenge() {

        return Laenge;
    }

}
