package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution202.
 */
public class Solution202Test {
    @Test
    public void number1isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(1));
    }

    @Test
    public void number2isNotHappy() {
        Solution202 solution202 = new Solution202();
        assertFalse(solution202.isHappy(2));
    }

    @Test
    public void number7isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(7));
    }

    @Test
    public void number10isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(10));
    }

    @Test
    public void number13isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(13));
    }

    @Test
    public void number19isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(19));
    }

    @Test
    public void number998isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(998));
    }

    @Test
    public void number999isNotHappy() {
        Solution202 solution202 = new Solution202();
        assertFalse(solution202.isHappy(999));
    }

    @Test
    public void number1000isHappy() {
        Solution202 solution202 = new Solution202();
        assertTrue(solution202.isHappy(1000));
    }
}
