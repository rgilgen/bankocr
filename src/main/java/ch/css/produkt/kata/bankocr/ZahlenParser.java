package ch.css.produkt.kata.bankocr;

public class ZahlenParser {
    public static final char BLANK = ' ';
    public static final char UNDERLINE = '_';
    public static final char PIPE = '|';

    private static final NummerZeichen NUMBER_ONE = new NummerZeichen(
            new char[]{BLANK, BLANK, BLANK},
            new char[]{BLANK, BLANK, PIPE},
            new char[]{BLANK, BLANK, PIPE});
    private static final NummerZeichen NUMBER_TWO = new NummerZeichen(
            new char[]{BLANK,UNDERLINE, BLANK},
            new char[]{BLANK,UNDERLINE, PIPE},
            new char[]{PIPE,UNDERLINE, BLANK});

    public int parseZeichen(NummerZeichen input) {
        if(input.equals(NUMBER_ONE)) {
            return 1;
        }
        return 2;
    }
}
