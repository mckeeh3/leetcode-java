package solutions;

/**
 * Convert a non-negative integer to its english words representation. Given input is guaranteed to be less than
 * 2<sup>31</sup> - 1.
 *
 * @see <a href="https://leetcode.com/problems/integer-to-english-words/">273. Integer to English Words</a>
 */
public class Solution273 {
    public String numberToWords(int num) {
        String answer = billions(num) + millions(num) + thousands(num) + hundreds(num);
        return cleanUp(answer);
    }

    private String billions(int num) {
        int billions = num / 1000000000 % 1000;
        if (billions > 0) {
            return hundreds(billions) + " Billion";
        }
        return "";
    }

    private String millions(int num) {
        int millions = num / 1000000 % 1000;
        if (millions > 0) {
            return hundreds(millions) + " Million";
        } else {
            return "";
        }
    }

    private String thousands(int num) {
        int thousands = num / 1000 % 1000;
        if (thousands > 0) {
            return hundreds(thousands) + " Thousand";
        } else {
            return "";
        }
    }

    private String hundreds(int num) {
        int hundreds = (num % 1000) / 100;
        String tens = tens(num);
        return (hundreds > 0 ? ones(hundreds) + " Hundred" : "") + (tens.isEmpty() ? "" : " " + tens);
    }

    private String tens(int num) {
        int tens = num % 100;
        String[] tensWords = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String[] teensWords = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen",
                "Eighteen", "Nineteen"};

        if (tens < 20 && tens >= 10) {
            return " " + teensWords[tens - 10];
        } else {
            String ones = ones(num);
            return " " + tensWords[num % 100 / 10] + ones;
        }
    }

    private String ones(int num) {
        String[] onesWords = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        if (num == 0) {
            return " Zero";
        } else {
            return " " + onesWords[num % 10];
        }
    }

    private String cleanUp(String answer) {
        int pos;
        while ((pos = answer.indexOf("  ")) >= 0) {
            answer = answer.substring(0, pos) + answer.substring(pos + 1);
        }
        return answer.trim();
    }
}
