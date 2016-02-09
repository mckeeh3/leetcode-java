package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution299.
 */
public class Solution299Test {
    @Test
    public void getHintWorks() {
        Solution299 solution299 = new Solution299();

        assertNotNull(solution299.getHint("1807", "7810"));
        assertTrue("1A3B".equals(solution299.getHint("1807", "7810")));
        assertTrue("1A1B".equals(solution299.getHint("1123", "0111")));
    }
}
