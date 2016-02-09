package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Given numRows, generate the first numRows of Pascal's triangle.
 */
public class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> solution = new ArrayList<List<Integer>>(numRows);
        int previous;
        int current;

        for (int row = 0; row < numRows; row++) {
            createRow(row, solution);
            previous = 0;
            for (int cell = 0; cell < row + 1; cell++) {
                current = solution.get(row).get(cell);
                if (cell > 0 && cell < solution.get(row).size() - 1) {
                    solution.get(row).set(cell, previous + solution.get(row).get(cell));
                }
                previous = current;
            }
        }
        return solution;
    }

    private void createRow(int row, List<List<Integer>> solution) {
        solution.add(new ArrayList<Integer>(row + 1));
        if (row == 0) {
            solution.get(row).add(1);
        } else {
            for (int cell = 0; cell < solution.get(row - 1).size(); cell++) {
                solution.get(row).add(solution.get(row - 1).get(cell));
            }
            solution.get(row).add(1);
        }
    }
}
