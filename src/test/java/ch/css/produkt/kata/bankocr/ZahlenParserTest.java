package ch.css.produkt.kata.bankocr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ZahlenParserTest{
    private ZahlenParser testee;

    @Test
    void parseNumberOne(){
        testee = new ZahlenParser();
        int expectedOut = 1;
        NummerZeichen input = new NummerZeichen(
                new char[]{' ',' ', ' '},
                new char[]{' ',' ', '|'},
                new char[]{' ',' ', '|'});

        int actualOut = testee.parseZeichen(input);

        assertEquals(expectedOut, actualOut);
    }
}