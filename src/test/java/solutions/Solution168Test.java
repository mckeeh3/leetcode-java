package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution168.
 */
public class Solution168Test {
    @Test
    public void excelSheetColumnTitleFor1IsA() {
        Solution168 solution168 = new Solution168();
        assertEquals("A", solution168.convertToTitle(1));
    }

    @Test
    public void excelSheetColumnTitleFor2IsB() {
        Solution168 solution168 = new Solution168();
        assertEquals("B", solution168.convertToTitle(2));
    }

    @Test
    public void excelSheetColumnTitleFor25IsY() {
        Solution168 solution168 = new Solution168();
        assertEquals("Y", solution168.convertToTitle(25));
    }

    @Test
    public void excelSheetColumnTitleFor26IsZ() {
        Solution168 solution168 = new Solution168();
        assertEquals("Z", solution168.convertToTitle(26));
    }

    @Test
    public void excelSheetColumnTitleFor27IsAA() {
        Solution168 solution168 = new Solution168();
        assertEquals("AA", solution168.convertToTitle(27));
    }

    @Test
    public void excelSheetColumnTitleFor52IsAZ() {
        Solution168 solution168 = new Solution168();
        assertEquals("AZ", solution168.convertToTitle(52));
    }

    @Test
    public void excelSheetColumnTitleFor53IsBA() {
        Solution168 solution168 = new Solution168();
        assertEquals("BA", solution168.convertToTitle(53));
    }

    @Test
    public void excelSheetColumnTitleFor79IsCA() {
        Solution168 solution168 = new Solution168();
        assertEquals("CA", solution168.convertToTitle(79));
    }

    @Test
    public void excelSheetColumnTitleFor676IsCA() {
        Solution168 solution168 = new Solution168();
        assertEquals("YZ", solution168.convertToTitle(676));
    }

    @Test
    public void excelSheetColumnTitleFor677IsCA() {
        Solution168 solution168 = new Solution168();
        assertEquals("ZA", solution168.convertToTitle(677));
    }
}
