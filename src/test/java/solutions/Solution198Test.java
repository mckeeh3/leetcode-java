package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution198.
 */
public class Solution198Test {
    @Test
    public void homesToRob0is0() {
        int[] homes = {};
        Solution198 solution198 = new Solution198();
        assertEquals(0, solution198.rob(homes));
    }

    @Test
    public void homesToRob1is1() {
        int[] homes = {1};
        Solution198 solution198 = new Solution198();
        assertEquals(1, solution198.rob(homes));
    }

    @Test
    public void homesToRob3is4() {
        int[] homes = {2, 3, 2};
        Solution198 solution198 = new Solution198();
        assertEquals(4, solution198.rob(homes));
    }

    @Test
    public void homesToRob4is4() {
        int[] homes = {2, 1, 1, 2};
        Solution198 solution198 = new Solution198();
        assertEquals(4, solution198.rob(homes));
    }

    @Test
    public void homesToRob4is5() {
        int[] homes = {1, 2, 4, 1};
        Solution198 solution198 = new Solution198();
        assertEquals(5, solution198.rob(homes));
    }

    @Test
    public void homesToRob5is4() {
        int[] homes = {2, 1, 1, 2, 2};
        Solution198 solution198 = new Solution198();
        assertEquals(5, solution198.rob(homes));
    }

    @Test
    public void homesToRob5is6() {
        int[] homes = {2, 1, 2, 1, 2};
        Solution198 solution198 = new Solution198();
        assertEquals(6, solution198.rob(homes));
    }

    @Test
    public void homesToRob6is19() {
        int[] homes = {2, 4, 8, 9, 9, 3};
        Solution198 solution198 = new Solution198();
        assertEquals(19, solution198.rob(homes));
    }
}
