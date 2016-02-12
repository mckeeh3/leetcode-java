package solutions;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution278.
 */
public class Solution278Test {
    @Test
    public void firstBadVersionWitOddBadVersionStartingEvenAmountAfter() {
        int badVersion = 47;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion + 10) == badVersion);
    }

    @Test
    public void firstBadVersionWitOddBadVersionStartingOneAfter() {
        int badVersion = 47;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion + 1) == badVersion);
    }

    @Test
    public void firstBadVersionWitOddBadVersionAtLast() {
        int badVersion = 47;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion) == badVersion);
    }

    @Test
    public void firstBadVersionWitEvenBadVersionStartingEvenAmountAfter() {
        int badVersion = 42;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion + 10) == badVersion);
    }

    @Test
    public void firstBadVersionWitEvenBadVersionStartingOneAfter() {
        int badVersion = 42;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion + 1) == badVersion);
    }

    @Test
    public void firstBadVersionWitEvenBadVersionAtLast() {
        int badVersion = 42;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion) == badVersion);
    }

    @Test
    public void firstBadVersionWitBadVersionStartingAtOne() {
        int badVersion = 1;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(badVersion + 1) == badVersion);
    }

    @Test
    public void firstBadVersionWitBadVersionIs3StartingAt4() {
        int badVersion = 3;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(4) == badVersion);
    }

    @Test
    public void firstBadVersionWitBadVersionIs2StartingAt4() {
        int badVersion = 2;
        Solution278 solution278 = new Solution278(badVersion);

        assertTrue(solution278.firstBadVersion(4) == badVersion);
    }
}
