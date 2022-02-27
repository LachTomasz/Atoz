package Onlineshop;

/**
 * @author Tomek
 *
 */

public class Buch extends Artikel {

    private final String Autor;
    private int Seiten;


    /**
     *
     * @param Titel Title
     * @param Autor Author
     * @param Seiten die Anzahl der Seiten in der Buch
     * @param nettoPreis Preis ohne mehrwertsteuer.
     //* @param Mehrwertsteuersatz Dieser Parameter zeigt die Hoehe der faelligen Steuer an.
     */

    public Buch(String Titel, String Autor, int Seiten, double nettoPreis, Mehrwertsteuersatz satz) {

        super(Titel, nettoPreis, satz);
        this.Autor = Autor;
        this.Seiten = Seiten;
    }


    /**
     * Gibt den Autor zurück
     * @return Autor
     */
    public String getAutor() {

        return Autor;
    }


    /**
     * Gibt die Anzahl der Seiten in der Buch zurück
     * @return Seiten
     */
    public int getSeiten() {

        return Seiten;
    }
}
