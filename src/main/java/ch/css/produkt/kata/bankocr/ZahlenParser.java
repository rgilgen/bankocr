package ch.css.produkt.kata.bankocr;

import java.util.Map;

public class ZahlenParser {
    public static final char BLANK = ' ';
    public static final char UNDERLINE = '_';
    public static final char PIPE = '|';

    public static final NummerZeichen NUMBER_ONE = new NummerZeichen(
            new char[]{BLANK, BLANK, BLANK},
            new char[]{BLANK, BLANK, PIPE},
            new char[]{BLANK, BLANK, PIPE});
    public static final NummerZeichen NUMBER_TWO = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{BLANK, UNDERLINE, PIPE},
            new char[]{PIPE, UNDERLINE, BLANK});
    public static final NummerZeichen NUMBER_THREE = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{BLANK, UNDERLINE, PIPE},
            new char[]{BLANK, UNDERLINE, PIPE});
    public static final NummerZeichen NUMBER_FOUR = new NummerZeichen(
            new char[]{BLANK, BLANK, BLANK},
            new char[]{PIPE, UNDERLINE, PIPE},
            new char[]{BLANK, BLANK, PIPE});
    public static final NummerZeichen NUMBER_FIFE = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{PIPE, UNDERLINE, BLANK},
            new char[]{BLANK, UNDERLINE, PIPE});
    public static final NummerZeichen NUMBER_SIX = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{PIPE, UNDERLINE, BLANK},
            new char[]{PIPE, UNDERLINE, PIPE});
    public static final NummerZeichen NUMBER_SEVEN = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{BLANK, BLANK, PIPE},
            new char[]{BLANK, BLANK, PIPE});
    public static final NummerZeichen NUMBER_EIGHT = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{PIPE, UNDERLINE, PIPE},
            new char[]{PIPE, UNDERLINE, PIPE});
    public static final NummerZeichen NUMBER_NINE = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{PIPE, UNDERLINE, PIPE},
            new char[]{BLANK, UNDERLINE, PIPE});
    public static final NummerZeichen NUMBER_ZERO = new NummerZeichen(
            new char[]{BLANK, UNDERLINE, BLANK},
            new char[]{PIPE, BLANK, PIPE},
            new char[]{PIPE, UNDERLINE, PIPE});

    Map<NummerZeichen, Integer> zeichenMap = Map.of(
            NUMBER_ONE, 1,
            NUMBER_TWO, 2,
            NUMBER_THREE, 3,
            NUMBER_FOUR, 4,
            NUMBER_FIFE, 5,
            NUMBER_SIX, 6,
            NUMBER_SEVEN, 7,
            NUMBER_EIGHT, 8,
            NUMBER_NINE, 9,
            NUMBER_ZERO, 0
    );

    public int parseZeichen(NummerZeichen input) {
        return zeichenMap.get(input).intValue();

    }
}
