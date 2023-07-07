package ch.css.produkt.kata.bankocr;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OcrReaderTest {
    private OcrReader testee;

    @Test
    void readZahlenFromFile() {
        String inputFileName = "src/main/resources/ocrFile.txt";
        List<List<Integer>> expectedResult = Arrays.asList(
                Arrays.asList(1,2,3,4,5,6,7,8,9),
                Arrays.asList(9,0,2,3,4,5,6,7,1)
        );

        List<List<Integer>> actualResult = testee.readZahlen(inputFileName);

        assertEquals(expectedResult, actualResult);
    }

}
