package Onlineshop;

/**
 * Super class for DVD, CD, Buecher
 * @author Tomek
 *
 */

abstract public class Artikel {

    private final String Titel;
    private double nettoPreis;
    private Mehrwertsteuersatz satz;
    private double steuerWert;


    /**
     *
     * @param Titel Title
     * @param nettoPreis Preis ohne mehrwertsteuer.
     //* @param Mehrwertsteuersatz Dieser Parameter zeigt die Hoehe der faelligen Steuer an.
     */
    public Artikel (String Titel, double nettoPreis, Mehrwertsteuersatz satz) {

        this.Titel = Titel;
        this.nettoPreis = nettoPreis;
        this.satz = satz;
    }


    /**
     * Gibt den Titel des Artikels zurück
     * @return Titel
     */
    public String getTitel() {

        return Titel;
    }


    /**
     * Gibt den Preis dieses Artikels zurück
     * @return nettoPreis
     */
    public double getNettoPreis() {

        return nettoPreis;
    }


    /**
     * Gibt den Steuerwert dieses Artikels zurück
     * @return Mehrwertsteuersatz
     */
    public Mehrwertsteuersatz getSatz() {
        return satz;
    }


    /**
     * Gibt den Steuerwert dieses Artikels zurück
     * @return Mehrwertsteuer
     */
    public double Mehrwertsteuer() {

        if (satz == Mehrwertsteuersatz.Reduzierten)
            steuerWert = nettoPreis * 0.07;
        else if (satz == Mehrwertsteuersatz.Normal)
            steuerWert = nettoPreis * 0.19;

        return steuerWert;
    }
}