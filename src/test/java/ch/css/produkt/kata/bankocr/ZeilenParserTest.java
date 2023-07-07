package ch.css.produkt.kata.bankocr;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static ch.css.produkt.kata.bankocr.ZahlenParser.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZeilenParserTest {
    private ZeilenParser testee;

    @Test
    void parseEineZeile123456789() {
        List<NummerZeichen> expectedOut = Arrays.asList(NUMBER_ONE, NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIFE, NUMBER_SIX, NUMBER_SEVEN, NUMBER_EIGHT, NUMBER_NINE);
        testee = new ZeilenParser();
        List<String> input = Arrays.asList(
                "    _  _     _  _  _  _  _ ",
                "  | _| _||_||_ |_   ||_||_|",
                "  ||_  _|  | _||_|  ||_| _|",
                "                           ");

        List<NummerZeichen> actualOut = testee.splitZeilenIntoNummern(input);

        assertEquals(expectedOut, actualOut);
    }

    @Test
    void parseEineZeile902345671() {
        List<NummerZeichen> expectedOut = Arrays.asList(NUMBER_NINE, NUMBER_ZERO,NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIFE, NUMBER_SIX, NUMBER_SEVEN, NUMBER_ONE);
        testee = new ZeilenParser();
        List<String> input = Arrays.asList(
                " _  _  _  _     _  _  _    ",
                "|_|| | _| _||_||_ |_   |  |",
                " _||_||_  _|  | _||_|  |  |",
                "                           ");

        List<NummerZeichen> actualOut = testee.splitZeilenIntoNummern(input);

        assertEquals(expectedOut, actualOut);
    }

    @Test
    void parseZweiZeilen() {
        List<NummerZeichen> expectedOut = Arrays.asList(
                NUMBER_ONE, NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIFE, NUMBER_SIX, NUMBER_SEVEN, NUMBER_EIGHT, NUMBER_NINE,
                NUMBER_NINE, NUMBER_ZERO,NUMBER_TWO, NUMBER_THREE, NUMBER_FOUR, NUMBER_FIFE, NUMBER_SIX, NUMBER_SEVEN, NUMBER_ONE);
        testee = new ZeilenParser();
        List<String> input = Arrays.asList(
                "    _  _     _  _  _  _  _ ",
                "  | _| _||_||_ |_   ||_||_|",
                "  ||_  _|  | _||_|  ||_| _|",
                "                           ",
                " _  _  _  _     _  _  _    ",
                "|_|| | _| _||_||_ |_   |  |",
                " _||_||_  _|  | _||_|  |  |",
                "                           ");

        List<NummerZeichen> actualOut = testee.splitZeilenIntoNummern(input);

        assertEquals(expectedOut, actualOut);
    }


}
