package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution213.
 */
public class Solution213Test {
    @Test
    public void homesToRob0is0() {
        int[] homes = {};
        Solution213 solution213 = new Solution213();
        assertEquals(0, solution213.rob(homes));
    }

    @Test
    public void homesToRob1is1() {
        int[] homes = {1};
        Solution213 solution213 = new Solution213();
        assertEquals(1, solution213.rob(homes));
    }

    @Test
    public void homesToRob3is1() {
        int[] homes = {1, 1, 1};
        Solution213 solution213 = new Solution213();
        assertEquals(1, solution213.rob(homes));
    }

    @Test
    public void homesToRob4is3() {
        int[] homes = {1, 1, 2, 1};
        Solution213 solution213 = new Solution213();
        assertEquals(3, solution213.rob(homes));
    }
}
