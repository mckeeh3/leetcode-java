package solutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 *
 * @see <a href="https://leetcode.com/problems/generate-parentheses/">22. Generate Parentheses</a>
 */
public class Solution022 {
    public List<String> generateParenthesis(int n) {
        List<String> answer = new ArrayList<>();
        answer.addAll(generateParenthesis(n - 1, "()"));
        return answer;
    }

    private Set<String> generateParenthesis(int n, String expression) {
        Set<String> answer = new HashSet<>();
        int pos = 0;

        if (n > 0) {
            while ((pos = expression.indexOf("()", pos)) >= 0) {
                answer.addAll(generateParenthesis(n - 1, insertParenthesesAt(pos, expression, "()")));
                answer.addAll(generateParenthesis(n - 1, insertParenthesesAt(pos, expression, ")(")));
                pos += 2;
            }
        } else {
            answer.add(expression);
        }
        return answer;
    }

    private String insertParenthesesAt(int pos, String expression, String parentheses) {
        return expression.substring(0, pos + 1) + parentheses + expression.substring(pos + 1);
    }
}
