package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement wildcard pattern matching with support for '?' and '*'.
 * <p>'?' Matches any single character.<br>
 * '*' Matches any sequence of characters (including the empty sequence).</p>
 * <p>The matching should cover the entire input string (not partial).</p>
 *
 * @see <a href="https://leetcode.com/problems/wildcard-matching/">44. Wildcard Matching</a>
 */
public class Solution044 {
    public boolean isMatch(String s, String p) {
        return Pattern.matches(p, s);
    }

    static class Pattern {
        static boolean matches(String regex, String inputText) {
            Input input = new Input(inputText);
            return matches(expressions(regex), input) && input.text().isEmpty();
        }

        static boolean matches(Expressions expressions, Input input) {
            Expression e = expressions.head;
            position(input, e);

            while (e != null && e.span >= 0) {
                position(input, e = e.next);
            }
            return e == null;
        }

        static void position(Input input, Expression e) {
            int pos, posNext;
            if (e != null && !e.text.isEmpty()) {
                if (e.prev == null && e.next == null) {
                    pos = input.text(e).indexOf(e.text);
                    if (pos == 0) {
                        e.span = !e.isSpanLimited() ? e.max
                                : e.text.length() + e.min;
                        input.trimLeft(e.span);
                    }
                } else if (e.prev == null) {
                    pos = input.text(e).indexOf(e.text);
                    if (pos == 0) {
                        e.span = e.text.length() + e.min;
                        input.trimLeft(e.span);
                    }
                } else if (e.next == null) {
                    pos = e.prev.isSpanLimited()
                            ? input.text(e).indexOf(e.text)
                            : input.text(e).lastIndexOf(e.text);
                    if (pos == 0) {
                        e.span = e.text.length() + e.min;
                        if (e.isSpanLimited()) {
                            input.trimLeft(e.span);
                        } else {
                            input.trimAll();
                        }
                    } else if (pos > 0) {
                        if (!e.prev.isSpanLimited()) {
                            e.span = e.text.length() + e.min;
                            input.trimLeft(pos + e.span);
                            e.prev.span += pos;
                        }
                    }
                } else if (e.prev.isSpanLimited()) {
                    pos = input.text(e).indexOf(e.text);
                    if (pos == 0) {
                        e.span = e.text.length() + e.min;
                        input.trimLeft(e.span);
                    }
                } else if (!e.next.text.isEmpty()) {
                    if (e.isSpanLimited()) {
                        pos = input.text(e).indexOf(e.text);
                        if (pos == 0) {
                            e.span = e.text.length() + e.min;
                            input.trimLeft(e.span);
                        }
                    } else {
                        pos = input.text(e).indexOf(e.text);
                        if (pos >= 0) {
                            posNext = pos + e.text.length() + e.min;
                            posNext = input.text(e.next).indexOf(e.next.text, posNext);
                            if (posNext >= pos + e.text.length() + e.min) {
                                e.span = posNext;
                                e.prev.span += pos;
                                input.trimLeft(e.span);
                            }
                        }
                    }
                }
            } else if (e != null) {
                if (e.prev == null && e.next == null) {
                    if (e.isSpanLimited() && e.min <= input.text().length()) {
                        e.span = e.min;
                        input.trimLeft(e.span);
                    } else if (!e.isSpanLimited() && e.min <= input.text().length()) {
                        e.span = input.text().length();
                        input.trimAll();
                    }
                } else if (e.min <= input.text().length()) {
                    e.span = e.min;
                    input.trimLeft(e.span);
                }
            }
        }

        static Expressions expressions(String regex) {
            Expressions es = new Expressions();
            List<String> regularExpressions = parse(optimize(regex));
            String text = "";
            int max = 0;
            int min = 0;

            for (String r : regularExpressions) {
                if ("*".equals(r)) {
                    max = Integer.MAX_VALUE;
                } else if ("?".equals(r)) {
                    min++;
                } else if (text.isEmpty()) {
                    if (min > 0 || max > 0) {
                        es.add(new Expression(text, min, max == 0 ? min : max));
                        max = 0;
                        min = 0;
                    }
                    text = r;
                } else {
                    es.add(new Expression(text, min, max == 0 ? min : max));
                    text = r;
                    max = 0;
                    min = 0;
                }
            }

            if (!text.isEmpty() || !regularExpressions.isEmpty() && es.head == null) {
                es.add(new Expression(text, min, max == 0 ? min : max));
            }

            return es;
        }

        static List<String> parse(String regex) {
            List<String> regExs = new ArrayList<>();
            int pos = 0;
            String text = "";

            while (pos < regex.length()) {
                if (regex.substring(pos).startsWith("?")) {
                    if (!text.isEmpty()) {
                        regExs.add(text);
                        text = "";
                    }
                    regExs.add("?");
                } else if (regex.charAt(pos) == '*') {
                    if (!text.isEmpty()) {
                        regExs.add(text);
                        text = "";
                    }
                    regExs.add("*");
                } else {
                    text += regex.charAt(pos);
                }
                pos++;
            }

            if (!text.isEmpty()) {
                regExs.add(text);
            }

            return regExs;
        }

        static String optimize(String regex) {
            regex = regex == null ? "" : regex;
            while (regex.contains("*?")) {
                regex = regex.replace("*?", "?*");
            }
            while (regex.contains("**")) {
                regex = regex.replace("**", "*");
            }
            return regex;
        }
    }

    static class Expressions {
        Expression head = null;
        Expression end = null;

        void add(Expression expression) {
            if (end == null) {
                head = end = expression;
            } else {
                end.next = expression;
                expression.prev = end;
                end = expression;
            }
        }

        @Override
        public String toString() {
            return String.format("%s[%s, %s]", getClass().getSimpleName(), head, end);
        }
    }

    static class Expression {
        final String text;
        final int min;
        final int max;
        int span = -1;
        Expression prev;
        Expression next;

        Expression(String text, int min, int max) {
            this.text = text;
            this.min = min;
            this.max = max;
        }

        boolean isSpanLimited() {
            return !(max == Integer.MAX_VALUE);
        }

        @Override
        public String toString() {
            return String.format("%s[%s, %d, %d]", getClass().getSimpleName(), text, min, max);
        }
    }

    static class Input {
        final String input;
        int beg;
        int end;

        Input(String input) {
            this.input = input == null ? "" : input;
            beg = 0;
            end = this.input.length();
        }

        void trimLeft(int trim) {
            beg += Math.min(trim, end);
        }

        void trimAll() {
            beg = end;
        }

        String text() {
            return end - beg <= 0 ? "" : input.substring(beg, end);
        }

        String text(Expression e) {
            int trimEnd = e.text.isEmpty() ? end : end - e.min;
            return input.substring(beg, Math.max(beg, trimEnd));
        }

        @Override
        public String toString() {
            return String.format("%s[%s, %d, %d, %s]", getClass().getSimpleName(), text(), beg, end, input);
        }
    }
}
