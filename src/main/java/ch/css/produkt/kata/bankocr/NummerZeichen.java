package ch.css.produkt.kata.bankocr;

import java.util.Arrays;

public class NummerZeichen {
    private char[] zeile1;
    private char[] zeile2;
    private char[] zeile3;

    public NummerZeichen(char[] zeile1, char[] zeile2, char[] zeile3) {
        this.zeile1 = zeile1;
        this.zeile2 = zeile2;
        this.zeile3 = zeile3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NummerZeichen that = (NummerZeichen) o;
        return Arrays.equals(zeile1, that.zeile1) && Arrays.equals(zeile2, that.zeile2) && Arrays.equals(zeile3, that.zeile3);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(zeile1);
        result = 31 * result + Arrays.hashCode(zeile2);
        result = 31 * result + Arrays.hashCode(zeile3);
        return result;
    }
}
