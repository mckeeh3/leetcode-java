package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution010.
 */
public class Solution010Test {
    @Test
    public void isNotMatch_aa_a() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("aa", "a"));
    }

    @Test
    public void isMatch_aa_aa() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aa", "aa"));
    }

    @Test
    public void isNotMatch_aaa_aa() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("aaa", "aa"));
    }

    @Test
    public void isNotMatch_aaa_aaaa() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("aaa", "aaaa"));
    }

    @Test
    public void isMatch_aa_aStar() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aa", "a*"));
    }

    @Test
    public void isMatch_a_bStar() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("a", "ab*"));
    }

    @Test
    public void isMatch_aa_Dot_a() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aa", ".a"));
    }

    @Test
    public void isMatch_a_DotStar() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("a", ".*"));
    }

    @Test
    public void isMatch_a_DotStar2() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("ab", ".*"));
    }

    @Test
    public void isMatch_aa_DotStar() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aa", ".*"));
    }

    @Test
    public void isMatchDotStar() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aaa", ".*"));
    }

    @Test
    public void isMatch_aab_cStar_aStar_b() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aab", "c*a*b"));
    }

    @Test
    public void isMatch_aStar_a() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aaa", "a*a"));
    }

    @Test
    public void isMatch_aaStar_aaa() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aaaaa", "aa*aaa"));
    }

    @Test
    public void isMatch_abStar_acStar_a() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aaa", "ab*ac*a"));
    }

    @Test
    public void isMatch_abStar_aStar_cStar_a() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("aaa", "ab*a*c*a"));
    }

    @Test
    public void isMatchDotStar_aStar_a() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("bbbba", ".*a*a"));
    }

    @Test
    public void isMatchDotStar_aStarDotDot() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("ab", ".*.."));
    }

    @Test
    public void isMatch_cStar_cStar() {
        Solution010 solution010 = new Solution010();
        assertTrue(solution010.isMatch("", "c*c*"));
    }

    @Test
    public void isNotMatch_abStar_a() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("aaa", "ab*a"));
    }

    @Test
    public void isNotMatch_abStar_a2() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("a", "ab*a"));
    }

    @Test
    public void isNotMatchDotStar_aStarDotDot_aStar() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("a", ".*..a*"));
    }

    @Test
    public void isNotMatch_bDotStar_c() {
        Solution010 solution010 = new Solution010();
        assertFalse(solution010.isMatch("b", "b.*c"));
    }
}
