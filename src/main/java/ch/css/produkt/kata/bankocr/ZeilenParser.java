package ch.css.produkt.kata.bankocr;

import java.util.ArrayList;
import java.util.List;

public class ZeilenParser {
    public List<NummerZeichen> splitZeilenIntoNummern(List<String> input) {
        List<NummerZeichen> list = new ArrayList<>();
        int anzahlZahlenProZeile = 9;

        for (int zeilenIndex = 0; zeilenIndex < input.size(); zeilenIndex = zeilenIndex+4) {
            for (int zahlenIndex = 0; zahlenIndex < anzahlZahlenProZeile; zahlenIndex++) {
                list.add(ermittleZahlenFelder(zahlenIndex, input.subList(zeilenIndex, zeilenIndex+4)));
            }
        }

        return list;
    }

    private NummerZeichen ermittleZahlenFelder(int index, List<String> input) {
        int zeichenBreite = 3;
        int zeichenStart = index*zeichenBreite;
        int zeichenEnde = zeichenStart+zeichenBreite;
        return new NummerZeichen(
                input.get(0).substring(zeichenStart, zeichenEnde).toCharArray(),
                input.get(1).substring(zeichenStart, zeichenEnde).toCharArray(),
                input.get(2).substring(zeichenStart, zeichenEnde).toCharArray());
    }
}
