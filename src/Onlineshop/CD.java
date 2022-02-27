package Onlineshop;

/**
 * @author Tomek
 *
 */

public class CD extends Artikel{

    private final String Interpret;
    private final int anzahlTracks;


    /**
     *
     * @param Titel Title
     * @param Interpret Interpretation
     * @param anzahlTracks die Anzahl der Titel auf der Disc
     * @param nettoPreis Preis ohne mehrwertsteuer.
     //* @param Mehrwertsteuersatz Dieser Parameter zeigt die Hoehe der faelligen Steuer an.
     */
    public CD(String Titel, String Interpret, int anzahlTracks, double nettoPreis, Mehrwertsteuersatz satz) {

        super(Titel, nettoPreis, satz);
        this.Interpret = Interpret;
        this.anzahlTracks = anzahlTracks;
    }


    /**
     * Gibt den Interpret zurück
     * @return Interpret
     */
    public String getInterpret() {

        return Interpret;
    }


    /**
     * Gibt die Anzahl der Titel auf der Disc zurück
     * @return anzahlTracks
     */
    public int getAnzahlTracks() {

        return anzahlTracks;
    }
}

