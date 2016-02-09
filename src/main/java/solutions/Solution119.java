package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.
 *
 * @see <a href="https://leetcode.com/problems/range-sum-query-immutable/">303. Range Sum Query - Immutable</a>
 */
public class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> solution = new ArrayList<Integer>(rowIndex);
        int previous;
        int current;

        for (int row = 0; row <= rowIndex; row++) {
            solution.add(1);
            previous = 0;
            for (int cell = 0; cell < row + 1; cell++) {
                current = solution.get(cell);
                if (cell > 0 && cell < solution.size() - 1) {
                    solution.set(cell, previous + solution.get(cell));
                }
                previous = current;
            }
        }
        return solution;
    }
}
