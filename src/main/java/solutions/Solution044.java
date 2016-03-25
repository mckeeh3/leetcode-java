package solutions;

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
                    pos = input.indexOf(e);
                    if (pos == 0) {
                        e.span = !e.isSpanLimited() ? e.max : e.text.length() + e.min;
                        input.trim(e);
                    }
                } else if (e.prev == null) {
                    pos = input.indexOf(e);
                    if (pos == 0) {
                        e.span = e.text.length() + e.min;
                        input.trim(e);
                    }
                } else if (e.next == null) {
                    pos = input.indexOf(e);
                    if (pos == 0) {
                        e.span = e.text.length() + e.min;
                        input.trim(e);
                    } else if (pos > 0) {
                        if (!e.prev.isSpanLimited()) {
                            e.span = e.text.length() + e.min;
                            e.prev.span += pos;
                            input.trim(e);
                        }
                    }
                } else if (e.prev.isSpanLimited()) {
                    pos = input.indexOf(e);
                    if (pos == 0) {
                        e.span = e.text.length() + e.min;
                        input.trim(e);
                    }
                } else if (!e.next.text.isEmpty()) {
                    if (e.isSpanLimited()) {
                        pos = input.indexOf(e);
                        if (pos >= 0) {
                            e.span = e.text.length() + e.min;
                            e.prev.span += pos;
                            input.trim(e);
                        }
                    } else {
                        pos = input.indexOf(e);
                        if (pos >= 0) {
                            posNext = pos + e.text.length() + e.min;
                            posNext = input.text(e.next).indexOf(e.next.text, posNext);
                            if (posNext >= pos + e.text.length() + e.min) {
                                e.span = e.text.length() + e.min;
                                e.prev.span += pos;
                                input.trim(e);
                            }
                        }
                    }
                }
            } else if (e != null) {
                if (e.prev == null && e.next == null) {
                    if (e.isSpanLimited() && e.min <= input.text().length()) {
                        e.span = e.min;
                        input.trim(e);
                    } else if (!e.isSpanLimited() && e.min <= input.text().length()) {
                        e.span = input.text().length();
                        input.trim(e);
                    }
                } else if (e.min <= input.text().length()) {
                    e.span = e.min;
                    input.trim(e);
                }
            }
        }

        static Expressions expressions(String regex) {
            Expressions es = new Expressions();
            int pos = 0;
            regex = regex == null ? "" : regex;

            while (pos < regex.length()) {
                String text = "";
                int max = 0;
                int min = 0;
                while (pos < regex.length() && regex.charAt(pos) != '*' && regex.charAt(pos) != '?') {
                    text += regex.charAt(pos++);
                }
                while (pos < regex.length() && (regex.charAt(pos) == '*' || regex.charAt(pos) == '?')) {
                    if (regex.charAt(pos++) == '*') {
                        max = Integer.MAX_VALUE;
                    } else {
                        min++;
                    }
                }
                es.add(new Expression(text, min, max));
            }
            return es;
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
            return String.format("%s[%s, %d, %d, %d]", getClass().getSimpleName(), text, min, max, span);
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

        int indexOf(Expression e) {
            int pos = 0;
            if (e.isSpanLimited() && e.prev != null && !e.prev.isSpanLimited() && e.next != null) {
                pos = text(e).indexOf(e.text, pos);
                while (pos >= 0 && text(e).indexOf(e.next.text, pos + e.text.length() + e.min) < 0) {
                    pos = text(e).indexOf(e.text, pos + 1);
                }
            } else if (e.prev != null && !e.prev.isSpanLimited() && e.next == null) {
                pos = text(e).lastIndexOf(e.text);
            } else {
                pos = text(e).indexOf(e.text);
            }
            return pos;
        }

        void trim(Expression e) {
            if (e.next == null && !e.isSpanLimited()) {
                beg = end;
            } else {
                beg += Math.min(e.span, end);
                beg = e.span;
                while (e.prev != null) {
                    e = e.prev;
                    beg += e.span;
                }
            }
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
