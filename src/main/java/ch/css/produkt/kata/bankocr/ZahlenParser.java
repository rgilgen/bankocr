package ch.css.produkt.kata.bankocr;

import java.util.Map;

public class ZahlenParser {
    public static final char BLANK = ' ';
    public static final char UNDERLINE = '_';
    public static final char PIPE = '|';

    private static final NummerZeichen NUMBER_ONE = new NummerZeichen(
            new char[]{BLANK, BLANK, BLANK},
            new char[]{BLANK, BLANK, PIPE},
            new char[]{BLANK, BLANK, PIPE});
    private static final NummerZeichen NUMBER_TWO = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{BLANK, UNDERLINE, PIPE},
            new char[]{PIPE, UNDERLINE, BLANK});
    private static final NummerZeichen NUMBER_THREE = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{BLANK, UNDERLINE, PIPE},
            new char[]{BLANK, UNDERLINE, PIPE});

    Map<NummerZeichen, Integer> zeichenMap = Map.of(
            NUMBER_ONE, 1,
            NUMBER_TWO, 2,
            NUMBER_THREE, 3);

    public int parseZeichen(NummerZeichen input) {
        return zeichenMap.get(input).intValue();

    }
}
