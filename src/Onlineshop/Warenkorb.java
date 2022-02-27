package Onlineshop;

import java.util.*;

/**
 * @author Tomek
 *
 */
public class Warenkorb {

    public static void main(String[] args) {

        var Waren = new ArrayList <Artikel>();
        double GesamtNetto = 0;
        double MwSt_7 = 0;
        double MwSt_19 = 0;
        double MwSt = 0;

        Waren.add(new CD("dup", "set", 17, 100, Mehrwertsteuersatz.Normal));
        Waren.add(new CD("dup", "set", 17, 100, Mehrwertsteuersatz.Normal));
        Waren.add(new DVD("dsf", 200, 190, Mehrwertsteuersatz.Normal));
        Waren.add(new Buch("sdfg", "sfas", 234, 100, Mehrwertsteuersatz.Reduzierten));

        System.out.println("Ihre Einkaufen:");
        System.out.println();
        for (Artikel e : Waren)
            System.out.println("Titel = " + e.getTitel() + ", preis =" + e.getNettoPreis()
                    + ", MwSt =" + e.Mehrwertsteuer());

        for(Artikel e : Waren) {
            GesamtNetto += e.getNettoPreis();

            if(e.getSatz() == Mehrwertsteuersatz.Normal)

                MwSt_19 += e.Mehrwertsteuer();

            else if(e.getSatz() == Mehrwertsteuersatz.Reduzierten)

                MwSt_7 += e.Mehrwertsteuer();
        }


        System.out.println();
        System.out.println("Gesamt netto betrag: " + GesamtNetto);
        System.out.println("MehrwertSteuer 7%: " + MwSt_7);
        System.out.println("MehrwertSteuer 19%: " + MwSt_19);
        MwSt = MwSt_7 + MwSt_19;
        System.out.println("MehrwertSteuer insgesamt: " + MwSt);
        double GesamtBrutto = GesamtNetto + MwSt;
        System.out.println("Gesamt brutto betrag: " + GesamtBrutto);
    }

}
