package ch.css.produkt.kata.bankocr;

import java.util.Arrays;
import java.util.List;

import static ch.css.produkt.kata.bankocr.ZahlenParser.*;

public class ZeilenParser {
    public List<NummerZeichen> splitZeilenIntoNummern(List<String> input) {
        return Arrays.asList(NUMBER_ONE, NUMBER_TWO,NUMBER_THREE, NUMBER_FOUR, NUMBER_FIFE, NUMBER_SIX, NUMBER_SEVEN, NUMBER_EIGHT, NUMBER_NINE);
    }
}
