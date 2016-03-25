package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution044.
 */
public class Solution044Test {
    @Test
    public void isMatchNullInputNullRegex() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch(null, null));
    }

    @Test
    public void isMatchNullInputEmptyRegex() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch(null, ""));
    }

    @Test
    public void isMatchEmptyInputNullRegex() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("", null));
    }

    @Test
    public void isMatchEmptyInputEmptyRegex() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("", ""));
    }

    @Test
    public void isMatchEmptyInputEmptyStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("", "*"));
    }

    @Test
    public void isMatchSingle() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("b", "?"));
    }

    @Test
    public void isNotMatchStar_a() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("ab", "*a"));
    }

    @Test
    public void isNotMatch_a() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("aa", "a"));
    }

    @Test
    public void isMatch_aa() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("aa", "aa"));
    }

    @Test
    public void isNotMatch_aa() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("aaa", "aa"));
    }

    @Test
    public void isMatchStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("aa", "*"));
    }

    @Test
    public void isMatch_aStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("aa", "a*"));
    }

    @Test
    public void isMatchQuestionStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("ab", "?*"));
    }

    @Test
    public void isMatchStar_bStar_Questions2Star() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("bbbbba", "*b*??*"));
    }

    @Test
    public void isMatchMixOfStarsQuestions1() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("abbabbabbabb", "a***?**?*bb*bb"));
    }

    @Test
    public void isNotMatch_cStar_aStar_b() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("aab", "c*a*b"));
    }

    @Test
    public void isMatchQuestion_bStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("abbb", "?b*"));
    }

    @Test
    public void isMatch_aQuestion_bStar_b() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("abbb", "a?b*b"));
    }

    @Test
    public void isMatchStar_bQuestion_aStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("baaab", "*b?a*"));
    }

    @Test
    public void isMatch_abStar_cdQuestion_iStar_de() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("abefcdgiescdfimde", "ab*cd?i*de"));
    }

    @Test
    public void isMatchStar_aStar() {
        Solution044 solution044 = new Solution044();
        assertTrue(solution044.isMatch("bac", "*a*"));
    }

    @Test
    public void isNotMatch_aQuestion_deStar() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("abcdef", "a?de*"));
    }

    @Test
    public void isNotMatchQuestionStarQuestion() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("b", "?*?"));
    }

    @Test
    public void isNotMatch_a7Stars_b() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));
    }

    @Test
    public void isNotMatchLongRegex1() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch
                ("abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb",
                        "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb" +
                                "*bb**a*b*bb"));
    }

    @Test
    public void isNotMatchLongRegex2() {
        Solution044 solution044 = new Solution044();
        assertFalse(solution044.isMatch
                ("baaabbabbbaabbbbbbabbbaaabbaabbbbbaaaabbbbbabaaaaabbabbaabaaababaabaaabaaaabbabbbaabbbbbaababbbabaaabaabaaabbbaababaaabaaabaaaabbabaabbbabababbbbabbaaababbabbaabbaabbbbabaaabbababbabababbaabaabbaaabbba",
                        "*b*ab*bb***abba*a**ab***b*aaa*a*b****a*b*bb**b**ab*ba**bb*bb*baab****bab*bbb**a*a*aab*b****b" +
                                "**ba**abba"));
    }
}
