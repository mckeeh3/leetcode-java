package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement regular expression matching with support for '.' and '*'.
 * <p>'.' Matches any single character.<br>
 * '*' Matches zero or more of the preceding element.</p>
 * <p>The matching should cover the entire input string (not partial).</p>
 *
 * @see <a href="https://leetcode.com/problems/regular-expression-matching/">10. Regular Expression Matching</a>
 */
public class Solution010 {
    public boolean isMatch(String s, String p) {
        return areStringAndPatternEmpty(s, p) || Pattern.matches(p, s);
    }

    private boolean areStringAndPatternEmpty(String s, String p) {
        return (s == null || s.trim().isEmpty()) && (p == null || p.trim().isEmpty());
    }

    private static class Pattern {
        private static boolean matches(String regex, String input) {
            int regexPos = 0;
            int inputPos = 0;

            return matches(parse(regex), regexPos, input, inputPos);
        }

        private static boolean matches(List<String> regExpressions, int regexPos, String input, int inputPos) {
            if (regexPos < regExpressions.size()) {
                String regex = regExpressions.get(regexPos);
                if (".*".equals(regex)) {
                    return matchesDotStar(regExpressions, regexPos, input, inputPos);
                } else if (".".equals(regex)) {
                    return matchesDot(regExpressions, regexPos, input, inputPos);
                } else if (regex.endsWith("*")) {
                    return matchesStar(regExpressions, regexPos, input, inputPos);
                } else {
                    return matchesText(regExpressions, regexPos, input, inputPos);
                }
            } else {
                return inputPos >= input.length();
            }
        }

        private static boolean matchesDotStar(List<String> regExpressions, int regexPos, String input, int inputPos) {
            boolean matches = matches(regExpressions, regexPos + 1, input, inputPos);

            if (matches) {
                return true;
            } else if (inputPos < input.length()) {
                while (!matches && inputPos < input.length()) {
                    matches = matches(regExpressions, regexPos + 1, input, ++inputPos);
                }
                return matches;
            } else {
                return regexPos >= regExpressions.size() - 1;
            }
        }

        private static boolean matchesDot(List<String> regExpressions, int regexPos, String input, int inputPos) {
            return inputPos < input.length() && matches(regExpressions, regexPos + 1, input, inputPos + 1);
        }

        private static boolean matchesStar(List<String> regExpressions, int regexPos, String input, int inputPos) {
            boolean matches = matches(regExpressions, regexPos + 1, input, inputPos);

            if (matches) {
                return true;
            } else if (inputPos < input.length()) {
                char matchChar = regExpressions.get(regexPos).charAt(0);

                while (!matches && inputPos < input.length() && matchChar == input.charAt(inputPos)) {
                    matches = matches(regExpressions, regexPos + 1, input, ++inputPos);
                }
                return matches;
            } else {
                return regexPos >= regExpressions.size() - 1;
            }
        }

        private static boolean matchesText(List<String> regExpressions, int regexPos, String input, int inputPos) {
            if (inputPos < input.length()) {
                String text = regExpressions.get(regexPos);
                boolean matches = input.length() >= inputPos + text.length()
                        && text.equals(input.substring(inputPos, inputPos + text.length()));
                return matches && matches(regExpressions, regexPos + 1, input, inputPos + text.length());
            } else {
                return false;
            }
        }

        private static List<String> parse(String regex) {
            List<String> regularExpressions = new ArrayList<>();
            int pos = 0;
            String text = "";

            while (pos < regex.length()) {
                if (regex.substring(pos).startsWith(".*")) {
                    if (!text.isEmpty()) {
                        regularExpressions.add(text);
                        text = "";
                    }
                    regularExpressions.add(".*");
                    pos++;
                } else if (regex.charAt(pos) == '.') {
                    if (!text.isEmpty()) {
                        regularExpressions.add(text);
                        text = "";
                    }
                    regularExpressions.add(".");
                } else if (regex.charAt(pos) == '*') {
                    if (text.length() > 1) {
                        regularExpressions.add(text.substring(0, text.length() - 1));
                        regularExpressions.add(text.substring(text.length() - 1) + "*");
                    } else {
                        regularExpressions.add(text + "*");
                    }
                    text = "";
                } else {
                    text += regex.charAt(pos);
                }
                pos++;
            }

            if (!text.isEmpty()) {
                regularExpressions.add(text);
            }

            return regularExpressions;
        }
    }
}
