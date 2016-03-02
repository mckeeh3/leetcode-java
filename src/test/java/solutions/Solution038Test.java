package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution038.
 */
public class Solution038Test {
    @Test
    public void sayAndSaidSequence1is1() {
        Solution038 solution038 = new Solution038();
        assertEquals("1", solution038.countAndSay(1));
    }

    @Test
    public void sayAndSaidSequence2is11() {
        Solution038 solution038 = new Solution038();
        assertEquals("11", solution038.countAndSay(2));
    }

    @Test
    public void sayAndSaidSequence3is21() {
        Solution038 solution038 = new Solution038();
        assertEquals("21", solution038.countAndSay(3));
    }

    @Test
    public void sayAndSaidSequence4is1211() {
        Solution038 solution038 = new Solution038();
        assertEquals("1211", solution038.countAndSay(4));
    }

    @Test
    public void sayAndSaidSequence5is111221() {
        Solution038 solution038 = new Solution038();
        assertEquals("111221", solution038.countAndSay(5));
    }
}
