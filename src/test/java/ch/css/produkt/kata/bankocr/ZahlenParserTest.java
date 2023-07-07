package ch.css.produkt.kata.bankocr;

import org.junit.jupiter.api.Test;

import static ch.css.produkt.kata.bankocr.ZahlenParser.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ZahlenParserTest{
    private ZahlenParser testee;

    @Test
    void parseNumberOne(){
        testee = new ZahlenParser();
        int expectedOut = 1;
        NummerZeichen input = new NummerZeichen(
                new char[]{BLANK,BLANK, BLANK},
                new char[]{BLANK,BLANK, PIPE},
                new char[]{BLANK,BLANK, PIPE});

        int actualOut = testee.parseZeichen(input);

        assertEquals(expectedOut, actualOut);
    }
    @Test
    void parseNumberTwo(){
        testee = new ZahlenParser();
        int expectedOut = 2;
        NummerZeichen input = new NummerZeichen(
                new char[]{BLANK,UNDERLINE, BLANK},
                new char[]{BLANK,UNDERLINE, PIPE},
                new char[]{PIPE,UNDERLINE, BLANK});

        int actualOut = testee.parseZeichen(input);

        assertEquals(expectedOut, actualOut);
    }
}