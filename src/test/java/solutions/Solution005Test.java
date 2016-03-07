package solutions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests Solution005.
 */
public class Solution005Test {
    @Test
    public void palindromeIn_abb_is_bb() {
        Solution005 solution005 = new Solution005();
        assertTrue("bb".equals(solution005.longestPalindrome("abb")));
    }

    @Test
    public void palindrome_qahaq() {
        Solution005 solution005 = new Solution005();
        assertTrue("qahaq".equals(solution005.longestPalindrome("qahaq")));
    }

    @Test
    public void palindrome_racecar() {
        Solution005 solution005 = new Solution005();
        assertTrue("racecar".equals(solution005.longestPalindrome("racecar")));
    }

    @Test
    public void palindromeIn_stackcatssteponnopetstacocat_is_steponnopets() {
        Solution005 solution005 = new Solution005();
        assertTrue("steponnopets".equals(solution005.longestPalindrome("stackcatssteponnopetstacocat")));
    }

    @Test
    public void palindromeInStringOf824is_qahaq() {
        Solution005 solution005 = new Solution005();
        String text =
                "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtusjhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkuaoegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqpvjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdjksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytetllzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctklpqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoihvjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjoumczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
        assertTrue("qahaq".equals(solution005.longestPalindrome(text)));
    }
}
