package solutions;

/**
 * Given an integer, convert it to a roman numeral.
 * <p>Input is guaranteed to be within the range from 1 to 3999.</p>
 *
 * @see <a href="https://leetcode.com/problems/integer-to-roman/">12. Integer to Roman</a>
 */
public class Solution012 {
    public String intToRoman(int num) {
        if (num < 0 || num > 3999) {
            return "";
        }
        return thousands(num) + hundreds(num) + tens(num) + ones(num);
    }

    private String ones(int num) {
        String numeral = "";
        int digit = num % 10;
        switch (digit) {
            case 0: numeral = ""; break;
            case 1: numeral = "I"; break;
            case 2: numeral = "II"; break;
            case 3: numeral = "III"; break;
            case 4: numeral = "IV"; break;
            case 5: numeral = "V"; break;
            case 6: numeral = "VI"; break;
            case 7: numeral = "VII"; break;
            case 8: numeral = "VIII"; break;
            case 9: numeral = "IX"; break;
        }
        return numeral;
    }

    private String tens(int num) {
        String numeral = "";
        int digit = num / 10 % 10;
        switch (digit) {
            case 0: numeral = ""; break;
            case 1: numeral = "X"; break;
            case 2: numeral = "XX"; break;
            case 3: numeral = "XXX"; break;
            case 4: numeral = "XL"; break;
            case 5: numeral = "L"; break;
            case 6: numeral = "LX"; break;
            case 7: numeral = "LXX"; break;
            case 8: numeral = "LXXX"; break;
            case 9: numeral = "XC"; break;
        }
        return numeral;
    }

    private String hundreds(int num) {
        String numeral = "";
        int digit = num / 100 % 10;
        switch (digit) {
            case 0: numeral = ""; break;
            case 1: numeral = "C"; break;
            case 2: numeral = "CC"; break;
            case 3: numeral = "CCC"; break;
            case 4: numeral = "CD"; break;
            case 5: numeral = "D"; break;
            case 6: numeral = "DC"; break;
            case 7: numeral = "DCC"; break;
            case 8: numeral = "DCCC"; break;
            case 9: numeral = "CM"; break;
        }
        return numeral;
    }

    private String thousands(int num) {
        String numeral = "";
        int digit = num / 1000 % 10;
        switch (digit) {
            case 0: numeral = ""; break;
            case 1: numeral = "M"; break;
            case 2: numeral = "MM"; break;
            case 3: numeral = "MMM"; break;
        }
        return numeral;
    }
}
