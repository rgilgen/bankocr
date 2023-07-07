package ch.css.produkt.kata.bankocr;

import java.io.*;
import java.nio.file.Files;
import java.util.List;

public class OcrReader {
    public List<List<Integer>> readZahlen(String inputFileName) throws IOException {
        File inputFile = new File(inputFileName);
        InputStream is = Files.newInputStream(inputFile.toPath());
        Reader reader = new InputStreamReader(is);
        BufferedReader bufferedReader = new BufferedReader(reader);

        List<String> lines = bufferedReader.lines().toList();
        ZeilenParser zeilenParser = new ZeilenParser();
        List<NummerZeichen> zahlenListe = zeilenParser.splitZeilenIntoNummern(lines);

        return null;
    }
}
