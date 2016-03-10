package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p>A mapping of digit to letters (just like on the telephone buttons) is given below.</p>
 *
 * @see
 * <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/">17. Letter Combinations of a Phone Number</a>
 */
public class Solution017 {
    private Map<Character, Character[]> digitLetters;

    public List<String> letterCombinations(String digits) {
        List<String> answser = new ArrayList<>();
        if (digits == null || digits.trim().isEmpty()) {
            return answser;
        }

        digitLetters = loadDigitLetters();

        answser.addAll(lettersForDigit(0, digits.toCharArray(), ""));
        return answser;
    }

    private List<String> lettersForDigit(int digit, char[] digits, String letters) {
        List<String> result = new ArrayList<>();
        if (digit < digits.length) {
            for (char letter : digitLetters.get(digits[digit])) {
                result.addAll(lettersForDigit(digit + 1, digits, letters + letter));
            }
        } else {
            result.add(letters);
        }
        return result;
    }

    private Map<Character, Character[]> loadDigitLetters() {
        Map<Character, Character[]> digitLetters = new HashMap<>();
        digitLetters.put('0', letters());
        digitLetters.put('1', letters());
        digitLetters.put('2', letters('a', 'b', 'c'));
        digitLetters.put('3', letters('d', 'e', 'f'));
        digitLetters.put('4', letters('g', 'h', 'i'));
        digitLetters.put('5', letters('j', 'k', 'l'));
        digitLetters.put('6', letters('m', 'n', 'o'));
        digitLetters.put('7', letters('p', 'q', 'r', 's'));
        digitLetters.put('8', letters('t', 'u', 'v'));
        digitLetters.put('9', letters('w', 'x', 'y', 'z'));

        return digitLetters;
    }

    private Character[] letters(char... chars) {
        Character[] letters = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            letters[i] = chars[i];
        }
        return letters;
    }
}
